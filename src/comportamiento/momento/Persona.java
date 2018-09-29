package comportamiento.momento;

/** @author Sandro Bola�os */

public class Persona {
	int numeroDeAnos;
	String etapaDeLaVida;
	String nombre;
	public Persona(int numeroDeAnos, String etapaDeLaVida, String nombre) {		
		this.numeroDeAnos = numeroDeAnos;
		this.etapaDeLaVida = etapaDeLaVida;
		this.nombre = nombre;
	}
	public Edad getEdad(){
		return new Edad(numeroDeAnos,etapaDeLaVida);
	}
	public void setEdad(Edad edad){
		numeroDeAnos = edad.getNumeroDeAnos();
		etapaDeLaVida = edad.getEtapaDeLaVida();
	}
}
