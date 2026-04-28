package org.example;
import java.util.Scanner;

public class main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        int opcao = 0;

        do{
            System.out.println("\n--- MENU ESTACIONAMENTO ---");
            System.out.println("1. Registar Entrada");
            System.out.println("2. Registrar Saída");
            System.out.println("3. Exibir vagas livres");
            System.out.println("4. Sair.");
            System.out.println("Escolha uma opção");

            opcao = scanner.nextInt();
            scanner.nextLine();
            System.out.println("usuario digitou a opcao: " + opcao);
        } while (opcao != 4);
        System.out.println("Usuario saiu do sistema");
    }
}
