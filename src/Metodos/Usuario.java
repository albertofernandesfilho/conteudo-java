package Metodos;

public class Usuario {
    
    public static void main(String[] args) {
        
        SmartTv smartTv = new SmartTv();

        System.out.println("A Tv está ligada? " + smartTv.ligada);
        System.out.println("Qual o canal? " + smartTv.canal);
        System.out.println("Qual o volume? " + smartTv.volume);

        smartTv.ligar();

        System.out.println("A Tv está ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();

        System.out.println("Qual o volume? " + smartTv.volume);

        smartTv.diminuirVolume();
        smartTv.diminuirVolume();

        smartTv.mudarCanal(13);
        System.out.println("Qual o canal? " + smartTv.canal);

        smartTv.aumentarCanal();
        smartTv.diminuirCanal();



        // System.out.println("Qual o volume? " + smartTv.volume);



    }
}
