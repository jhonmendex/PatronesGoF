package inv.logica.patrones.comportamiento.visitador;

/** @author Sandro Bolaños */

public class Museo implements ISitio {
	String nombre;
	public Museo(String nombre) {		
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	@Override
	public void aceptar(Visitador turista) {
		System.out.println("el museo acepta el "+turista.getClass().getSimpleName()+ " "+turista.getNombre());
		turista.visita(this);
	}
}
