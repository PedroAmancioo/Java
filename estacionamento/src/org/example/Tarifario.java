package org.example;

public class Tarifario {
    int horas, dias, semanas, meses;
    private double valorHora, valorDiaria, valorSemana, valorMes;

    public Tarifario(){
        this.valorHora = 5.0;
        this.valorDiaria = 50.0;
        this.valorSemana = 250.0;
        this.valorMes = 800.0;
    }

    public double calcularValor(int horas){

        if(horas < 24){
            return horas * valorHora;

        }else if(horas < 24 * 7) {
            dias = horas / 24;
            return dias * valorDiaria;

        }else if(horas < 24 * 30){
            semanas = horas / (24 * 7);
            return semanas * valorSemana;

        }else{
            meses = horas / (24 * 30);
            return meses * valorMes;
        }
    }

}
