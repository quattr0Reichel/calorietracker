package org.headroyce.srd.calorietracker;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class calGraphics extends GridPane {

    private boolean saved;

    public calGraphics () {
        Button backsave = new Button("Save");
        backsave.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

//                if (!calLogic.isCalSaved()) {
                if (saved) {
                    backsave.setText("Home");
                }
            }
        });

    }

}
