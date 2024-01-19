public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv(); //puxando a classe SmartTV

        smartTv.diminuirVolume(); //volume inicial 25
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume(); //=23 de volume


        System.out.println("Canal Atual: " +smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal Atual: " +smartTv.canal);


        System.out.println("Volume Atual : " +smartTv.volume);

        System.out.println("TV Ligada ?"+smartTv.ligada);
        
        System.out.println("Volume Atual: "+smartTv.volume);

        smartTv.ligar();
        System.out.println("Novo Status -> : TV Ligada ?"+smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo Status ->: TV desligada ?"+smartTv.ligada);




    }
}
