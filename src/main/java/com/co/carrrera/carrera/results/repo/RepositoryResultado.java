package com.co.carrrera.carrera.results.repo;

import com.co.carrrera.carrera.results.entity.Resultado;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RepositoryResultado extends JpaRepository<Resultado, Integer>, JpaSpecificationExecutor<Resultado> {

    //@Query(name = "findAllByIdParticiante", value = "select l from resultado l where id_participante =:id")
    List<Resultado> findAllByIdParticipante(int id);

}
