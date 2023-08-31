package edu.andremelo.com.classes;

import static edu.andremelo.com.exception.ModeloMotocicletaException.verificarModeloMotocicleta;
import edu.andremelo.com.exception.ModeloMotocicletaException;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Motocicleta extends Veiculo {
    String modeloVeiculoMotocicleta;
    int numeroChassiCarroMotocicleta;
    int anoFabricacaoCarroMotocicleta;
    int numeroPlacaCarroMotocicleta;

    public void cadastrarMotocicleta() {

        try {

            Scanner scanner = new Scanner(System.in);
            Motocicleta moto = new Motocicleta();

            System.out.print("\n");
            System.out.println("================Cadastro de Motocicleta=======================");
            System.out.print("\n");
            System.out.print("Digite o Modelo da Motocicleta: ");
            moto.setModeloVeiculo(scanner.nextLine());
            verificarModeloMotocicleta(moto.getModeloVeiculo());
            System.out.print("Digite o Numero do Chassi: ");
            moto.setChassi(scanner.nextInt());
            System.out.print("Digite o Ano de Fabricação: ");
            moto.setAnoFabricacao(scanner.nextInt());
            System.out.print("Digite o Numero da Placa: ");
            moto.setNumeroPlaca(scanner.nextInt());

            modeloVeiculoMotocicleta = moto.getModeloVeiculo();
            numeroChassiCarroMotocicleta = moto.getChassi();
            anoFabricacaoCarroMotocicleta = moto.getAnoFabricacao();
            numeroPlacaCarroMotocicleta = moto.getNumeroPlaca();

            moto.ligar();
            moto.acelerarVeiculo();
            moto.frearVeiculo();

        }catch (ModeloMotocicletaException e) {
            System.err.println("Digite o Modelo da Motocicleta no Campo Modelo da Motocicleta");
            System.out.print("\n");
        } catch (InputMismatchException e){
            System.err.println("Digite Apenas Numeros nos Campos Numero do Chassi, Ano de Fabricação e Numero da Placa");
            System.out.print("\n");
        }
    }
    public void consultarMotocicleta() {

        try {

            Scanner scanner = new Scanner(System.in);
            int chassi;

            System.out.print("\n");
            System.out.println("==================Consultar Motocicleta========================");
            System.out.print("\n");
            System.out.print("Digite o Numero do Chassi da Motocicleta: ");
            chassi = scanner.nextInt();
            if (chassi != numeroChassiCarroMotocicleta) {
                System.err.println("Chassi da Motocicleta não Cadastrado no Sistema!");
                System.out.print("\n");
            } else {
                System.out.println("Modelo da Motocicleta: " + modeloVeiculoMotocicleta);
                System.out.println("Numero do Chassi: " + numeroChassiCarroMotocicleta);
                System.out.println("Ano de Fabricação: " + anoFabricacaoCarroMotocicleta);
                System.out.println("Numero da Placa: " + numeroPlacaCarroMotocicleta);
            }
        } catch (InputMismatchException e) {
            System.err.println("Digite apenas Numeros no Campo Numero do Chassi da Motocicleta");
            System.out.print("\n");
        }
    }
    @Override
    public void acelerarVeiculo() {
        System.out.print("\n");
        System.out.println("Rodar a Manopla do Acelerador!");
    }
    @Override
    public void frearVeiculo() {
        System.out.println("Apertar o freio!");
    }
}