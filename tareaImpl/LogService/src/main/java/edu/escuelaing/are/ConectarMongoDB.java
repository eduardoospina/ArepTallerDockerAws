package edu.escuelaing.are;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;


public class ConectarMongoDB {

    private final MongoCollection<Document> coleciones;

    public ConectarMongoDB(){

        MongoClient mongodb = new MongoClient(new MongoClientURI("mogodb://localhost:27017"));
        MongoDatabase basedeDatos = mongodb.getDatabase("logservices");
        coleciones = basedeDatos.getCollection("logservices");
    }

}
