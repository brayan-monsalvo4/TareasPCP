public class HiloTambien implements Runnable{
    public HiloTambien(){
    }

    @Override
    public void run(){
        System.out.println("Hola mundo, soy un hilo creado con la inteface Runnable");
    }
}