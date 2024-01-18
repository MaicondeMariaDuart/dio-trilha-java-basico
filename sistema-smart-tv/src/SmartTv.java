public class SmartTv {
    boolean ligada=false;
    int canal=1;
    int volume = 25;

    public void ligar(){ //metodo, ação
        ligada=true;
    }
    public void desligar(){
        ligada=false;
    }

    public void aumentarVolume(){
        //volume = volume +1;
        volume++; //qualquer destes dois pode aumentar volume
        System.out.println("Aumentando o volume para: "+volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("Diminuindo o volume para: "+volume);
    }

}
