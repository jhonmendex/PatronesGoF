package Estructura.proxy;

public class Efectivo extends APago {
	private int valor;
	public Efectivo(int valor) {		
		this.valor = valor;
	}
	@Override
	public int pagar() {
		return valor;
	}
}
