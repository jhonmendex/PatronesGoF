package inv.logica.patrones.comportamiento.metodoPlantilla;

/** @author Sandro Bola�os */

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
