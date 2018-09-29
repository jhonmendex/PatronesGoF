package inv.logica.patrones.comportamiento.metodoPlantilla;

/** @author Sandro Bolaños */

public class Ciclista extends ADeportista {
	@Override
	public void ganar() {
		System.out.println("ganando el tour");	}
	@Override
	public void competir() {
		System.out.println("corriendo el tour");
	}
	@Override
	public void entrenar() {
		System.out.println("entrenando para el tour");
	}
}
