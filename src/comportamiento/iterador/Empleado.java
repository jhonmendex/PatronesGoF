package inv.logica.patrones.comportamiento.iterador;

/** @author Sandro Bola�os */

public class Empleado {
	String nombre;
	public Empleado(String nombre) {		
		this.nombre = nombre;
	}
	public void imprimir(){
		System.out.println(nombre);
	}
}
