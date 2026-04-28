package org.example;

public class Carro {
    private String placa;
    private int ano;
    private float velocidade;

    public Carro(){
        this.ano = ano;
        this.placa = "Sem placa";
    }

    public float getVelocidade() {
        return velocidade;
    }
    public void setVelocidade(float velocidade) {
        this.velocidade = velocidade;
    }

    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa){
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

}
