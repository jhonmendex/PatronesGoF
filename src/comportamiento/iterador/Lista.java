package inv.logica.patrones.comportamiento.iterador;

/** @author Sandro Bolaños */

public class Lista<T> implements IIterador<T> {
	int posicion;
	T[] items;
	
	public Lista(T[] items) {		
		this.posicion = 0;
		this.items = items;
	}
	@Override
	public void situarseEnPrimero() {
		posicion = 0;		
	}
	@Override
	public void irASiguiente() {
		posicion++;		
	}
	@Override
	public boolean termino() {
		return posicion>=items.length;
		
	}
	@Override
	public T getActualItem() {		
		if(termino()){
		   throw new IndexOutOfBoundsException();
		}
		return items[posicion];
	}
}
