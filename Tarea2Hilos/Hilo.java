public class Hilo extends Thread{
    public Hilo(){

    }

    @Override
    public void run(){
        System.out.println("Hola mundo, soy un hilo creado con la clase Thread");
    }
}
