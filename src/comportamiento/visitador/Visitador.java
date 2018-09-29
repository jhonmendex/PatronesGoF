package inv.logica.patrones.comportamiento.visitador;

/** @author Sandro Bola�os */

public interface Visitador {
	  void visita(Parque parque);
	  void visita(Museo museo);
      void visita(Ciudad ciudad);
	  String getNombre();
}
