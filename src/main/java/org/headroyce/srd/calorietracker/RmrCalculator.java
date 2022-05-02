package org.headroyce.srd.calorietracker;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class RmrCalculator extends BorderPane {

    public RmrCalculator(Stage stage, settingsLogic logic) {

        //set up header
        Text title = new Text("RMR Calculator");
        title.setFont(new Font(30));


        //set up toggle buttons
        RadioButton metric = new RadioButton("Metric");
        RadioButton imperial = new RadioButton("Imperial");
        ToggleGroup systemToggle = new ToggleGroup();
        metric.setToggleGroup(systemToggle);
        imperial.setToggleGroup(systemToggle);
        systemToggle.selectToggle(metric);

        Text system = new Text("choose system:");

        VBox chooseSystem = new VBox();

        //set up text fields + prompt text
        TextField weight = new TextField();
        TextField height = new TextField();
        TextField age = new TextField();

        weight.setPromptText("input weight here");
        height.setPromptText("input height here");
        age.setPromptText("input age here");

        Label weightLabel = new Label("weight");
        Label heightLabel = new Label("height");
        Label ageLabel = new Label("age");
        Label sexLabel = new Label("sex");


        ToggleGroup chooseSex = new ToggleGroup();
        ToggleButton female = new ToggleButton("Female");
        female.setToggleGroup(chooseSex);
        ToggleButton male = new ToggleButton("Male");
        male.setToggleGroup(chooseSex);

        HBox sex = new HBox(10, male, female);


        Button calculate = new Button("Calculate");


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

        VBox warnings = new VBox(5);


        VBox mainbox = new VBox(2, topSpacer, title, spacer1, system, metric, imperial, spacer2,
                weightLabel, weight, spacer3, heightLabel, height, spacer4, ageLabel, age, spacer5,
                sexLabel, sex, spacer6, calculate, warnings, bottomSpacer, bottomSpacer2);
        mainbox.setAlignment(Pos.CENTER);
        mainbox.setFillWidth(false);
        this.setCenter(mainbox);


        //TODO: FIX
        calculate.setOnAction(new EventHandler<ActionEvent>() {
            @Override public void handle(ActionEvent e) {

                logic.setImperial(imperial.isSelected());

                warnings.getChildren().clear();

                if (!logic.setWeight(weight.getText())) {
                    Text weightWarning = new Text("Please input a legal weight.");
                    weightWarning.setFont(new Font(10));
                    weightWarning.setFill(Color.RED);
                    warnings.getChildren().add(weightWarning);
                }

                if (!logic.setHeight(height.getText())) {
                    Text heightWarning = new Text("Please input a legal height.");
                    heightWarning.setFont(new Font(10));
                    heightWarning.setFill(Color.RED);
                    warnings.getChildren().add(heightWarning);
                }

                if (!logic.setAge(age.getText())) {
                    Text ageWarning = new Text("Please input a legal age.");
                    ageWarning.setFont(new Font(10));
                    ageWarning.setFill(Color.RED);
                    warnings.getChildren().add(ageWarning);
                }

                if (!(female.isSelected() || male.isSelected())) {
                    Text sexWarning = new Text("Please choose a sex.");
                    sexWarning.setFont(new Font(10));
                    sexWarning.setFill(Color.RED);
                    warnings.getChildren().add(sexWarning);
                }

                else {
                    logic.setSex(female.isSelected());

                }

                logic.calculateRMR();
            }
        });





    }

}
