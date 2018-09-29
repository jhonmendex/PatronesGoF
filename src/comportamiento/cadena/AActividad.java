package inv.logica.patrones.comportamiento.cadena;

/** @author Sandro Bolaños */

public abstract class AActividad {
	AActividad sgte;

	public AActividad(AActividad sgte) {
		super();
		this.sgte = sgte;
	}
	
	public void resolver(Artefacto artefacto){
		if (haySiguiente()){
			sgte.resolver(artefacto);
		}else{
			System.out.println("No es un artefacto de software.");
		}
	}

	private boolean haySiguiente() {
		return sgte != null;
	}
}
