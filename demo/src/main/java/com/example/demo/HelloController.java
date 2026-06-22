package com.example.demo;

import com.almasb.fxgl.input.Input;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Label labelResult;

    @FXML
    private TextField inputNumero;

    @FXML
    protected void onHelloButtonClick() {
        int numero = Integer.parseInt(inputNumero.getText());

        labelResult.setText(
                "Resultado: " + (numero * 2)
        );
    }
}
