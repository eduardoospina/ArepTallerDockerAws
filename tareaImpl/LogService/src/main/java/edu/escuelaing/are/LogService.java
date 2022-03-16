package edu.escuelaing.are;

import com.google.gson.Gson;
import static spark.Spark.*;
import edu.escuelaing.are.ConectarMongoDB.*;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class LogService {



    public static void main(String[] args) {
        port(getPort());

        ConectarMongoDB conectar = new ConectarMongoDB();

        post("/agregar", (req, res) -> {
            String nuevaPalabra = req.queryParams("word");
            String resultado = conectar.insertarmensaje(nuevaPalabra);
            ArrayList<Mensajes> impresion = conectar.obtenerlos();
            System.out.println(impresion);

            return resultado;
        });
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 33870;

    }

}
