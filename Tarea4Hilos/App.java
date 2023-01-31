import java.util.LinkedList;
import java.util.Scanner;

public class App {
    public static void main(String args[]){
        /*LinkedList<Figura> listaFiguras = new LinkedList<>();
        
        Trapecio trap = new Trapecio();
        
		Scanner obj = new Scanner(System.in);
	
		System.out.println("\nTrapecio: ingrese el valor de uno de su lado izquierdo.");
		trap.ladoIzquierdo = obj.nextDouble();

		System.out.println("Trapecio: ingrese el valor de uno de su lado derecho.");
		trap.ladoDerecho = obj.nextDouble();

		System.out.println("Trapecio: ingrese el valor de su base mayor.");
		trap.baseMayor = obj.nextDouble();

		System.out.println("Trapecio: ingrese el valor de su base menor.");
		trap.baseMenor = obj.nextDouble();

		System.out.println("Trapecio: ingrese el valor de su altura.");
		trap.altura = obj.nextDouble();
		

        listaFiguras.add(trap);
        
        HiloPadre padrecito = new HiloPadre(listaFiguras);

        padrecito.start();
        */
		
		try{
			if (args[0].contains("teclado")) porTeclado();
		}catch(Exception e){
			pruebaValoresDef();
		}

    }

    public static void porTeclado(){
        LinkedList<Figura> listaFiguras = new LinkedList<>();
        
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        Trapecio trap = new Trapecio();
        Rectangulo rectangulo = new Rectangulo();
        
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Triangulo: ingrese el valor de su lado izquierdo.");
        triangulo.ladoIzquierdo = obj.nextDouble();

		System.out.println("Triangulo: ingrese el valor de lado derecho.");
		triangulo.ladoDerecho = obj.nextDouble();

		System.out.println("Triangulo: ingrese el valor de su altura.");
		triangulo.altura = obj.nextDouble();

		System.out.println("Triangulo: ingrese el valor de su base.");
		triangulo.base = obj.nextDouble();


		System.out.println("\nCuadrado: ingrese el valor de uno de sus lados.");
		cuadrado.lado = obj.nextDouble();
		

		System.out.println("\nTrapecio: ingrese el valor de uno de su lado izquierdo.");
		trap.ladoIzquierdo = obj.nextDouble();

		System.out.println("Trapecio: ingrese el valor de uno de su lado derecho.");
		trap.ladoDerecho = obj.nextDouble();

		System.out.println("Trapecio: ingrese el valor de su base mayor.");
		trap.baseMayor = obj.nextDouble();

		System.out.println("Trapecio: ingrese el valor de su base menor.");
		trap.baseMenor = obj.nextDouble();

		System.out.println("Trapecio: ingrese el valor de su altura.");
		trap.altura = obj.nextDouble();
		
		System.out.println("\nRectangulo: ingrese el valor de su base.");
		rectangulo.base = obj.nextDouble();

		System.out.println("Rectangulo: ingrese el valor de su altura.");
		rectangulo.altura = obj.nextDouble();

    
        //se agregan las figuras a la lista ligada
        listaFiguras.add(triangulo);
        listaFiguras.add(trap);
        listaFiguras.add(rectangulo);
        listaFiguras.add(cuadrado);
        
        //la lista se le pasa al hilo padre
        HiloPadre padrecito = new HiloPadre(listaFiguras);

        //inicia el hilo padre
        padrecito.start();
    }

	public static void pruebaValoresDef(){
		LinkedList<Figura> listaFiguras = new LinkedList<>();
        
        Triangulo triangulo = new Triangulo();
        Cuadrado cuadrado = new Cuadrado();
        Trapecio trap = new Trapecio();
        Rectangulo rectangulo = new Rectangulo();

		triangulo.ladoIzquierdo = 3;
		triangulo.ladoDerecho = 3;
		triangulo.base = 3;
		triangulo.altura = 4;

		cuadrado.lado = 5;

		trap.ladoIzquierdo = 25;
		trap.ladoDerecho = 25;
		trap.baseMenor = 30;
		trap.baseMayor = 40;
		trap.altura = 25;

		rectangulo.base = 20;
		rectangulo.altura = 10;
		
		listaFiguras.add(triangulo);
		listaFiguras.add(cuadrado);
		listaFiguras.add(trap);
		listaFiguras.add(rectangulo);
		
		HiloPadre padrecito = new HiloPadre(listaFiguras);

		padrecito.start();

	}

}
