package edu.escuelaing.are;

import java.util.Date;



public class Mensajes {
    private String mensaje;
    private Date date;

    public Mensajes(String info){
        this.mensaje =info;
        this.date = new Date();
    }

    public Mensajes(String info,Date date){
        this.mensaje =info;
        this.date = date;
    }

    public String getMensaje() {
        return mensaje;
    }

    public Date getDate() {
        return date;
    }

}