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
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567;
    }

}
