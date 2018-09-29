package inv.logica.patrones.comportamiento.observador;

/** @author Sandro Bolaños */

public class Prueba {
    public void probar(){
    	Temperatura t= new Temperatura(35);
    	MedicoDeTurno medico = new MedicoDeTurno();
    	medico.setTemperatura(t);
    	t.entrarAlTurno(medico);
    	t.presentarNovedad();
    	t.setTemperatura(41);
    	t.presentarNovedad();
    }
	public static void main(String[] args) {
		new Prueba().probar();
	}

}
