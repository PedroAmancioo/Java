package org.example;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Estacionamento estacionamento = new Estacionamento(10);


        int opcao = 0;

        do{
            System.out.println("\n--- MENU ESTACIONAMENTO ---");
            System.out.println("1. Registar Entrada");
            System.out.println("2. Registrar Saída");
            System.out.println("3. Exibir vagas livres");
            System.out.println("4. Sair.");
            System.out.println("Escolha uma opção");

            String entradaOpcao = scanner.nextLine().trim();
            try{
                opcao = Integer.parseInt(entradaOpcao);
            } catch (NumberFormatException e){
                System.out.print("invalido! erro " + e + " digite um numero entre 1 e 4 ");
                continue;
            }

            if(opcao>=1 && opcao<=4)
                System.out.println("usuario digitou a opcao: " + opcao);

            switch (opcao){
                case 1:
                    Veiculo veiculo = new Veiculo();
                    System.out.println("Veículo cadastrado:");
                    System.out.println("Placa: " + veiculo.getPlaca());
                    System.out.println("Modelo: " + veiculo.getModelo());
                    estacionamento.estacionarVeiculo(veiculo);
                break;
                case 2:
                    System.out.println("qual carro será liberado?");
                    String placa = scanner.nextLine();
                    estacionamento.liberarVeiculo(placa);
                    

                break;
                case 3:
                estacionamento.exibirVagasLivres();

            }
        } while (opcao != 4);
        System.out.println("Usuario saiu do sistema");


        System.out.println("Pressione Enter para sair...");
        scanner.nextLine();
    }
}