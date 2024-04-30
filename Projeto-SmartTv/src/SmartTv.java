public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void ligar(){
        ligada = true;
    }
    public void desligada(){
        ligada = false;
    }

    public void aumentarVolume(){
        volume ++;
    }

    public void diminuirVolume(){
        volume --;
    }

    public void aumentarCanal(){
        canal++;
    }
    public void diminuircanal(){
        canal--;
    }

    public void digitarCanal(int num){
        canal = num;
    }

    
} 