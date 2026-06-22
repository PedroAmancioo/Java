package org.example;

import java.util.Scanner;

public class Veiculo {
    private String placa, modelo;

    Scanner scanner = new Scanner(System.in);

    public Veiculo(){
        System.out.println("digite a placa do carro: ");
        placa = scanner.nextLine();
        System.out.println("digite o modelo: ");
        modelo = scanner.nextLine();
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String setPlaca() {
        this.placa = placa;
        return placa;
    }

    public String setModelo() {
        this.modelo = modelo;
        return modelo;
    }
}
