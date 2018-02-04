package es.corpme.sc.portfolio.entity;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by ahg on 4/2/18.
 */
public class Planificacion {

    public int avance = 0;

    public Date startDate;

    public Date endDate;

    public List<Actividad> actividades = new ArrayList<>();

    public Date lineaBaseDate;

    public Planificacion lineaBase;

    private int planificacionId = 0;

    public int nextPlanificacionId() {
        return ++this.planificacionId;
    }
}
