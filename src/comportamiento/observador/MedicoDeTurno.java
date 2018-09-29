package inv.logica.patrones.comportamiento.observador;

/** @author Sandro Bolaños */

public class MedicoDeTurno implements IMedico {
    Temperatura temperatura;
	public Temperatura getTemperatura() {
		return temperatura;
	}
	public void setTemperatura(Temperatura temperatura) {
		this.temperatura = temperatura;
	}
	@Override
	public void observar() {
		int t=temperatura.getTemperatura();		
		System.out.println(t<30||t>40?"emergencia":"normal");
	}
}
