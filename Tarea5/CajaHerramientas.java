import java.util.HashMap;
import java.util.concurrent.Semaphore;


public class CajaHerramientas {
    //representa la cantidad de herramientas que hay disponibles sin usar
    //el semaforo determinara si hay herramientas disponibles  
    private volatile HashMap<String, Semaphore> herramientas;

    //solamente guarda la informacion de las herramientas: nombre y cantidad
    //por si hace falta xd
    private volatile HashMap<String, Integer> infoHerramientas;

    public CajaHerramientas(){
        this.herramientas = new HashMap<String, Semaphore>();
        this.infoHerramientas = new HashMap<String, Integer>();
    }

    //sirve para agregar una herramienta a la caja
    public void agregarHerramienta(String nombre, int numeroHerramientas){
        //guarda la informacion de una herramienta
        this.infoHerramientas.put(nombre, numeroHerramientas);

        //guarda el nombre de la nueva herramienta, ademas de que crea un 
        //semaforo para controlar el numero de herramientas disponibles
        this.herramientas.put(nombre, new Semaphore(numeroHerramientas));
    }

    //con este metodo, un mecanico puede "tomar" una herramienta
    //pasando como parametro su nombre

    //este metodo puede solamente llamarse por mecanicos, no se que pasara si 
    //se llama desde el metodo main xd
    public void tomarHerramienta(String nombreHerramienta){
        try {
            this.herramientas.get(nombreHerramienta).acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    //con este metodo, un mecanico puede regresar a la caja una herramienta que tomo
    public void dejarHerramienta(String nombreHerramienta){
        this.herramientas.get(nombreHerramienta).release();
    }

    public HashMap<String, Integer> getInfoHerramientas(){
        return this.infoHerramientas;
    }
    
}
