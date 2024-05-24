package br.com.danielsilva;

public class FactoryPlacaDeVideo {
    public static PlacaDeVideo getInstance(Double tipo) {
        if (tipo == 1){
            return new PlacaDeVideoTop();
        }
        else if (tipo == 2) {
            return new PlacaDeVideoDeEntrada();
        }
        return null;


    }




}
