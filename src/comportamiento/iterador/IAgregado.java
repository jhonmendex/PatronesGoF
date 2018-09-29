package inv.logica.patrones.comportamiento.iterador;

/** @author Sandro Bolaños */

public interface IAgregado<T>{
       IIterador<T> crearIterador();
}
