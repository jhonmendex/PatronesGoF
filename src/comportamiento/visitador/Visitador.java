package inv.logica.patrones.comportamiento.visitador;

/** @author Sandro Bolaños */

public interface Visitador {
	  void visita(Parque parque);
	  void visita(Museo museo);
      void visita(Ciudad ciudad);
	  String getNombre();
}
