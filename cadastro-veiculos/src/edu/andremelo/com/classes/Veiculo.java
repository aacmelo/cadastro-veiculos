package edu.andremelo.com.classes;
public abstract class Veiculo {
    private String modeloVeiculo;
    private int chassi;
    private int anoFabricacao;
    private int numeroPlaca;
    public String getModeloVeiculo(){
        return modeloVeiculo;
    }
    public void setModeloVeiculo(String modeloVeiculo){
        this.modeloVeiculo = modeloVeiculo;
    }
    public int getChassi() {
        return chassi;
    }
    public void setChassi(int chassi){
        this.chassi = chassi;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public int getNumeroPlaca() {
        return numeroPlaca;
    }
    public void setNumeroPlaca(int numeroPlaca) {
        this.numeroPlaca = numeroPlaca;
    }
    public void ligar(){
        confereCombustivel();
        confereCambio();
        System.out.println("Ligando o Veiculo!");
    }
    private void confereCombustivel(){
        System.out.print("\n");
        System.out.println("Conferindo Combustivel");
    }
    private void confereCambio(){
        System.out.println("Conferindo Cambio");
    }
    public abstract void acelerarVeiculo();
    public abstract void frearVeiculo();
}