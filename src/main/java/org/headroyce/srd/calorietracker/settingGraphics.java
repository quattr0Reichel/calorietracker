package org.headroyce.srd.calorietracker;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;

public class settingGraphics extends BorderPane {

    private settingsLogic logic;


    public settingGraphics(){

//        dailyGoal = settingsLogic.getDailyCals();
        logic = new settingsLogic();

        Text yourGoal = new Text("Your daily goal:");
        yourGoal.setTextAlignment(TextAlignment.JUSTIFY);

        Text calGoal = new Text( logic.getDailyCals() + " calories");
        calGoal.setTextAlignment(TextAlignment.JUSTIFY);

        VBox textbox = new VBox(yourGoal, calGoal);
        textbox.setAlignment(Pos.CENTER);


        TextField basicCals = new TextField();
        Label basicCalsLabel = new Label("input how many calories you burn \n a day (WITHOUT exercise) here");

        TextField netGoal = new TextField();
        Label netGoalLabel = new Label("input how many calories you \n want to gain or lose here");


        VBox inputbox = new VBox(basicCalsLabel, basicCals, netGoalLabel, netGoal);
        inputbox.setAlignment(Pos.CENTER);



        HBox layoutbox = new HBox(10, textbox, inputbox);

        this.setCenter(layoutbox);
        layoutbox.setAlignment(Pos.CENTER);

        Button backsave = new Button("Save");
        backsave.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                if (logic.isSaved()) {
                    backsave.setText("Home");
                }
            }
        });

        this.setTop(backsave);


    }

}
