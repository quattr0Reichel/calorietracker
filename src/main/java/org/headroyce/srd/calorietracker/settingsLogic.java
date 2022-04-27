package org.headroyce.srd.calorietracker;

public class settingsLogic {

    private int basicCals;
    private int netGoal;
    private int dailyCals;

    private boolean saved;

    private int weight;
    private int height;
    private int gender;
    private int age;

    public settingsLogic() {

        saved = false;
        basicCals = 2000;
        netGoal = 0;
        dailyCals = 2000;

        weight = 180;
        height = 67;

    }

    public int getDailyCals() {
        return this.dailyCals;
    }

    public void setSaved(boolean n) {
        this.saved = n;
    }

    public boolean isSaved() {
        return saved;
    }



}
