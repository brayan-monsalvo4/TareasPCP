//cada figura (rectangulo, cuadrado, etc) hereda de Figura, la cual se necesita para
//poder tener una clase "generica" y poder pasarla a cada hilo hijo mas facilmente

public class Rectangulo extends Figura{
    public double base;
    public double altura;
    public String nombre = "rectangulo";

    @Override
    public double getArea() {
        return ( base * altura);
    }
    
    @Override
    public double getPerimetro() {
        return ( (base * 2) + (altura * 2) );        
    }

    @Override
    public String getNombre(){
        return nombre;
    }
}
