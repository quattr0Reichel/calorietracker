package org.headroyce.srd.calorietracker;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class settingGraphics extends BorderPane {

    private settingsLogic logic;


    public settingGraphics(Stage stage){

        logic = new settingsLogic();

        Text setRMR = new Text("SET RMR");
        Text rmrExplained = new Text("Your resting metabolic rate (RMR) is how many calories \n you burn during the day without exercise. Calculate your RMR here:");
        rmrExplained.setTextAlignment(TextAlignment.CENTER);
        Button rmrButton = new Button("Find RMR");

//        Text yourGoal = new Text("Your daily goal:");
//        yourGoal.setTextAlignment(TextAlignment.JUSTIFY);
//        Text calGoal = new Text( logic.getDailyCals() + " calories");
//        calGoal.setTextAlignment(TextAlignment.JUSTIFY);

        VBox rmrBox = new VBox(10, setRMR, rmrExplained, rmrButton);
        rmrBox.setAlignment(Pos.CENTER);

        Text setGoal = new Text("SET GOAL");
        Text goalExplained = new Text("Your goal is how many calories you want to add or cut from your \n diet. You can also choose to maintain weight. Set a goal here:");
        goalExplained.setTextAlignment(TextAlignment.CENTER);
        Button goalButton = new Button("Choose Goal");

        VBox goalBox = new VBox(10, setGoal, goalExplained, goalButton);
        goalBox.setAlignment(Pos.CENTER);

        VBox totalBox = new VBox(30, rmrBox, goalBox);
        totalBox.setAlignment(Pos.CENTER);

        this.setCenter(totalBox);

        Button back = new Button("Save");

        rmrButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                RmrCalculator rmrCalc = new RmrCalculator();
                Scene rmrScene = new Scene(rmrCalc, stage.getWidth(), stage.getHeight());
                stage.setScene(rmrScene);
                stage.show();
                stage.toFront();

            }
        });

        goalButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {
                GoalSettings goalStuff = new GoalSettings();
                Scene goalScene = new Scene(goalStuff, stage.getWidth(), stage.getHeight());
                stage.setScene(goalScene);
                stage.show();
                stage.toFront();

            }
        });







//        TextField basicCals = new TextField();
//        basicCals.setPromptText("# calories burned daily");
////        Label basicCalsLabel = new Label("input how many calories you burn \n a day (WITHOUT exercise) here");
//        TextField netGoal = new TextField();
//        netGoal.setPromptText("goal");
////        Label netGoalLabel = new Label("input how many calories you \n want to gain or lose here");

//        VBox inputbox = new VBox(5, basicCals, netGoal);
//        inputbox.setAlignment(Pos.CENTER);

    }
}


