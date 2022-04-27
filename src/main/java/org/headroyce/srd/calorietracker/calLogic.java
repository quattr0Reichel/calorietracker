package org.headroyce.srd.calorietracker;

public class calLogic {

    public calLogic(){

    }

    public int getDays(int month){
        int maxMonth = 0;

        if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxMonth = 30;
        }
        else if (month == 2) {
            maxMonth = 28;
        }
        else {
            maxMonth = 31;
        }
    return maxMonth;
    }

    public String getMonthText(int month){
        String monthText = "";
        if(month == 1){

        }
        return monthText;
    }
}
