import java.util.concurrent.Semaphore;

public class Computadora extends Semaphore {
    private static int numeroCompus = 0;
    private int numeroCompu;

    public Computadora(int permisos){
        super(permisos, true);

        numeroCompus++;
        numeroCompu = numeroCompus;
    }

    @Override
    public String toString(){
        return String.valueOf(numeroCompu);
    }
}
