package inv.logica.patrones.comportamiento.estrategia;

/** @author Sandro Bola�os */

public class SensorDeMovimiento implements IAcceso {
	@Override
	public void acceder() {
		System.out.println("entrando con "+getClass().getSimpleName());
	}
}
