import java.util.Stack;

import javax.swing.JSpinner.NumberEditor;

public class Madre extends Thread {
    
    Stack <String> pollo = new Stack<String>();
    ColaPrioridad<Hijo> cuatrillizos = new ColaPrioridad<Hijo>();
    ColaPrioridad<Hijo> trillizos = new ColaPrioridad<Hijo>();
    ColaPrioridad<Hijo> gemelos = new ColaPrioridad<Hijo>();
    ColaPrioridad<Hijo> hijos = new ColaPrioridad<Hijo>();

    public Madre(){
        prepararPollo(pollo);
        agregarHijos(hijos);
        System.out.println("piezas de poyo: "+pollo.size());
    }


    @Override
    public void run(){
        Hijo aux;
        while(!trillizos.isEmpty() || !cuatrillizos.isEmpty() || !gemelos.isEmpty() || !hijos.isEmpty()){
            if(!trillizos.isEmpty()){
            
                aux = trillizos.poll();
                aux.start();
    
                /*try {
                    aux.join();
                } catch (Exception e) {
                    // TODO: handle exception
                }*/
    
            }else if (!cuatrillizos.isEmpty()){
                aux = cuatrillizos.poll();
                aux.start();
                
            }else if(!gemelos.isEmpty()){
                aux = gemelos.poll();
                aux.start();
                
            }else{
                aux = hijos.poll();
                aux.start();
                
            }
        }
    }

    

    public void agregarHijos(ColaPrioridad<Hijo> h){
        //trillizos
        trillizos.add(new Hijo(1, pollo));
        trillizos.add(new Hijo(1, pollo));
        trillizos.add(new Hijo(1, pollo));
        trillizos.add(new Hijo(2, pollo));
        trillizos.add(new Hijo(2, pollo));
        trillizos.add(new Hijo(2, pollo));
        trillizos.add(new Hijo(3, pollo));
        trillizos.add(new Hijo(3, pollo));
        trillizos.add(new Hijo(3, pollo));
        trillizos.add(new Hijo(4, pollo));
        trillizos.add(new Hijo(4, pollo));
        trillizos.add(new Hijo(4, pollo));

        //cuatrillizos
        cuatrillizos.add(new Hijo(5, pollo));
        cuatrillizos.add(new Hijo(5, pollo));
        cuatrillizos.add(new Hijo(5, pollo));
        cuatrillizos.add(new Hijo(5, pollo));
        cuatrillizos.add(new Hijo(6, pollo));
        cuatrillizos.add(new Hijo(6, pollo));
        cuatrillizos.add(new Hijo(6, pollo));
        cuatrillizos.add(new Hijo(6, pollo));
        cuatrillizos.add(new Hijo(7, pollo));
        cuatrillizos.add(new Hijo(7, pollo));
        cuatrillizos.add(new Hijo(7, pollo));
        cuatrillizos.add(new Hijo(7, pollo));

        //gemelos
        gemelos.add(new Hijo(8, pollo));
        gemelos.add(new Hijo(8, pollo));
        gemelos.add(new Hijo(9, pollo));
        gemelos.add(new Hijo(9, pollo));
        gemelos.add(new Hijo(10, pollo));
        gemelos.add(new Hijo(10, pollo));
        gemelos.add(new Hijo(11, pollo));
        gemelos.add(new Hijo(11, pollo));
        gemelos.add(new Hijo(12, pollo));
        gemelos.add(new Hijo(12,pollo)); 
        gemelos.add(new Hijo(13, pollo));
        gemelos.add(new Hijo(13, pollo));

        //partos unicos
        hijos.add(new Hijo(14, pollo));

        hijos.add(new Hijo(15, pollo));

        hijos.add(new Hijo(16, pollo));

        hijos.add(new Hijo(17, pollo));

        hijos.add(new Hijo(18, pollo));

        hijos.add(new Hijo(19, pollo));

        hijos.add(new Hijo(20, pollo));

        hijos.add(new Hijo(21, pollo));

        hijos.add(new Hijo(22, pollo));


    }

    private void prepararPollo(Stack<String> pollito){
        for(int i = 0; i < 45; i++){
            pollito.push("pieza de pollo ".concat(String.valueOf(i+1)));
        }
    }
}