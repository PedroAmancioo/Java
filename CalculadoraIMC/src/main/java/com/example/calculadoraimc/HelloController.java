package com.example.calculadoraimc;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private TextField txtPeso;
    @FXML
    private TextField txtAltura;
    @FXML
    private Label lblResultado;
    @FXML
    public void calcularIMC() {
        double peso = Double.parseDouble(
                txtPeso.getText()
        );
        double altura = Double.parseDouble(
                txtAltura.getText()
        );

        double imc = peso / (altura * altura);

        lblResultado.setText(
                String.format("IMC: %.2f", imc)
        );
    }

}
