
import java.util.Stack;

public class Hijo extends Thread implements Comparable<Hijo>{
    private int fechaNacimiento;
    private StackConcurrente<String> piezasPoyo;

    public Hijo(int fechaNacimiento, StackConcurrente<String> piezasPollo, String name){
        this.fechaNacimiento = fechaNacimiento;
        this.piezasPoyo = piezasPollo;
        setName(name);
    }

    @Override
    public void run(){
        boolean ok = false;
        try{
            System.out.println(getName()+" tomo "+piezasPoyo.pop());
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
