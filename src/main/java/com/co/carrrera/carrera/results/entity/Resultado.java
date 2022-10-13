package com.co.carrrera.carrera.results.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "resultado")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Resultado {

    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "id_participante")
    private int idParticipante;

    @Column(name = "id_inscripcion")
    private int idInscripcion;

    @Column(name = "posicion_final")
    private int posicionFinal;

    @Column(name = "premio")
    private int premio;

    @Column(name = "detalle_premio")
    private String detallePremio;

}
