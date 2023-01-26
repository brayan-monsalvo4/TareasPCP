public class Main {
    public static void main(String args[]){
        Computadora computadoras = new Computadora(2);

        Cliente juan = new Cliente(computadoras, "Juan");
        Cliente panchito = new Cliente(computadoras, "Panchito");
        Cliente jacinto = new Cliente(computadoras, "Jacinto");
        Cliente carmelo = new Cliente(computadoras, "Carmelo");

        juan.start();
        panchito.start();
        jacinto.start();
        carmelo.start();


    }
}