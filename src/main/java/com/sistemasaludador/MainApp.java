package com.sistemasaludador;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) {
        TextField nombreField = new TextField();
        nombreField.setPromptText("Nombre");

        TextField edadField = new TextField();
        edadField.setPromptText("Edad");

        ComboBox<String> horaCombo = new ComboBox<>();
        horaCombo.getItems().addAll("AM", "PM");
        horaCombo.setValue("AM");

        Label mensaje = new Label();
        mensaje.setWrapText(true);

        Button boton = new Button("Solicitar saludo");
        boton.setOnAction(e -> {
            String nombre = nombreField.getText().trim();
            String edad = edadField.getText().trim();
            String hora = horaCombo.getValue();

            if (nombre.isEmpty() || edad.isEmpty()) {
                mensaje.setText("Ingresa el nombre y la edad.");
                return;
            }

            mensaje.setText(
                    "Hola " + nombre + ", tienes " + edad
                            + " años. Solicitaste el saludo en horario " + hora + ".");
        });

        VBox root = new VBox(10,
                new Label("Nombre"),
                nombreField,
                new Label("Edad"),
                edadField,
                new Label("Hora (AM/PM)"),
                horaCombo,
                boton,
                mensaje);
        root.setPadding(new Insets(20));

        stage.setTitle("Sistema Saludador");
        stage.setScene(new Scene(root, 400, 320));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
