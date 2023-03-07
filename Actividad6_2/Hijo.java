
import java.util.Stack;

public class Hijo extends Thread implements Comparable<Hijo>{
    private int fechaNacimiento;
    private Stack<String> piezasPoyo;

    public Hijo(int fechaNacimiento, Stack<String> piezasPollo){
        this.fechaNacimiento = fechaNacimiento;
        this.piezasPoyo = piezasPollo;
        setName("hilo 1");
    }

    @Override
    public void run(){
        boolean ok = false;
        try{
            System.out.println(fechaNacimiento+" tomo "+piezasPoyo.pop());
            ok = true;
        }catch(Exception e){
            ok = false;
        }

        if(!ok) System.out.println("el hijo "+getName()+"se quedo sin poyo");
    }

    @Override
    public int compareTo(Hijo hermano) {
        return Integer.compare(this.fechaNacimiento, hermano.fechaNacimiento);
    }


    
}
