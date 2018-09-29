package inv.logica.patrones.comportamiento.iterador;

/** @author Sandro Bola�os */

public interface IIterador<T>{
       void situarseEnPrimero();
       void irASiguiente();
       boolean termino();
       T getActualItem();
}
