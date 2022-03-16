package edu.escuelaing.are;

import com.google.gson.Gson;
import static spark.Spark.*;
import edu.escuelaing.are.ConectarMongoDB.*;

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
            System.out.println("comprobar: " + nuevaPalabra);
            String resultado = conectar.insertarmensaje(nuevaPalabra);
            System.out.println(resultado);
            return resultado;
        });

        get("/messages", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return new Gson().toJson(conectar.obtenerlos());
        });

    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 38998;

    }

}
