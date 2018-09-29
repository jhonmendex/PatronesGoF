package inv.logica.patrones.comportamiento.metodoPlantilla;

/** @author Sandro Bolaños */

public class Futbolista extends ADeportista {
	@Override
	public void ganar() {
		System.out.println("ganando el mundila");	}
	@Override
	public void competir() {
		System.out.println("jugando el mundial");
	}
	@Override
	public void entrenar() {
		System.out.println("entrenando para el mundial");
	}
}
