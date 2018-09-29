package inv.logica.patrones.comportamiento.metodoPlantilla;

/** @author Sandro Bolaños */

public abstract class ADeportista {
	public void relizarDeporte() {
		entrenar();
		competir();
		ganar();
	}
	public abstract void ganar();
	public abstract void competir();
	public abstract void entrenar();
}
