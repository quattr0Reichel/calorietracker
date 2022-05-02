package org.headroyce.srd.calorietracker;

public class settingsLogic {

    private int basicCals;
    private int netGoal;
    private int dailyCals;

    private boolean saved;
    private boolean imperial;

    private double weight;
    private double height;
    private double age;
    //female = true, male = false
    private boolean sex;


    public settingsLogic() {

        saved = false;
        imperial = true;

        basicCals = 2000;
        netGoal = 0;
        dailyCals = 2000;

        weight = 180;
        height = 67;
        age = 40;

    }

    public void setSaved(boolean n) {
        this.saved = n;
    }
    public void setImperial(boolean n) {
        this.imperial = n;
    }



    public int getDailyCals() {
        return this.dailyCals;
    }
    public double getWeight() {
        return this.weight;
    }
    public double getHeight() {
        return this.height;
    }
    public double getAge() {
        return this.age;
    }
    public boolean getSex() {
        return this.sex;
    }

    public boolean setHeight(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0' || s.charAt(i) != '1' || s.charAt(i) != '2' || s.charAt(i) != '3' || s.charAt(i) != '4' || s.charAt(i) != '5'
                    || s.charAt(i) != '6'|| s.charAt(i) != '7'|| s.charAt(i) != '8' || s.charAt(i) != '9' || s.charAt(i) != '.') {
                return false;
            }
        }

        double a = Double.parseDouble(s);

        if (a < 1) {
            return false;
        }

        this.height = a;

        return true;
    }
    public boolean setWeight(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0' || s.charAt(i) != '1' || s.charAt(i) != '2' || s.charAt(i) != '3' || s.charAt(i) != '4' || s.charAt(i) != '5'
                    || s.charAt(i) != '6'|| s.charAt(i) != '7'|| s.charAt(i) != '8' || s.charAt(i) != '9') {
                return false;
            }
        }

        double a = Double.parseDouble(s);

        if (a < 1) {
            return false;
        }

        this.weight = a;

        return true;
    }
    public boolean setAge(String s){
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '0' || s.charAt(i) != '1' || s.charAt(i) != '2' || s.charAt(i) != '3' || s.charAt(i) != '4' || s.charAt(i) != '5'
                    || s.charAt(i) != '6'|| s.charAt(i) != '7'|| s.charAt(i) != '8' || s.charAt(i) != '9') {
                return false;
            }
        }

        double a = Double.parseDouble(s);

        if (a < 1) {
            return false;
        }

        this.age = a;

        return true;
    }
    public boolean setSex(boolean s) {
        this.sex = s;
        return true;
    }






    public boolean isSaved() {
        return saved;
    }



}
