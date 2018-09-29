package inv.logica.patrones.comportamiento.visitador;

/** @author Sandro Bolaños */

public class Prueba {

	public void probar(){
		Turista turista=new Turista("Sandro");
		Ciudad ciudad = new Ciudad("Bogota");
		ciudad.aceptar(turista);
	}
	public static void main(String[] args) {
		new Prueba().probar();
	}

}
