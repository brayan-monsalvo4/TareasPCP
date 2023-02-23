
import java.util.Stack;

public class Hijo extends Thread implements Comparable<Hijo>{
    private int fechaNacimiento;
    private Stack<String> piezasPoyo;

    public Hijo(int fechaNacimiento, Stack<String> piezasPollo){
        this.fechaNacimiento = fechaNacimiento;
        this.piezasPoyo = piezasPollo;
    }

    @Override
    public void run(){
        System.out.println(fechaNacimiento+" tomo "+piezasPoyo.pop());
    }

    @Override
    public int compareTo(Hijo hermano) {
        return Integer.compare(this.fechaNacimiento, hermano.fechaNacimiento);
    }
}
