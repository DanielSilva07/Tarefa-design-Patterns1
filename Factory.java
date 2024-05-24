package br.com.danielsilva;

public class Factory {
    public static void main(String[] args) {
      //  PlacaDeVideo placaDeVideo = new PlacaDeVideo() ; vai ocorrer um erro pois a classe PlacaDeVideo é Abstract.
        PlacaDeVideo placaDeVideo = FactoryPlacaDeVideo.getInstance(2.0);
        PlacaDeVideo placaDeVideo1 = FactoryPlacaDeVideo.getInstance(1.0);
        PlacaDeVideoDeEntrada.getDescripition();
        PlacaDeVideoTop.getDescripition();

        System.out.println(placaDeVideo);
        System.out.println(PlacaDeVideoDeEntrada.getDescripition());
        System.out.println(placaDeVideo1);
        System.out.println(PlacaDeVideoTop.getDescripition());
    }
}
