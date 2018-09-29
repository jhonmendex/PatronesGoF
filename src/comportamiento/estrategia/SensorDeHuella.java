package inv.logica.patrones.comportamiento.estrategia;

/** @author Sandro Bolaños */

public class SensorDeHuella implements IAcceso {
	@Override
	public void acceder() {
		System.out.println("entrando con "+getClass().getSimpleName());

	}
}
