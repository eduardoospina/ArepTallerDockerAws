package edu.escuelaing.are;

import java.util.Date;



public class Mensajes {
    private String info;
    private Date date;

    public Mensajes(String info){
        this.info=info;
        this.date = new Date();
    }

    public Mensajes(String info,Date date){
        this.info=info;
        this.date = date;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}