public class SmartTv {
    /*  
    * Vamos criar um exemplo de uma classe para representar uma SmartTV onde:
    * Ela tenha as características: ligada (boolean), canal (int) e volume (int);
    * Nossa TV poderá ligar e desligar e assim mudar o estado ligada;
    * Nossa TV aumentará e diminuirá o volume sempre em +1 ou -1;
    * Nossa TV poderá mudar de canal de 1 em 1 ou definindo o número correspondente. 
    */
    
    boolean ligada = false;
    int canal = 4, volume = 25;

    
    public void ligar(){

        ligada = true;
        System.out.println("A televisão está ligada? " + ligada);
    }

    public void desligar(){

        ligada = false;
        System.out.println("A televisão está ligada? " + ligada);
    }

    public void aumentarVolume(){

        volume++;
        System.out.println("O volume da televisão: " + volume);
    }

    public void diminuirVolume(){

        volume--;
        System.out.println("O volume da televisão: " + volume);
    }

    public void aumentarCanal(){

        canal++;
        System.out.println("O canal da televisão é o: " + canal);
    
    }

    public void diminuirCanal(){

        canal--;
        System.out.println("O canal da televisão é o: " + canal);
    
    }

    public void receberCanal(int canalDesejado){

        canal = canalDesejado;
        System.out.println("O canal da televisão é o: " + canal);
        
    }
}
