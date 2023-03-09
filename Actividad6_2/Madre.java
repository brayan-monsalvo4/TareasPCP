import java.util.Stack;

public class Madre extends Thread {
    
    StackConcurrente <String> pollo = new StackConcurrente<String>();
    ColaPrioridad<Hijo> cuatrillizos = new ColaPrioridad<Hijo>();
    ColaPrioridad<Hijo> trillizos = new ColaPrioridad<Hijo>();
    ColaPrioridad<Hijo> gemelos = new ColaPrioridad<Hijo>();
    ColaPrioridad<Hijo> hijos = new ColaPrioridad<Hijo>();


    ColaPrioridad<Hijo> pendientes = new ColaPrioridad<Hijo>();

    public Madre(){
        prepararPollo(pollo,45);
        agregarHijos(hijos);
        System.out.println("piezas de poyo: "+pollo.size());
    }


    @Override
    public void run(){
        Hijo aux = null;
        while(!trillizos.isEmpty() || !cuatrillizos.isEmpty() || !gemelos.isEmpty() || !hijos.isEmpty()){
            if(!trillizos.isEmpty()){
            
                aux = trillizos.poll();
                aux.start();
                
    
                try {
                    aux.join();
                } catch (Exception e) {
                }
    
            }else if (!cuatrillizos.isEmpty()){
                aux = cuatrillizos.poll();
                aux.start();
                try {
                    aux.join();
                } catch (Exception e) {
                }
                
            }else if(!gemelos.isEmpty()){
                aux = gemelos.poll();
                aux.start();
                try {
                    aux.join();
                } catch (Exception e) {
                }
                
            }else{
                aux = hijos.poll();
                aux.start();
                
                try {
                    
                    aux.join();
                } catch (Exception e) {
                }

            }
        }

    }

    public void agregarHijos(ColaPrioridad<Hijo> h){
        //trillizos
        trillizos.add(new Hijo(1, pollo, "trillizo[1][1]"));
        trillizos.add(new Hijo(1, pollo, "trillizo[1][2]"));
        trillizos.add(new Hijo(1, pollo, "trillizo[1][3]"));

        trillizos.add(new Hijo(2, pollo, "trillizo[2][1]"));
        trillizos.add(new Hijo(2, pollo, "trillizo[2][2]"));
        trillizos.add(new Hijo(2, pollo, "trillizo[2][3]"));

        trillizos.add(new Hijo(3, pollo, "trillizo[3][1]"));
        trillizos.add(new Hijo(3, pollo, "trillizo[3][2]"));
        trillizos.add(new Hijo(3, pollo, "trillizo[3][3]"));

        trillizos.add(new Hijo(4, pollo, "trillizo[4][1]"));
        trillizos.add(new Hijo(4, pollo, "trillizo[4][2]"));
        trillizos.add(new Hijo(4, pollo, "trillizo[4][3]"));

        //cuatrillizos
        cuatrillizos.add(new Hijo(5, pollo, "cuatrillizos[1][1]"));
        cuatrillizos.add(new Hijo(5, pollo, "cuatrillizos[1][2]"));
        cuatrillizos.add(new Hijo(5, pollo, "cuatrillizos[1][3]"));
        cuatrillizos.add(new Hijo(5, pollo, "cuatrillizos[1][4]"));

        cuatrillizos.add(new Hijo(6, pollo, "cuatrillizos[2][1]"));
        cuatrillizos.add(new Hijo(6, pollo, "cuatrillizos[2][2]"));
        cuatrillizos.add(new Hijo(6, pollo, "cuatrillizos[2][3]"));
        cuatrillizos.add(new Hijo(6, pollo, "cuatrillizos[2][4]"));

        cuatrillizos.add(new Hijo(7, pollo, "cuatrillizos[3][1]"));
        cuatrillizos.add(new Hijo(7, pollo, "cuatrillizos[3][2]"));
        cuatrillizos.add(new Hijo(7, pollo, "cuatrillizos[3][3]"));
        cuatrillizos.add(new Hijo(7, pollo, "cuatrillizos[3][4]"));

        //gemelos
        gemelos.add(new Hijo(8, pollo, "gemelos[1][1]"));
        gemelos.add(new Hijo(8, pollo, "gemelos[1][2]"));

        gemelos.add(new Hijo(9, pollo, "gemelos[2][1]"));
        gemelos.add(new Hijo(9, pollo, "gemelos[2][2]"));

        gemelos.add(new Hijo(10, pollo, "gemelos[3][1]"));
        gemelos.add(new Hijo(10, pollo, "gemelos[3][2]"));

        gemelos.add(new Hijo(11, pollo, "gemelos[4][1]"));
        gemelos.add(new Hijo(11, pollo, "gemelos[4][2]"));

        gemelos.add(new Hijo(12, pollo, "gemelos[5][1]"));
        gemelos.add(new Hijo(12, pollo, "gemelos[5][2]")); 

        gemelos.add(new Hijo(13, pollo, "gemelos[6][1]"));
        gemelos.add(new Hijo(13, pollo, "gemelos[6][2]"));

        //partos unicos
        hijos.add(new Hijo(14, pollo, "unicos[1]"));
        hijos.add(new Hijo(15, pollo, "unicos[2]"));
        hijos.add(new Hijo(16, pollo, "unicos[3]"));
        hijos.add(new Hijo(17, pollo, "unicos[4]"));
        hijos.add(new Hijo(18, pollo, "unicos[5]"));
        hijos.add(new Hijo(19, pollo, "unicos[6]"));
        hijos.add(new Hijo(20, pollo, "unicos[7]"));
        hijos.add(new Hijo(21, pollo, "unicos[8]"));
        hijos.add(new Hijo(22, pollo, "unicos[9]"));


    }

    private void prepararPollo(StackConcurrente<String> pollito, int piezas){
        for(int i = 1; i <= piezas; i++){
            pollito.push("pieza de pollo ".concat(String.valueOf(i)));
        }
    }
}