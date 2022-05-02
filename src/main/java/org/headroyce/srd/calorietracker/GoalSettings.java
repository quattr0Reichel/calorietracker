package org.headroyce.srd.calorietracker;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class GoalSettings extends BorderPane {

    public GoalSettings() {
        Text title = new Text("Set A Goal");
        title.setFont(new Font(30));

        ToggleGroup chooseGoal = new ToggleGroup();
        ToggleButton gain = new ToggleButton("Gain");
        gain.setToggleGroup(chooseGoal);
        ToggleButton lose = new ToggleButton("Lose");
        lose.setToggleGroup(chooseGoal);
        ToggleButton maintain = new ToggleButton("Maintain");
        maintain.setToggleGroup(chooseGoal);

        HBox g = new HBox(5, gain, maintain, lose);
        g.setAlignment(Pos.CENTER);

        Text goalText1 = new Text("I want to...");
        Text goalText2 = new Text("weight");

        VBox goal = new VBox(10, goalText1, g, goalText2);
        goal.setAlignment(Pos.CENTER);



        //set up spacers
        Region spacer1 = new Region();
        VBox.setVgrow(spacer1, Priority.ALWAYS);
        Region spacer2 = new Region();
        VBox.setVgrow(spacer2, Priority.ALWAYS);
        Region spacer3 = new Region();
        VBox.setVgrow(spacer3, Priority.ALWAYS);
        Region spacer4 = new Region();
        VBox.setVgrow(spacer4, Priority.ALWAYS);
        Region spacer5 = new Region();
        VBox.setVgrow(spacer5, Priority.ALWAYS);
        Region spacer6 = new Region();
        VBox.setVgrow(spacer6, Priority.ALWAYS);
        Region topSpacer = new Region();
        VBox.setVgrow(topSpacer, Priority.ALWAYS);
        Region bottomSpacer = new Region();
        VBox.setVgrow(bottomSpacer, Priority.ALWAYS);
        Region bottomSpacer2 = new Region();
        VBox.setVgrow(bottomSpacer2, Priority.ALWAYS);

        VBox screenBox = new VBox(2, spacer1, spacer2, title, spacer3, goal, bottomSpacer, bottomSpacer2);
        setCenter(screenBox);
        screenBox.setAlignment(Pos.CENTER);

        if (gain.isSelected()) {
            Text gainSetText = new Text("I want to eat");
            Text gainSetText2 = new Text("extra calories a day.");
        }

        if (lose.isSelected()) {
            Text loseSetText = new Text("I want to eat");
            Text loseSetText2 = new Text("extra calories a day.");

        }

        if (maintain.isSelected()) {

        }





    }

}
