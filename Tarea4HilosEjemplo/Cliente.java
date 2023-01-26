import java.util.Random;

public class Cliente extends Thread{
    private Computadora compus;

    public Cliente(Computadora computadoras, String nombreCliente){
        this.compus = computadoras;
        this.setName(nombreCliente);
    }

    @Override
    public void run(){
        while(true){
            try {
                //un cliente trata de alquilar una compu
                compus.acquire();                
                System.out.println("El cliente "+getName()+" tomo un equipo");
                //System.out.println("Equipos restantes: "+compus.availablePermits());

    
                //se genera un numero aleatorio entre 0 y 10,000
                //que simula el tiempo que el cliente usa el equipo
                Random rand = new Random();
                int tiempo = rand.nextInt(10000);
                //si el tiempo es cero, el valor cambia a 1000 ns, para evitar tiempos iguales a 0
                tiempo = (tiempo == 0) ? 1000 : tiempo;
    
                //el cliente "usa la computadora" por x tiempo
                sleep(tiempo);
    
                //pasado el tiempo, el cliente "libera el equipo"
                compus.release();
                System.out.println("El cliente "+getName()+" dejo el equipo");
                
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
