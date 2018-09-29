package inv.logica.patrones.comportamiento.cadena;

/** @author Sandro Bolaños */

public class Desarrollo extends AActividad {

	public Desarrollo(AActividad sgte) {
		super(sgte);		
	}

	@Override
	public void resolver(Artefacto artefacto) {
		if (artefacto.getTopico() == Artefacto.ARTEFACTO_DE_DESARROLLO){
			System.out.println("Se resuelve en el desarrollo");
		}else{
			super.resolver(artefacto);	
		}
		
	}

	
}
