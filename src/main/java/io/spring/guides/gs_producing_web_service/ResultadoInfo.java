//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.3.2 
// Visite <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2022.10.06 a las 10:47:31 PM COT 
//


package io.spring.guides.gs_producing_web_service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resultadoInfo complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resultadoInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idParticipante" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="idInscripcion" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="posicionFinal" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="premio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="detallePremio" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resultadoInfo", propOrder = {
    "id",
    "idParticipante",
    "idInscripcion",
    "posicionFinal",
    "premio",
    "detallePremio"
})
public class ResultadoInfo {

    protected int id;
    protected int idParticipante;
    protected int idInscripcion;
    protected int posicionFinal;
    protected int premio;
    protected int detallePremio;

    /**
     * Obtiene el valor de la propiedad id.
     * 
     */
    public int getId() {
        return id;
    }

    /**
     * Define el valor de la propiedad id.
     * 
     */
    public void setId(int value) {
        this.id = value;
    }

    /**
     * Obtiene el valor de la propiedad idParticipante.
     * 
     */
    public int getIdParticipante() {
        return idParticipante;
    }

    /**
     * Define el valor de la propiedad idParticipante.
     * 
     */
    public void setIdParticipante(int value) {
        this.idParticipante = value;
    }

    /**
     * Obtiene el valor de la propiedad idInscripcion.
     * 
     */
    public int getIdInscripcion() {
        return idInscripcion;
    }

    /**
     * Define el valor de la propiedad idInscripcion.
     * 
     */
    public void setIdInscripcion(int value) {
        this.idInscripcion = value;
    }

    /**
     * Obtiene el valor de la propiedad posicionFinal.
     * 
     */
    public int getPosicionFinal() {
        return posicionFinal;
    }

    /**
     * Define el valor de la propiedad posicionFinal.
     * 
     */
    public void setPosicionFinal(int value) {
        this.posicionFinal = value;
    }

    /**
     * Obtiene el valor de la propiedad premio.
     * 
     */
    public int getPremio() {
        return premio;
    }

    /**
     * Define el valor de la propiedad premio.
     * 
     */
    public void setPremio(int value) {
        this.premio = value;
    }

    /**
     * Obtiene el valor de la propiedad detallePremio.
     * 
     */
    public int getDetallePremio() {
        return detallePremio;
    }

    /**
     * Define el valor de la propiedad detallePremio.
     * 
     */
    public void setDetallePremio(int value) {
        this.detallePremio = value;
    }

}
