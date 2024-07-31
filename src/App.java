public class App {

    public static void main(String[] args) throws Exception {

        SmartTv smarttv = new SmartTv();
            
        System.out.println("A televisão está ligada? " + smarttv.ligada);
        System.out.println("Qual o canal da televisão? " + smarttv.canal);
        System.out.println("Qual o volume da televisão? " + smarttv.volume);

        smarttv.ligar();        
        smarttv.desligar();
        
        smarttv.aumentarVolume();
        smarttv.aumentarVolume();        
        smarttv.diminuirVolume();
x
        smarttv.aumentarCanal();
        smarttv.diminuirCanal();
        smarttv.diminuirCanal();
        smarttv.diminuirCanal();

        smarttv.receberCanal(9);
                
    }
}
