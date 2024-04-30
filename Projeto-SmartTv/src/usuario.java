public class usuario {
    public static void main(String[] args) throws Exception {
        SmartTv smartTv = new  SmartTv();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual = " +  smartTv.canal);
        System.out.println("Volume atual = " + smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        System.out.println(smartTv.volume);
    
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.diminuircanal();
        System.out.println("O canal atual é o "+ smartTv.canal);

        smartTv.digitarCanal(78);

        System.out.println("O canal digitado foi o " + smartTv.canal);
    }
}
