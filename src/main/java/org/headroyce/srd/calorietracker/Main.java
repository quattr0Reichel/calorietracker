package org.headroyce.srd.calorietracker;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        homeGraphics home = new homeGraphics();
        Scene scene = new Scene(home, 500, 500);
        stage.setTitle("Home Page");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {launch();}
}