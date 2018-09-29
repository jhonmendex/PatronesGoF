package inv.logica.patrones.comportamiento.visitador;

/** @author Sandro Bolaños */

public class Turista implements Visitador {
    String nombre;
	public Turista(String nombre) {		
		this.nombre = nombre;
	}

	@Override
	public void visita(Parque parque) {
		   System.out.println("visitando el "+parque.getClass().getSimpleName() +" "+ parque.getNombre());
	}

	@Override
	public void visita(Museo museo) {
		   System.out.println("visitando el "+museo.getClass().getSimpleName() +" "+ museo.getNombre());	
	}

	@Override
	public void visita(Ciudad ciudad) {
		  System.out.println("visitando la "+ciudad.getClass().getSimpleName() +" "+ ciudad.getNombre());	
	}

	@Override
	public String getNombre() {		
		return nombre;
	}
}
