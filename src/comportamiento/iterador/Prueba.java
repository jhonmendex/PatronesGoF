package inv.logica.patrones.comportamiento.iterador;

/** @author Sandro Bolaños */

public class Prueba {
    public void probar(){
    	Nomina nomina = new Nomina();    	
    	for(IIterador<Empleado> i=nomina.crearIterador();!i.termino();i.irASiguiente()){
    		i.getActualItem().imprimir();
    	}
    }
	public static void main(String[] args) {
		new Prueba().probar();
	}
}
