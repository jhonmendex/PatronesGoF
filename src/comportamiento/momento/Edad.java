package comportamiento.momento;

/** @author Sandro Bola�os */

public class Edad {
    int numeroDeAnos;
    String etapaDeLaVida;
	public Edad(int numeroDeAnos, String etapaDeLaVida) {		
		this.numeroDeAnos = numeroDeAnos;
		this.etapaDeLaVida = etapaDeLaVida;
	}
	public int getNumeroDeAnos() {
		return numeroDeAnos;
	}
	public void setNumeroDeAnos(int numeroDeAnos) {
		this.numeroDeAnos = numeroDeAnos;
	}
	public String getEtapaDeLaVida() {
		return etapaDeLaVida;
	}
	public void setEtapaDeLaVida(String etapaDeLaVida) {
		this.etapaDeLaVida = etapaDeLaVida;
	}      
}
