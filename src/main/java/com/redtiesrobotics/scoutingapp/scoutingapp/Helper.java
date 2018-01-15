package com.redtiesrobotics.scoutingapp.scoutingapp;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

public class Helper {

    public static MongoClient getInstance(){
        MongoClient m = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        return m;
    }

}
