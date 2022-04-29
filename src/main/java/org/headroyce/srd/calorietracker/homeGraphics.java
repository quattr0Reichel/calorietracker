package org.headroyce.srd.calorietracker;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class homeGraphics extends BorderPane {

    public homeGraphics() {
        //buttons to change tabs
        Button exercise = new Button("Exercise");
        Button calendar = new Button("Calendar");
        Button diet = new Button("Diet");
        Button settings = new Button("Settings");

        //button sizing
        exercise.setMaxSize(300, 300);
        calendar.setMaxSize(300, 300);
        diet.setMaxSize(300, 300);


        settings.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {

                Stage s = (Stage) homeGraphics.this.getScene().getWindow();
                settingGraphics setting = new settingGraphics(s);
                Scene settingScene = new Scene(setting, s.getWidth(),s.getHeight());
                s.setScene(settingScene);
                s.setTitle("Settings");

            }
        });

        exercise.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                exGraphics exGraphic = new exGraphics();

                Stage s = (Stage) homeGraphics.this.getScene().getWindow();
                Scene exScene = new Scene(exGraphic, s.getWidth(), s.getHeight());
                s.setScene(exScene);
                s.setTitle("Exercise Tab");
            }
        });


        diet.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                dietGraphics dietGraphic = new dietGraphics();

                Stage s = (Stage) homeGraphics.this.getScene().getWindow();
                Scene dietScene = new Scene(dietGraphic, s.getWidth(), s.getHeight());
                s.setScene(dietScene);
                s.setTitle("Diet Tab");
            }
        });

        calendar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                calGraphics calGraphic = new calGraphics();

                Stage s = (Stage) homeGraphics.this.getScene().getWindow();
                Scene calScene = new Scene(calGraphic, s.getWidth(), s.getHeight());
                s.setScene(calScene);
                s.setTitle("Calendar Tab");
            }
        });


        VBox actions = new VBox(exercise, diet, calendar);
        actions.setSpacing(20);
        actions.setAlignment(Pos.CENTER);


        this.setCenter(actions);
        this.setTop(settings);

    }
}
