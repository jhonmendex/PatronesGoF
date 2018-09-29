package inv.logica.patrones.comportamiento.visitador;

/** @author Sandro Bolaños */

public class Parque implements ISitio{
	String nombre;
	public Parque(String nombre) {		
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	@Override
	public void aceptar(Visitador turista) {
		System.out.println("el parque acepta el "+turista.getClass().getSimpleName()+ " "+turista.getNombre());
		turista.visita(this);
	}	
}
