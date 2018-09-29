package inv.logica.patrones.comportamiento.visitador;

import java.util.ArrayList;
import java.util.List;

/** @author Sandro Bolaños */

public class Ciudad implements ISitio {
	List<ISitio> lugares=new ArrayList<ISitio>();
	String nombre;
	public Ciudad(String nombre) {		
		this.nombre = nombre;
		lugares.add(new Parque("nacional"));
		lugares.add(new Museo("del oro"));
	}
	public String getNombre() {
		return nombre;
	}
	@Override
	public void aceptar(Visitador turista) {
		turista.visita(this);
		for(ISitio s_i:lugares){
			s_i.aceptar(turista);
		}
	}
}
