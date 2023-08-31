package edu.andremelo.com.exception;
public class ModeloMotocicletaException extends Exception{
    public static void verificarModeloMotocicleta(String motocicletaModelo) throws ModeloMotocicletaException{
        if(motocicletaModelo.isEmpty()){
            throw new ModeloMotocicletaException();
        }
    }
}