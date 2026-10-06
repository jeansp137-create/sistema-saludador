package com.sistemasaludador;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(MainApp.class.getResource("saludador-view.fxml"));
        Scene scene = new Scene(loader.load(), 520, 460);
        scene.getStylesheets().add(MainApp.class.getResource("styles.css").toExternalForm());
        stage.setTitle("Sistema Saludador");
        stage.setMinWidth(480);
        stage.setMinHeight(420);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
