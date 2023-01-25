public class HiloHijo extends Thread{
	Figura fig;

	//el hilo hijo recibe una figura
	public HiloHijo(Figura figurita){
		fig = figurita;
	}

	//al ser llamado cada hijo, imprime el nombre, area y perimetro de la figura que le toco
	@Override
	public void run() {
		System.out.println(fig.getNombre()+", Area: "+(fig.getArea())+", Perimetro: "+(fig.getPerimetro()));
	}


}
