package org.headroyce.srd.calorietracker;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class exGraphics extends BorderPane {

    public exGraphics() {
        Button back = new Button("Back");
        this.setTop(back);

        back.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                homeGraphics homeGraphic = new homeGraphics();
                Stage s = (Stage) exGraphics.this.getScene().getWindow();
                Scene homeScene = new Scene(homeGraphic, s.getWidth(), s.getHeight());
                s.setScene(homeScene);
                s.setTitle("Home");

            }
        });

        
    }


}
