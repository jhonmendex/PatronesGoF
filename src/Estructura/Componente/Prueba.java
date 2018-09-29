package Estructura.Componente;

/** @author Sandro Bola�os */

public class Prueba {
	
	public void probar(){
		Archivo a1=new Archivo("a1", 10);
		Archivo a2=new Archivo("a2", 10);
		Archivo a3=new Archivo("a3", 10);
		
		Directorio d1 = new Directorio("d1",0);
		Directorio d2 = new Directorio("d2",0);
		
		d1.adicionar(a1);
		d1.adicionar(a2);
		
		d2.adicionar(a3);
		d1.adicionar(d2);
		
		d1.listar();
	}

	public static void main(String[] args) {
		new Prueba().probar();
	}

}
