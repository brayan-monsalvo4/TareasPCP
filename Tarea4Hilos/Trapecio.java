//cada figura (rectangulo, cuadrado, etc) hereda de Figura, la cual se necesita para
//poder tener una clase "generica" y poder pasarla a cada hilo hijo mas facilmente
public class Trapecio extends Figura{
    public double baseMenor;
    public double baseMayor;
    public double ladoIzquierdo;
    public double ladoDerecho;
    public double altura;
    public String nombre = "trapecio";

    @Override
    public double getArea() {
        double area = (baseMayor + baseMenor) * altura * (0.5);
        return area;
        
    }
    @Override
    public double getPerimetro() {
        double perimetro = baseMayor + baseMenor + ladoIzquierdo + ladoDerecho;
        return perimetro;        
    }

    @Override
    public String getNombre(){
        return nombre;
    }
}
