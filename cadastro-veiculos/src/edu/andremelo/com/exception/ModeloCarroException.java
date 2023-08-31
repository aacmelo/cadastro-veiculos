package edu.andremelo.com.exception;
public class ModeloCarroException extends Exception{
    public static void verificarModeloCarro(String carroModelo) throws ModeloCarroException{
        if(carroModelo.isEmpty()){
            throw new ModeloCarroException();
        }
    }
}