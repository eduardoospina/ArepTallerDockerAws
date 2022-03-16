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

        APP_LB_RoundRobin roundrobin = new APP_LB_RoundRobin();

        port(getPort());
        staticFileLocation("/static");
        get("/", (req, res) -> {
            res.redirect( "index.html");
            return null;
        });

        post("/agregar", (request, response) -> {
            response.type("application/json");
            return roundrobin.enviarMensaje(request.queryParams("word"));
        });

    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 35666;
    }

}
