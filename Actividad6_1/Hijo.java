
public class Hijo extends Thread{
    int[] fila;
    public Hijo(int[] f){
        fila = f; 
    }    

    @Override
    public void run(){
        int resultado = 0;

        for(int i = 0; i < fila.length; i++){
            resultado = resultado + fila[i];
        }

        System.out.println(this.getName()+" resultado: "+resultado);
    }
}
