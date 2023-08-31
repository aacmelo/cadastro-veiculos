package edu.andremelo.com.app;

import edu.andremelo.com.classes.Carro;
import edu.andremelo.com.classes.Motocicleta;
import java.util.Scanner;
import java.util.InputMismatchException;
public class SistemaVeiculos {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            Carro carro = new Carro();
            Motocicleta motocicleta = new Motocicleta();

            int opcao = 0;

            while (opcao != 5) {
                System.out.print("\n");
                System.out.println("===================Cadastrar Veiculos======================");
                System.out.print("\n");
                System.out.println("1 Cadastrar Carro");
                System.out.println("2 Cadastrar Motocicleta");
                System.out.println("3 Consultar Carro");
                System.out.println("4 Consultar Motocicleta");
                System.out.println("5 Fim do Programa");
                System.out.print("\n");
                System.out.print("Escolha a Opção Desejada: ");
                opcao = scanner.nextInt();
                if (opcao != 5) {
                    switch (opcao) {
                        case 1 -> carro.cadastrarCarro();
                        case 2 -> motocicleta.cadastrarMotocicleta();
                        case 3 -> carro.consultarCarro();
                        case 4 -> motocicleta.consultarMotocicleta();
                        default -> {
                            System.err.println("Opção Invalida do Sistema!");
                            System.out.print("\n");
                        }
                    }
                }
            }
        } catch (InputMismatchException e) {
            System.out.print("\n");
            System.err.println("Digite Apenas Numeros nas Opções do Sistema");
        }
    }
}