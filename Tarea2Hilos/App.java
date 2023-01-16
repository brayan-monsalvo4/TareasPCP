import java.lang.Thread;

public class App {
    public static void main(String[] args) throws Exception {
        Thread hilo1 = new Hilo();
        Thread hilo2 = new Thread(new HiloTambien());

        hilo1.start();
        hilo2.start();
    }
}
