package es.corpme.sc.portfolio.entity;

import java.util.Date;

/**
 * Created by ahg on 4/2/18.
 */
public class Actividad {

    public int id;

    public String name;

    public Date startDate = new Date();

    public Date endDate = new Date();

    public int duration = 1;

    public int percentComplete = 0;

    public String dependencies;

    public Actividad(int id) {
        this.id = id;
    }
}
