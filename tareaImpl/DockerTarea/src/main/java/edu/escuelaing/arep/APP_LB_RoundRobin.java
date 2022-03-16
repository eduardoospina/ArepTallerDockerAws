package edu.escuelaing.arep;

import java.util.PriorityQueue;


public class APP_LB_RoundRobin {

    private final PriorityQueue  cola = new PriorityQueue<>();

    public APP_LB_RoundRobin() {
        cola.add("http://localhost:35001");
        cola.add("http://localhost:35002");
        cola.add("http://localhost:35003");
    }



}