package org.example;

import java.util.ArrayList;

public class Estacionamento {
    private ArrayList<Vaga> vagas;
    private ArrayList<Ticket> ticketsAbertos;
    private Tarifario tarifario;


    public void exibirVagasLivres() {
        System.out.println("Vagas livres:");

        for (Vaga vaga : vagas) {
            if (!vaga.isOcupada()) {
                System.out.println("Vaga " + vaga.getNumero() + " VAZIA");
            }else{
                System.out.println("Vaga " + vaga.getNumero() + " - " + vaga.getVeiculoEstacionado().getPlaca());
            }
        }
    }

    public boolean estacionarVeiculo(Veiculo veiculo) {
        for (Vaga vaga : vagas) {
            if (!vaga.isOcupada()) {

                vaga.estacionar(veiculo);

                Ticket ticket = new Ticket(vaga.getNumero(), veiculo);

                ticketsAbertos.add(ticket);

                System.out.println("Veículo estacionado na vaga " + vaga.getNumero());
                return true;
            }
        }

        System.out.println("Não há vagas disponíveis!");
        return false;
    }

    public void liberarVeiculo(String placa){
        for (Vaga vaga : vagas){
            if(vaga.isOcupada()){
                if(vaga.getVeiculoEstacionado().getPlaca().equals(placa)){
                    for(Ticket ticket : ticketsAbertos){
                        if(ticket.getVeiculo().getPlaca().equals(placa)){

                            ticket.registrarSaida();

                            int horas = ticket.calcularTempoEmHoras();

                            double valor = tarifario.calcularValor(horas);

                            System.out.println("Tempo estacionado: " + horas + " horas");

                            System.out.println("Valor a pagar: R$" + valor);

                            ticketsAbertos.remove(ticket);
                            break;
                        }
                    }
                    vaga.liberar();

                    System.out.println("Veículo removido da vaga " + vaga.getNumero());
                    return;
                }
            }
        }

        System.out.println("Veículo não encontrado!");
    }

    public Estacionamento (int totalDeVagas){
        this.vagas = new ArrayList<>();
        this.ticketsAbertos = new ArrayList<>();
        this.tarifario = new Tarifario();

        for(int i= 1; i <= totalDeVagas; i++){
            Vaga novaVaga = new Vaga(i);
            this.vagas.add(novaVaga);
        }
    }

}
