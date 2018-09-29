package inv.logica.patrones.comportamiento.iterador;

/** @author Sandro Bola�os */

public class Nomina implements IAgregado<Empleado>{
	@Override
	public IIterador<Empleado> crearIterador() {		
		return new Lista<Empleado>(new Empleado[]{new Empleado("sandro"),new Empleado("javier")});
	}
}
