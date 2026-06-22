package org.example;

public class Vaga {
    private int numero;
    private boolean ocupada;
    private Veiculo veiculoEstacionado;

    public Vaga(int numero){
        this.numero = numero;
        this.ocupada = false;
        this.veiculoEstacionado = null;
    }

    public boolean estacionar(Veiculo veiculo){
        if (ocupada) {
            System.out.println("Vaga " + numero + " já está ocupada!");
            return false;
        }

        this.ocupada = true;
        this.veiculoEstacionado = veiculo;
        return true;
    }

    public boolean liberar(){
        if (!ocupada) {
            System.out.println("Vaga " + numero + " já está livre!");
            return false;
        }

        this.ocupada = false;
        this.veiculoEstacionado = null;
        return true;
    }

    public boolean isOcupada() {
        return this.ocupada;
    }

    public int getNumero() {
        return numero;
    }

    public Veiculo getVeiculoEstacionado() {
        return veiculoEstacionado;
    }
}
