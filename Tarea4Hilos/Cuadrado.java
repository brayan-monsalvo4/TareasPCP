//cada figura (rectangulo, cuadrado, etc) hereda de Figura, la cual se necesita para
//poder tener una clase "generica" y poder pasarla a cada hilo hijo mas facilmente
public class Cuadrado extends Figura{
    public double lado;
    public String nombre = "cuadrado";

    @Override
    public double getArea() {
        return (lado * lado);
    }

    @Override
    public double getPerimetro() {
        return (lado * 4);        
    }

    @Override
    public String getNombre(){
        return nombre;
    }
}
