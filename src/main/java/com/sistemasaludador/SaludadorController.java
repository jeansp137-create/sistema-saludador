package com.sistemasaludador;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class SaludadorController {

    @FXML
    private TextField nombreField;

    @FXML
    private TextField edadField;

    @FXML
    private ComboBox<String> horaCombo;

    @FXML
    private ComboBox<String> minutoCombo;

    @FXML
    private RadioButton amRadio;

    @FXML
    private RadioButton pmRadio;

    @FXML
    private ToggleGroup periodoGroup;

    @FXML
    private Label mensajeLabel;

    @FXML
    private void initialize() {
        horaCombo.setItems(FXCollections.observableArrayList(
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12"));
        horaCombo.getSelectionModel().select("8");

        minutoCombo.setItems(FXCollections.observableArrayList(
                "00", "05", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"));
        minutoCombo.getSelectionModel().select("00");

        mensajeLabel.setText("Completa tus datos y presiona Solicitar saludo.");
    }

    @FXML
    private void onSolicitarSaludo() {
        String nombre = nombreField.getText() == null ? "" : nombreField.getText().trim();
        String edadTexto = edadField.getText() == null ? "" : edadField.getText().trim();
        String hora = horaCombo.getValue();
        String minuto = minutoCombo.getValue();
        RadioButton periodoSeleccionado = (RadioButton) periodoGroup.getSelectedToggle();

        String error = validar(nombre, edadTexto, hora, minuto, periodoSeleccionado);
        if (error != null) {
            mensajeLabel.getStyleClass().setAll("mensaje", "mensaje-error");
            mensajeLabel.setText(error);
            return;
        }

        int edad = Integer.parseInt(edadTexto);
        String periodo = periodoSeleccionado.getText();
        String momento = "AM".equals(periodo) ? "Buenos días" : "Buenas tardes/noches";
        String saludo = String.format(
                "%s, %s. Tienes %d años y solicitaste tu saludo a las %s:%s %s.",
                momento, nombre, edad, hora, minuto, periodo);

        mensajeLabel.getStyleClass().setAll("mensaje", "mensaje-ok");
        mensajeLabel.setText(saludo);
    }

    private String validar(String nombre, String edadTexto, String hora, String minuto, RadioButton periodo) {
        if (nombre.isEmpty()) {
            return "Ingresa tu nombre.";
        }
        if (!nombre.matches("[\\p{L} ]+")) {
            return "El nombre solo puede contener letras y espacios.";
        }
        if (edadTexto.isEmpty()) {
            return "Ingresa tu edad.";
        }
        if (!edadTexto.matches("\\d+")) {
            return "La edad debe ser un número entero.";
        }
        int edad = Integer.parseInt(edadTexto);
        if (edad < 1 || edad > 120) {
            return "La edad debe estar entre 1 y 120 años.";
        }
        if (hora == null || minuto == null) {
            return "Selecciona la hora completa.";
        }
        if (periodo == null) {
            return "Selecciona AM o PM.";
        }
        return null;
    }
}
