import java.util.LinkedList;

//esta clase se encarga de crear hilos hijos, asignarles una figura y ejecutar cada
//uno de dichos hijos
public class HiloPadre extends Thread {

    //el hilo padre tiene 2 atributos:
    //la lista de procesos hijos "hijitos"
    //la lista de figuras que recibio en la clase App
    LinkedList<HiloHijo> hijitos; 
    LinkedList<Figura> figuritas;
    
    public HiloPadre(LinkedList<Figura> figuritas) {
        hijitos = new LinkedList<HiloHijo>();
        this.figuritas = figuritas;
    }    

    @Override
    public void run() {
        //dependiendo del numero de figuras recibidas, se crea dicho numero de hilos hijos
        //cada hilo hijo recibe una figura
        for(int i = 0; i < figuritas.size(); i++){
            hijitos.add(new HiloHijo(figuritas.get(i)));
        }

        //recorre cada hilo hijo y lo inicia
        for(int j = 0; j < hijitos.size(); j++){
            hijitos.get(j).start();
        }
    }
    
}
