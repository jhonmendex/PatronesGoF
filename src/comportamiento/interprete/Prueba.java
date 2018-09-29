package inv.logica.patrones.comportamiento.interprete;

/** @author Sandro Bola�os */

public class Prueba {

	public void probar(){
		
		boolean b[] = new boolean[]{true, false};
		
		System.out.println("USANDO ENTONCES...");
		for (boolean b_i : b) {
			for (boolean b_j : b) {
				Situacion sP = new Situacion("Si no llueve", b_i);
				Situacion sQ = new Situacion("El d�a est� lindo", b_j);				
				// Armando expresi�n booleana.
				Proposicion p = new Proposicion(sP);
				Proposicion q = new Proposicion(sQ);				
				System.out.println(sP.getSentencia() +" "+ 
						sQ.getSentencia() +" "+ 
						new ENTONCES(p, q).evaluar(
								new Situacion(sP.getSentencia() + sQ.getSentencia(), true /*No interesa*/)) 
						);		
			}
		}
		System.out.println("USANDO BICONDICIONAL...");
		for (boolean b_i : b) {
			for (boolean b_j : b) {
				Situacion sP = new Situacion("Si no llueve", b_i);
				Situacion sQ = new Situacion("El d�a est� lindo", b_j);				
				// Armando expresi�n booleana.
				Proposicion p = new Proposicion(sP);
				Proposicion q = new Proposicion(sQ);			
				System.out.println(sP.getSentencia() +" "+ 
						sQ.getSentencia() +" "+ 
						new BICONDICIONAL(p, q).evaluar(
								new Situacion(sP.getSentencia() + sQ.getSentencia(), true /*No interesa*/)) 
						);		
			}
		}
		
	}
	
	public static void main(String[] args) {
		new Prueba().probar();

	}

}