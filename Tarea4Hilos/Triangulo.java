//cada figura (rectangulo, cuadrado, etc) hereda de Figura, la cual se necesita para
//poder tener una clase "generica" y poder pasarla a cada hilo hijo mas facilmente
public class Triangulo extends Figura{
    public double altura;
    public double base;
    public double ladoIzquierdo;
    public double ladoDerecho;
    public String nombre = "triangulo";

    @Override
    public double getArea() {
        return (base) * (altura) * (0.5);       
    }

    @Override
    public double getPerimetro() {
        return (base + ladoIzquierdo + ladoDerecho);
    }
    
    @Override
    public String getNombre(){
        return nombre;
    }
}
