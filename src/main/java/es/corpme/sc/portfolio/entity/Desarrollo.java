package es.corpme.sc.portfolio.entity;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.annotation.Id;
import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * Created by ahg on 4/2/18.
 */

public class Desarrollo {

    @Id
    public String id;

    @NotNull @NotEmpty(message = "El campo nombre es obligatorio")
    public String nombre;

    public Date fechaCreacion = new Date();

    @NotNull
    public String solicitadaPor = "ahg";

    @NotNull @Min(value = TipoDesarrollo.EVOLUTIVO, message = "El campo tipo es obligatorio")
    public int tipo = TipoDesarrollo.EVOLUTIVO;

    @NotNull @Min(value = ImportanciaDesarrollo.MEDIA, message = "El campo importancia es obligatorio")
    public int importancia = ImportanciaDesarrollo.MEDIA;

    @DateTimeFormat(iso= DateTimeFormat.ISO.DATE)
    public Date fechaCambioNormativo = null;

    @NotNull @NotEmpty(message = "El campo justificación de negocio es obligatorio")
    public String justificacionNegocio;

    @NotNull @NotEmpty(message = "El campo áreas involucradas es obligatorio")
    public String areasInvolucradas;

    @NotNull
    public int fase = FaseDesarrollo.BACKLOGDMO;

    public Planificacion planificacion = new Planificacion();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public String getSolicitadaPor() {
        return solicitadaPor;
    }

    public void setSolicitadaPor(String solicitadaPor) {
        this.solicitadaPor = solicitadaPor;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getImportancia() {
        return importancia;
    }

    public void setImportancia(int importancia) {
        this.importancia = importancia;
    }

    public Date getFechaCambioNormativo() {
        return fechaCambioNormativo;
    }

    public void setFechaCambioNormativo(Date fechaCambioNormativo) {
        this.fechaCambioNormativo = fechaCambioNormativo;
    }

    public String getJustificacionNegocio() {
        return justificacionNegocio;
    }


    public void setJustificacionNegocio(String justificacionNegocio) {
        this.justificacionNegocio = justificacionNegocio;
    }

    public int getFase() {
        return fase;
    }

    public void setFase(int fase) {
        this.fase = fase;
    }

    public String getAreasInvolucradas() {
        return areasInvolucradas;
    }

    public void setAreasInvolucradas(String areasInvolucradas) {
        this.areasInvolucradas = areasInvolucradas;
    }

    public Planificacion getPlanificacion() {
        return planificacion;
    }

    public void setPlanificacion(Planificacion planificacion) {
        this.planificacion = planificacion;
    }
}
