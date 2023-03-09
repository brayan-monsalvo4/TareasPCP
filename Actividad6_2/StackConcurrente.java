import java.util.Stack;

public class StackConcurrente <T>{
    private Stack<T> pilita;
    public StackConcurrente (){
        pilita = new Stack<T>();
    }

    public synchronized int size(){
        return this.pilita.size();
    }

    public synchronized T pop(){
        return this.pilita.pop();
    }

    public synchronized void push(T element){
        this.pilita.push(element);
    }
}
