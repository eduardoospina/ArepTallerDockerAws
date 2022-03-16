package edu.escuelaing.arep;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.PriorityQueue;


public class APP_LB_RoundRobin {

    private final PriorityQueue  cola = new PriorityQueue<>();

    public APP_LB_RoundRobin() {
        cola.add("http://localhost:33870");
        cola.add("http://localhost:33870");
        cola.add("http://localhost:33870");
    }

    private String turnoCola() {
        String guesped = (String) cola.poll();
        cola.add(guesped);
        return guesped;
    }

    public String enviarMensaje (String nuevapalabra){
        try {
            URL URLE = new URL(turnoCola()+"/agregar?word="+nuevapalabra);
            HttpURLConnection conecionG = (HttpURLConnection) URLE.openConnection();
            conecionG.setRequestMethod("POST");
            if (conecionG.getResponseCode() != 200) {
                throw new RuntimeException("Fallo");
            }
            InputStreamReader in = new InputStreamReader(conecionG.getInputStream());
            BufferedReader br = new BufferedReader(in);
            String output;
            while ((output = br.readLine()) != null) {
                System.out.println(output);
            }
            conecionG.disconnect();

        } catch (Exception e) {
            System.out.println("Error al conectar");
        }
        return "";
    }

}