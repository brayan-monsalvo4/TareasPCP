public class App {
    public static void main(String args[]){
        CajaHerramientas cajita = new CajaHerramientas();

        cajita.agregarHerramienta("perico", 1);
        cajita.agregarHerramienta("gato", 1);
        cajita.agregarHerramienta("lampara", 1);

        Mecanico m1 = new Mecanico("panchito", cajita);
        Mecanico m2 = new Mecanico("jorge", cajita);
        Mecanico m3 = new Mecanico("juan", cajita);

        m1.realizarTarea(new String[]{"perico"});
        m2.realizarTarea(new String[]{"gato"});
        m3.realizarTarea(new String[]{"perico"});


        m1.start();
        m2.start();
        m3.start();

        System.out.println(cajita.getInfoHerramientas().toString());

    }
}
