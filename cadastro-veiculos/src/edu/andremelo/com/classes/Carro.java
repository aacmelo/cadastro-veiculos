package edu.andremelo.com.classes;

import java.util.Scanner;
import static edu.andremelo.com.exception.ModeloCarroException.verificarModeloCarro;
import edu.andremelo.com.exception.ModeloCarroException;
import java.util.InputMismatchException;
public class Carro extends Veiculo {
    String modeloVeiculoCarro;
    int numeroChassiCarro;
    int anoFabricacaoCarro;
    int numeroPlacaCarro;
    public void cadastrarCarro() {

        try {

            Carro carro = new Carro();
            Scanner scanner = new Scanner(System.in);

            System.out.print("\n");
            System.out.println("===================Cadastro de Carros=======================");
            System.out.print("\n");
            System.out.print("Digite o Modelo do Carro: ");
            carro.setModeloVeiculo(scanner.nextLine());
            verificarModeloCarro(carro.getModeloVeiculo());
            System.out.print("Digite o Numero do Chassi: ");
            carro.setChassi(scanner.nextInt());
            System.out.print("Digite o Ano de Fabricação: ");
            carro.setAnoFabricacao(scanner.nextInt());
            System.out.print("Digite o Numero da Placa: ");
            carro.setNumeroPlaca(scanner.nextInt());

            modeloVeiculoCarro = carro.getModeloVeiculo();
            numeroChassiCarro = carro.getChassi();
            anoFabricacaoCarro = carro.getAnoFabricacao();
            numeroPlacaCarro = carro.getNumeroPlaca();

            carro.ligar();
            carro.acelerarVeiculo();
            carro.frearVeiculo();

        } catch (ModeloCarroException e) {
            System.err.println("Digite o Modelo do Carro no Campo Modelo do Carro");
            System.out.print("\n");
        } catch (InputMismatchException e) {
            System.err.println("Digite Apenas Numeros nos Campos Numero do Chassi, Ano de Fabricação e Numero da Placa");
            System.out.print("\n");
        }
    }
    public void consultarCarro() {

        try {

            Scanner scanner = new Scanner(System.in);
            int chassi;

            System.out.print("\n");
            System.out.println("=====================Consultar Carro=======================");
            System.out.print("\n");
            System.out.print("Digite o Numero do Chassi do Carro: ");
            chassi = scanner.nextInt();
            if (chassi != numeroChassiCarro) {
                System.err.println("Chassi do Carro Não Cadastrado no Sistema");
                System.out.print("\n");
            } else {
                System.out.println("Modelo do Carro: " + modeloVeiculoCarro);
                System.out.println("Numero do Chassi: " + numeroChassiCarro);
                System.out.println("Ano de Fabricação: " + anoFabricacaoCarro);
                System.out.println("Numero da Placa: " + numeroPlacaCarro);
            }
        } catch (InputMismatchException e) {
            System.err.println("Digite apenas Numeros no Campo do Numero do Chassi do Carro");
            System.out.print("\n");
        }
    }
    @Override
    public void acelerarVeiculo() {
        System.out.print("\n");
        System.out.println("Pisar no Acelerador");
    }
    @Override
    public void frearVeiculo() {
        System.out.println("Pisar no Freio");
    }
}




