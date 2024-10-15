package controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import modelo.Movimiento;

public class Controlador implements Initializable {
    // atributos
    @FXML
    Circle circulo;
    @FXML
    Pane principal;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        circulo.setLayoutX(principal.getPrefWidth() / 2);
        circulo.setLayoutY(principal.getPrefHeight() / 2);
        circulo.setRadius(5);
        circulo.setFill(Color.RED);

        Movimiento movimiento = new Movimiento(circulo, principal, 30);
        movimiento.start();
    }

}
