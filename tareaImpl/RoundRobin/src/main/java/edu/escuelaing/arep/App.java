package edu.escuelaing.arep;

import static spark.Spark.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

        port(getPort());
        staticFileLocation("/static");
        get("/", (req, res) -> {
            res.redirect( "index.html");
            return null;
        });

        post("/agregar", (request, response) -> {
            String nuevapalabra = request.queryParams("")
        });

        get("/resultados", (req, res) -> {
            res.status(200);
            res.type("application/json");
            return null;
        });
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 34999;
    }

}
