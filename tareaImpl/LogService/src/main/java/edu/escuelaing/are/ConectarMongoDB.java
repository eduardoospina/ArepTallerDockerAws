package edu.escuelaing.are;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

import java.util.ArrayList;
import java.util.Date;


public class ConectarMongoDB {

    private final MongoCollection<Document> coleciones;

    public ConectarMongoDB(){

        MongoClient mongodb = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        MongoDatabase basedeDatos = mongodb.getDatabase("logservices");
        coleciones = basedeDatos.getCollection("logservices");
    }

    public ArrayList<Mensajes> obtenerlos() {
        FindIterable findIterable = coleciones.find();
        ArrayList<Document> documents = new ArrayList<Document>();
        ArrayList<Mensajes> messages = new ArrayList<Mensajes>();
        findIterable.into(documents);
        for (Document doc : documents) {
            if (doc.get("info") != null && doc.get("date") != null) {
                messages.add(new Mensajes((String) doc.get("info"), (Date) doc.get("date")));
            }
        }
        return messages;
    }

    public void insertarmensaje(Mensajes message){
        Document document=new Document();
        document.put("info",message.getMensaje());
        document.put("date",message.getDate());
        coleciones.insertOne(document);
    }

}
