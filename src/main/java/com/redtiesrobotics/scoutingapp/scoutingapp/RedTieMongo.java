package com.redtiesrobotics.scoutingapp.scoutingapp;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

import java.util.Iterator;

public class RedTieMongo {
    MongoClient mongoC;
    MongoDatabase database;
    MongoCollection collection;
    public RedTieMongo(){
        mongoC = Helper.getInstance();
        database = mongoC.getDatabase("SERN");
        collection = database.getCollection("Steins;Gate");

    }

    public RedTieMongo(String databas, String collectio) {
        mongoC = Helper.getInstance();
        this.database = mongoC.getDatabase(databas);
        this.collection = database.getCollection(collectio);
    }

    public void readDatabase(){
        // Creating Credentials
        MongoCredential credential;
        credential = MongoCredential.createCredential("valorzard", "PowerUp",
                "password".toCharArray());
        System.out.println("Connected to the database successfully");

        // Accessing the database
        MongoDatabase database = mongoC.getDatabase("myDb");

        // Retrieving a collection
        MongoCollection<Document> collection = database.getCollection("sampleCollection");
        System.out.println("Collection myCollection selected successfully");

        collection.updateOne(Filters.eq("id", 1), Updates.set("likes", 150));
        System.out.println("Document update successfully...");

        // Retrieving the documents after updation
        // Getting the iterable object
        FindIterable<Document> iterDoc = collection.find();
        int i = 1;

        // Getting the iterator
        Iterator it = iterDoc.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
            i++;
        }
    }

    public MongoClient getMongoC() {
        return mongoC;
    }

    public MongoDatabase getDatabase() {
        return database;
    }

    public void setDatabase(String db) {
        this.database  = mongoC.getDatabase(db);
    }

    public MongoCollection getCollection() {
        return collection;
    }

    public void setCollection(String c) {
        this.collection = database.getCollection(c);
    }
}
