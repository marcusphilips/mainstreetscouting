package com.redtiesrobotics.scoutingapp.scoutingapp;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.bson.Document;

import java.util.Date;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static Scanner scan;
    private static String teamNumber;
    private static String competition;
    // Auto
    private static boolean crossedLineAuto;
    private static int numOfCubesToScaleAuto;
    private static int numOfCubesToPortalAuto;
    private static boolean cubesToFriendlySwitchAuto;
    private static boolean cubesToEnemySwitchAuto;
    // Tele-op
    private static int numOfCubesToScale;
    private static int numOfCubesToPortal;
    // -----------
    // these integer values have 3 choices 0 for yes 1 for no 2 for tried and failed
    private static int cubesToFriendlySwitch;
    private static int cubesToEnemySwitch;
    // -----------
    private static boolean usedPowerup;
    private static int numOfCubesForce;
    private static int numOfCubesLevitate;
    private static int numOfCubesBoost;
    private static boolean attemptedDefense;
    private static double secondsLeftWhenHeadedToRope;
    private static double secondsToGrapRope;
    private static double secondsToClimbRope;
    private static boolean climbedRope;
    private static String comment;
    private static double robotRating;
    private static int teamScore;
    private static Date date;

    public static void main( String[] args )
    {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("What database do you want to put info into?");
        String d = scan.nextLine();
        s();
        System.out.println("What competition do you want to put info into?");
        competition = scan.nextLine();
        RedTieMongo m = new RedTieMongo(d, competition);
        System.out.println("What team number do you want to put info into?");
        s();
        teamNumber = scan.nextLine();
        try{
            System.out.println("'true' or 'false', did the robot cross auto line?");
            s();
            crossedLineAuto = Boolean.parseBoolean(scan.nextLine());
        }catch(Exception ex){
            crossedLineAuto = false;
        }

        try{
            System.out.println("How many cubes were put to the scale in auto?");
            s();
            numOfCubesToScaleAuto = Integer.parseInt(scan.nextLine());
        }catch(Exception ex){
            numOfCubesToScaleAuto = 0;
        }
        try{
            System.out.println("How many cubes were put to the portal in auto?");
            s();
            numOfCubesToPortalAuto = Integer.parseInt(scan.nextLine());
        }catch(Exception ex){
            numOfCubesToPortalAuto = 0;
        }
        try{
            System.out.println("'true' or 'false', did the robot give cubes to the friendly switch?");
            s();
            cubesToFriendlySwitchAuto = Boolean.parseBoolean(scan.nextLine());
        }catch(Exception ex){
            cubesToFriendlySwitchAuto = false;
        }
        try{
            System.out.println("'true' or 'false', did the robot give cubes to the Enemy switch?");
            s();
            cubesToEnemySwitchAuto = Boolean.parseBoolean(scan.nextLine());
        }catch(Exception ex){
            cubesToEnemySwitchAuto = false;
        }
        try{
            System.out.println("How many cubes were put to the scale?");
            s();
            numOfCubesToScale = Integer.parseInt(scan.nextLine());
        }catch(Exception ex){
            numOfCubesToScale = 0;
        }
        try{
            System.out.println("How many cubes were put to the portal?");
            s();
            numOfCubesToPortal = Integer.parseInt(scan.nextLine());
        }catch(Exception ex){
            numOfCubesToPortal = 0;
        }
        try{
            System.out.println("Friendly Switch? 0 for yes 1 for no 2 for tried and failed ");
            s();
            cubesToFriendlySwitch = Integer.parseInt(scan.nextLine());
        }catch(Exception ex){
            cubesToFriendlySwitch = 1;
        }
        try{
            System.out.println("Enemy Switch? 0 for yes 1 for no 2 for tried and failed ");
            s();
            cubesToEnemySwitch = Integer.parseInt(scan.nextLine());
        }catch(Exception ex){
            cubesToEnemySwitch = 1;
        }
        try{
            System.out.println("'true' or 'false', did the robot do a Power Up (tm)?");
            s();
            usedPowerup = Boolean.parseBoolean(scan.nextLine());
        }catch(Exception ex){
            usedPowerup = false;
        }
        try{
            System.out.println("Number of Cubes in Force?");
            s();
            numOfCubesForce = Integer.parseInt(scan.nextLine());
        }catch(Exception ex){
            numOfCubesForce = 0;
        }
        try{
            System.out.println("Number of Cubes in Levitate?");
            s();
            numOfCubesLevitate = Integer.parseInt(scan.nextLine());
        }catch(Exception ex){
            numOfCubesLevitate = 0;
        }
        try{
            System.out.println("Number of Cubes in Boost?");
            s();
            numOfCubesBoost = Integer.parseInt(scan.nextLine());
        }catch(Exception ex){
            numOfCubesBoost = 0;
        }
        try{
            System.out.println("'true' or 'false', did the robot attempt defense?");
            s();
            attemptedDefense = Boolean.parseBoolean(scan.nextLine());
        }catch(Exception ex){
            attemptedDefense = false;
        }
        try{
            System.out.println("How many seconds were left when the robot was headed towards the rope?");
            s();
            secondsLeftWhenHeadedToRope = Double.parseDouble(scan.nextLine());
        }catch(Exception ex){
            secondsLeftWhenHeadedToRope = 0;
        }
        try{
            System.out.println("How many seconds were left when the robot was grabbing the rope?");
            s();
            secondsToGrapRope = Double.parseDouble(scan.nextLine());
        }catch(Exception ex){
            secondsToGrapRope = 0;
        }
        try{
            System.out.println("How many seconds were left when the robot was climbing the rope?");
            s();
            secondsToClimbRope = Double.parseDouble(scan.nextLine());
        }catch(Exception ex){
            secondsToClimbRope = 0;
        }
        try{
            System.out.println("'true' or 'false', did the robot climb the rope?");
            s();
            climbedRope = Boolean.parseBoolean(scan.nextLine());
        }catch(Exception ex){
            climbedRope = false;
        }
        try{
            System.out.println("Any comments");
            s();
            comment = scan.nextLine();
        }catch(Exception ex){
            comment = "No comment";
        }
        try{
            System.out.println("How would you rate the robot?");
            s();
            robotRating = Double.parseDouble(scan.nextLine());
        }catch(Exception ex){
            robotRating = 0;
        }
        try{
            System.out.println("What was the team score?");
            s();
            teamScore = Integer.parseInt(scan.nextLine());
        }catch(Exception ex){
            teamScore = 0;
        }
        Document match = new Document("_id", teamNumber)
                .append("competition", competition)
                .append("crossedLineAuto", crossedLineAuto)
                .append("numOfCubesToScaleAuto", numOfCubesToScaleAuto)
                .append("numOfCubesToPortalAuto", numOfCubesToPortalAuto)
                .append("cubesToFriendlySwitchAuto", cubesToFriendlySwitchAuto)
                .append("cubesToEnemySwitchAuto", cubesToEnemySwitchAuto)
                .append("numOfCubesToScale", numOfCubesToScale)
                .append("numOfCubesToPortal", numOfCubesToPortal)
                .append("cubesToFriendlySwitch", cubesToFriendlySwitch)
                .append("cubesToEnemySwitch", cubesToEnemySwitch)
                .append("usedPowerup", usedPowerup)
                .append("numOfCubesForce", numOfCubesForce)
                .append("numOfCubesLevitate", numOfCubesLevitate)
                .append("numOfCubesBoost", numOfCubesBoost)
                .append("attemptedDefense", attemptedDefense)
                .append("secondsLeftWhenHeadedToRope", secondsLeftWhenHeadedToRope)
                .append("secondsToGrapRope", secondsToGrapRope)
                .append("secondsToClimbRope", secondsToClimbRope)
                .append("climbedRope", climbedRope)
                .append("comment", comment)
                .append("robotRating", robotRating)
                .append("teamScore", teamScore);
        m.getCollection().insertOne(match);
    }
    public static void s(){
        scan = new Scanner(System.in);
    }

}
