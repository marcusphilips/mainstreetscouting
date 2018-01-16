package com.redtiesrobotics.scoutingapp.scoutingapp;

import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

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

    public void readDataBase(){

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
