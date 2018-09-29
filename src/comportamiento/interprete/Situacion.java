package inv.logica.patrones.comportamiento.interprete;

/** @author Sandro Bolaños */

public class Situacion {
	String sentencia;
	boolean valor;
	
	public Situacion(String sentencia, boolean valor) {
		this.sentencia = sentencia;
		this.valor = valor;
	}

	public String getSentencia() {
		return sentencia;
	}

	public void setSentencia(String sentencia) {
		this.sentencia = sentencia;
	}

	public boolean isValor() {
		return valor;
	}

	public void setValor(boolean valor) {
		this.valor = valor;
	}
	
	
}
