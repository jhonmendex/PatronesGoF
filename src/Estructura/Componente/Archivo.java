package Estructura.Componente;

public class Archivo extends AArchivo{
	public Archivo(String nombre, int tamano) {
		super(nombre, tamano);
	}

	@Override
	public void listar() {
		System.out.print("Archivo");
		super.listar();
	}
	
}
