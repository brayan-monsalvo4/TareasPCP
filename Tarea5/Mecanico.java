import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Arrays;

public class Mecanico extends Thread{
    private String name;
    private String[] nombreHerramientasTomadas;
    private CajaHerramientas cajota;


    public Mecanico(String nombre, CajaHerramientas caja){
        this.name = nombre;
        this.cajota = caja;
    }

    public String getNombre(){
        return this.name;
    }

    public void realizarTarea(String[] herramientas){
        this.nombreHerramientasTomadas = herramientas;
    }

    @Override
    public void run(){
        while(true){

            //for(int i = 0; i < nombreHerramientasTomadas.length; i++){
                this.cajota.tomarHerramienta( nombreHerramientasTomadas[0] );
                System.out.println(this.getNombre()+" tomo "+nombreHerramientasTomadas[0]);
            //}

            Random rand = new Random();
            int tiempo = rand.nextInt(10000);
            //si el tiempo es cero, el valor cambia a 1000 ns, para evitar tiempos iguales a 0
            tiempo = (tiempo == 0) ? 1000 : tiempo;
    
            //el cliente "usa la computadora" por x tiempo
            try {
                Thread.sleep(tiempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            //for(int i = 0; i < nombreHerramientasTomadas.length; i++){
                this.cajota.dejarHerramienta( nombreHerramientasTomadas[0] );
                System.out.println(this.getNombre()+" regreso "+nombreHerramientasTomadas[0]);
            //}



        }

    }

}