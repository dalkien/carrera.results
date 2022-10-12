package com.co.carrrera.carrera.results.endpoint;

import com.co.carrrera.carrera.results.entity.Resultado;
import com.co.carrrera.carrera.results.service.ResultadoService;
import io.spring.guides.gs_producing_web_service.CarreraRequest;
import io.spring.guides.gs_producing_web_service.CarreraResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import java.util.Optional;

/**
 * @Autor: Omar Madrigal
 * Clase encargada de realizar el direccionamiento al origen como endpoint
 */
@Endpoint
@Transactional
@Slf4j
public class CarreraResultsEndpoint {

    private final ResultadoService service;

    @Autowired
    public CarreraResultsEndpoint(ResultadoService service) {
        this.service = service;
    }

    /**
     * @Autor: Omar Madrigal
     * Methodo encargado de realizar la recepcion del mensaje soap y asimilarlo en el objeto del
     * request
     * @param carreraRequest
     * @return
     */
    @PayloadRoot(namespace = "http://spring.io/guides/gs-producing-web-service",
            localPart = "carreraRequest")
    @ResponsePayload
    public CarreraResponse employedRequest(@RequestPayload CarreraRequest carreraRequest){
        log.info("proceso ok => "+ carreraRequest.getCarrera().getIdParticipante());
        Optional<Resultado> resultado = service.consultarResultado(carreraRequest.getCarrera().getIdParticipante());
        return service.convertTypeToCarrera(resultado);

    }
}
