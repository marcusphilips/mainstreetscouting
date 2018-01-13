package com.redtiesrobotics.scoutingapp.scoutingapp;
import java.util.*;
public class UnitOfData {
//    private String teamNumber;
//    private String competition;
//    // Auto
//    private boolean crossedLineAuto;
//    private int numOfCubesToScaleAuto;
//    private int numOfCubesToPortalAuto;
//    private boolean cubesToFriendlySwitchAuto;
//    private boolean cubesToEnemySwitchAuto;
//    // Tele-op
//    private int numOfCubesToScale;
//    private int numOfCubesToPortal;
//    // -----------
//    // these integer values have 3 choices 0 for yes 1 for no 2 for tried and failed
//    private int cubesToFriendlySwitch;
//    private int cubesToEnemySwitch;
//    // -----------
//    private boolean usedPowerup;
//    private int numOfCubesForce;
//    private int numOfCubesLevitate;
//    private int numOfCubesBoost;
//    private boolean attemptedDefense;
//    private double secondsLeftWhenHeadedToRope;
//    private double secondsToGrapRope;
//    private double secondsToClimbRope;
//    private boolean climbedRope;
//    private String comment;
//    private double robotRating;
//    private int teamScore;
//    private Date date;

    List<String> Datas = new ArrayList<>(24);
//    public UnitOfData(String teamNumber, String competition, boolean crossedLineAuto, int numOfCubesToScaleAuto,
//                      int numOfCubesToPortalAuto, boolean cubesToFriendlySwitchAuto, boolean cubesToEnemySwitchAuto,
//                      int numOfCubesToScale, int numOfCubesToPortal, int cubesToFriendlySwitch, int cubesToEnemySwitch,
//                      boolean usedPowerup, int numOfCubesForce, int numOfCubesLevitate, int numOfCubesBoost,
//                      boolean attemptedDefense, double secondsLeftWhenHeadedToRope, double secondsToGrapRope,
//                      double secondsToClimbRope, boolean climbedRope, String comment, double robotRating, int teamScore,
//                      Date date) {
//        this.teamNumber = teamNumber;
//        this.competition = competition;
//        this.crossedLineAuto = crossedLineAuto;
//        this.numOfCubesToScaleAuto = numOfCubesToScaleAuto;
//        this.numOfCubesToPortalAuto = numOfCubesToPortalAuto;
//        this.cubesToFriendlySwitchAuto = cubesToFriendlySwitchAuto;
//        this.cubesToEnemySwitchAuto = cubesToEnemySwitchAuto;
//        this.numOfCubesToScale = numOfCubesToScale;
//        this.numOfCubesToPortal = numOfCubesToPortal;
//        this.cubesToFriendlySwitch = cubesToFriendlySwitch;
//        this.cubesToEnemySwitch = cubesToEnemySwitch;
//        this.usedPowerup = usedPowerup;
//        this.numOfCubesForce = numOfCubesForce;
//        this.numOfCubesLevitate = numOfCubesLevitate;
//        this.numOfCubesBoost = numOfCubesBoost;
//        this.attemptedDefense = attemptedDefense;
//        this.secondsLeftWhenHeadedToRope = secondsLeftWhenHeadedToRope;
//        this.secondsToGrapRope = secondsToGrapRope;
//        this.secondsToClimbRope = secondsToClimbRope;
//        this.climbedRope = climbedRope;
//        this.comment = comment;
//        this.robotRating = robotRating;
//        this.teamScore = teamScore;
//        this.date = date;
//    }

    public UnitOfData(List<String> ls) {
//        this.teamNumber = (String) ls.get(0);
//        this.competition = (String) ls.get(1);
//        this.crossedLineAuto = boo(obj);
//        this.numOfCubesToScaleAuto = (Integer)(ls.get(3));
//        this.numOfCubesToPortalAuto = numOfCubesToPortalAuto;
//        this.cubesToFriendlySwitchAuto = cubesToFriendlySwitchAuto;
//        this.cubesToEnemySwitchAuto = cubesToEnemySwitchAuto;
//        this.numOfCubesToScale = numOfCubesToScale;
//        this.numOfCubesToPortal = numOfCubesToPortal;
//        this.cubesToFriendlySwitch = cubesToFriendlySwitch;
//        this.cubesToEnemySwitch = cubesToEnemySwitch;
//        this.usedPowerup = usedPowerup;
//        this.numOfCubesForce = numOfCubesForce;
//        this.numOfCubesLevitate = numOfCubesLevitate;
//        this.numOfCubesBoost = numOfCubesBoost;
//        this.attemptedDefense = attemptedDefense;
//        this.secondsLeftWhenHeadedToRope = secondsLeftWhenHeadedToRope;
//        this.secondsToGrapRope = secondsToGrapRope;
//        this.secondsToClimbRope = secondsToClimbRope;
//        this.climbedRope = climbedRope;
//        this.comment = comment;
//        this.robotRating = robotRating;
//        this.teamScore = teamScore;
//        this.date = date;
        for(int i = 0; i < 24; i++){
            Datas.add(ls.get(i));
        }
    }
    public static boolean boo(String str){
            if(str.equalsIgnoreCase("true")){
                return true;
            }else{
                if(str.equalsIgnoreCase("false")) {
                    return false;
                }else{
                    throw new StringIndexOutOfBoundsException("WTF did you just input??? Srayan!!??");
                }
            }
    }
//

//public String getTeamNumber() {

//return teamNumber;

//}

//public String getCompetition() {

//return competition;

//}

//public boolean isCrossedLineAuto() {

//return crossedLineAuto;

//}

//public int getNumOfCubesToScaleAuto() {

//return numOfCubesToScaleAuto;

//}

//public int getNumOfCubesToPortalAuto() {

//return numOfCubesToPortalAuto;

//}

//public boolean isCubesToFriendlySwitchAuto() {

//return cubesToFriendlySwitchAuto;

//}

//public boolean isCubesToEnemySwitchAuto() {

//return cubesToEnemySwitchAuto;

//}

//public int getNumOfCubesToScale() {

//return numOfCubesToScale;

//}

//public int getNumOfCubesToPortal() {

//return numOfCubesToPortal;

//}

//public int getCubesToFriendlySwitch() {

//return cubesToFriendlySwitch;

//}

//public int getCubesToEnemySwitch() {

//return cubesToEnemySwitch;

//}

//public boolean isUsedPowerup() {

//return usedPowerup;

//}

//public int getNumOfCubesForce() {

//return numOfCubesForce;

//}

//public int getNumOfCubesLevitate() {

//return numOfCubesLevitate;

//}

//public int getNumOfCubesBoost() {

//return numOfCubesBoost;

//}

//public boolean isAttemptedDefense() {

//return attemptedDefense;

//}

//public double getSecondsLeftWhenHeadedToRope() {

//return secondsLeftWhenHeadedToRope;

//}

//public double getSecondsToGrapRope() {

//return secondsToGrapRope;

//}

//public double getSecondsToClimbRope() {

//return secondsToClimbRope;

//}

//public boolean isClimbedRope() {

//return climbedRope;

//}

//public String getComment() {

//return comment;

//}

//public double getRobotRating() {

//return robotRating;

//}

//public int getTeamScore() {

//return teamScore;

//}

//public Date getDate() {

//return date;

//}

//public void setTeamNumber(String teamNumber) {

//this.teamNumber = teamNumber;

//}

//public void setCompetition(String competition) {

//this.competition = competition;

//}

//public void setCrossedLineAuto(boolean crossedLineAuto) {

//this.crossedLineAuto = crossedLineAuto;

//}

//public void setNumOfCubesToScaleAuto(int numOfCubesToScaleAuto) {

//this.numOfCubesToScaleAuto = numOfCubesToScaleAuto;

//}

//public void setNumOfCubesToPortalAuto(int numOfCubesToPortalAuto) {

//this.numOfCubesToPortalAuto = numOfCubesToPortalAuto;

//}

//public void setCubesToFriendlySwitchAuto(boolean cubesToFriendlySwitchAuto) {

//this.cubesToFriendlySwitchAuto = cubesToFriendlySwitchAuto;

//}

//public void setCubesToEnemySwitchAuto(boolean cubesToEnemySwitchAuto) {

//this.cubesToEnemySwitchAuto = cubesToEnemySwitchAuto;

//}

//public void setNumOfCubesToScale(int numOfCubesToScale) {

//this.numOfCubesToScale = numOfCubesToScale;

//}

//public void setNumOfCubesToPortal(int numOfCubesToPortal) {

//this.numOfCubesToPortal = numOfCubesToPortal;

//}

//public void setCubesToFriendlySwitch(int cubesToFriendlySwitch) {

//this.cubesToFriendlySwitch = cubesToFriendlySwitch;

//}

//public void setCubesToEnemySwitch(int cubesToEnemySwitch) {

//this.cubesToEnemySwitch = cubesToEnemySwitch;

//}

//public void setUsedPowerup(boolean usedPowerup) {

//this.usedPowerup = usedPowerup;

//}

//public void setNumOfCubesForce(int numOfCubesForce) {

//this.numOfCubesForce = numOfCubesForce;

//}

//public void setNumOfCubesLevitate(int numOfCubesLevitate) {

//this.numOfCubesLevitate = numOfCubesLevitate;

//}

//public void setNumOfCubesBoost(int numOfCubesBoost) {

//this.numOfCubesBoost = numOfCubesBoost;

//}

//public void setAttemptedDefense(boolean attemptedDefense) {

//this.attemptedDefense = attemptedDefense;

//}

//public void setSecondsLeftWhenHeadedToRope(double secondsLeftWhenHeadedToRope) {

//this.secondsLeftWhenHeadedToRope = secondsLeftWhenHeadedToRope;

//}

//public void setSecondsToGrapRope(double secondsToGrapRope) {

//this.secondsToGrapRope = secondsToGrapRope;

//}

//public void setSecondsToClimbRope(double secondsToClimbRope) {

//this.secondsToClimbRope = secondsToClimbRope;

//}

//public void setClimbedRope(boolean climbedRope) {

//this.climbedRope = climbedRope;

//}

//public void setComment(String comment) {

//this.comment = comment;

//}

//public void setRobotRating(double robotRating) {

//this.robotRating = robotRating;

//}

//public void setTeamScore(int teamScore) {

//this.teamScore = teamScore;

//}

//public void setDate(Date date) {

//this.date = date;

//}

//

//@Override

//public String toString() {

//return "UnitOfData{" +

//"teamNumber='" + teamNumber + '\'' +

//", competition='" + competition + '\'' +

//", crossedLineAuto=" + crossedLineAuto +

//", numOfCubesToScaleAuto=" + numOfCubesToScaleAuto +

//", numOfCubesToPortalAuto=" + numOfCubesToPortalAuto +

//", cubesToFriendlySwitchAuto=" + cubesToFriendlySwitchAuto +

//", cubesToEnemySwitchAuto=" + cubesToEnemySwitchAuto +

//", numOfCubesToScale=" + numOfCubesToScale +

//", numOfCubesToPortal=" + numOfCubesToPortal +

//", cubesToFriendlySwitch=" + cubesToFriendlySwitch +

//", cubesToEnemySwitch=" + cubesToEnemySwitch +

//", usedPowerup=" + usedPowerup +

//", numOfCubesForce=" + numOfCubesForce +

//", numOfCubesLevitate=" + numOfCubesLevitate +

//", numOfCubesBoost=" + numOfCubesBoost +

//", attemptedDefense=" + attemptedDefense +

//", secondsLeftWhenHeadedToRope=" + secondsLeftWhenHeadedToRope +

//", secondsToGrapRope=" + secondsToGrapRope +

//", secondsToClimbRope=" + secondsToClimbRope +

//", climbedRope=" + climbedRope +

//", comment='" + comment + '\'' +

//", robotRating=" + robotRating +

//", teamScore=" + teamScore +

//", date=" + date +

//'}';

//}

//

    @Override
    public String toString() {
        return "UnitOfData{" +
                "Datas=" + Datas +
                '}';
    }
}