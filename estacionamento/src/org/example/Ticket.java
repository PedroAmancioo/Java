package org.example;

import java.time.Duration;
import java.time.LocalDateTime;

public class Ticket {
    private Veiculo veiculo;
    private LocalDateTime horaEntrada, horaSaida;
    private int numero;


    public void registrarSaida(){
        this.horaSaida = LocalDateTime.now();
    }

    public int calcularTempoEmHoras(){
        long segundos = Duration.between(horaEntrada, horaSaida).toSeconds();

        int horas = (int) Math.ceil(segundos / 3600.0);

        return horas;
    }

    public Ticket(int numero, Veiculo veiculo){
        this.numero = numero;
        this.veiculo = veiculo;
        this.horaEntrada = LocalDateTime.now();
        this.horaSaida = null;
    }

    public int getNumero(){
        return numero;
    }


    public void setHoraEntrada(LocalDateTime horaEntrada){
        this.horaEntrada = horaEntrada;

    }

    public void setHoraSaida(LocalDateTime horaSaida){
        this.horaSaida = horaSaida;

    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public LocalDateTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalDateTime getHoraSaida() {
        return horaSaida;
    }
}