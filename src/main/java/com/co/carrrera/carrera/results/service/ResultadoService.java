package com.co.carrrera.carrera.results.service;

import com.co.carrrera.carrera.results.entity.Resultado;
import com.co.carrrera.carrera.results.repo.RepositoryResultado;
import io.spring.guides.gs_producing_web_service.CarreraResponse;
import io.spring.guides.gs_producing_web_service.ResultadoInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.Optional;

@Service
public class ResultadoService {

    private RepositoryResultado repositoryResultado;

    @Autowired
    public ResultadoService(RepositoryResultado repositoryResultado) {
        this.repositoryResultado = repositoryResultado;
    }

    public Optional<Resultado> consultarResultado(int id){

        Optional<Resultado> resultado = repositoryResultado.findAllByIdParticipante(id).stream()
            .max(Comparator.comparing(Resultado::getId));
        /*
        * 1 2 1 15 20000 xxxxx
        * 2 2 4 10 50000 xxxxx
        *
        * int max = 0;
        * for(int i = 0;  i < resultado.size(); i++){
        *     for(int j = i; j < resultado.size(); i++ ){
        *       if(resultado.get(i).getId() < resultado.get(j).getId() ){
        *           max = j;
        *       }
        *   }
        * }
        *
        * Optional<Resultado> resultado2 = Optional.of(resultado.get(j));
        * */

        return resultado;
    }

    public CarreraResponse convertTypeToCarrera(Optional<Resultado> resultado){
        CarreraResponse carreraResponse = new CarreraResponse();
        ResultadoInfo resultadoInfo = new ResultadoInfo();
        if (resultado.isPresent()){
            resultadoInfo.setId(resultado.get().getId());
            resultadoInfo.setIdParticipante(resultado.get().getIdParticipante());
            resultadoInfo.setIdInscripcion(resultado.get().getIdInscripcion());
            resultadoInfo.setPosicionFinal(resultado.get().getPosicionFinal());
            resultadoInfo.setPremio(resultado.get().getPremio());
            resultadoInfo.setDetallePremio(resultado.get().getDetallePremio());
            carreraResponse.setDatosResultado(resultadoInfo);
            carreraResponse.setCode("OK");
            carreraResponse.setMessage("Consulta Exitosa");
        }else {
            carreraResponse.setCode("NOK");
            carreraResponse.setMessage("Error!!!, No Existen Datos");
        }
        return carreraResponse;
    }

}
