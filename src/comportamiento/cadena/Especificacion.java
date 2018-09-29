package inv.logica.patrones.comportamiento.cadena;

/** @author Sandro Bola�os */

public class Especificacion extends AActividad {

	public Especificacion(AActividad sgte) {
		super(sgte);
	}

	@Override
	public void resolver(Artefacto artefacto) {
		if (artefacto.getTopico() == Artefacto.ARTEFACTO_DE_ESPECIFICACION){
			System.out.println("Se resuelve en la especificaci�n");
		}else{
			super.resolver(artefacto);
		}
	}

}
