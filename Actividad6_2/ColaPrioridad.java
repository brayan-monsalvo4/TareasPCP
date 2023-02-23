import java.util.PriorityQueue;

public class ColaPrioridad <T extends Comparable<T>> {
    private PriorityQueue<T> priorityQueue;
    private int numero = 0;

    public ColaPrioridad (){
        priorityQueue = new PriorityQueue<>();
    }

    public void add(T item) {
        priorityQueue.add(item);
        this.numero = numero + 1;
    }

    public T poll() {
        this.numero = numero - 1;
        return priorityQueue.poll();
    }

    public boolean isEmpty(){
        return this.priorityQueue.isEmpty();
    }

    public int getSize(){
        return numero;
    }
}
