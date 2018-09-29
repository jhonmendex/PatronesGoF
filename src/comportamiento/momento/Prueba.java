package comportamiento.momento;

/** @author Sandro Bola�os */

public class Prueba {
    public void probar(){
    	 Persona sandro = new Persona(42,"adultes","sandro");
    	 Persona isabella = new Persona(5,"ni�es","isabella");
    	 Persona jhon = new Persona(27,"juventud","john");
    	 
    	 Vida etapas = new Vida();
    	 etapas.cumplirAnos(sandro.getEdad());
    	 etapas.cumplirAnos(isabella.getEdad());
    	 etapas.cumplirAnos(jhon.getEdad());
    	 
    	 while(etapas.hayEdades()){
    		  Edad edad=etapas.consultarAnos();
    		  System.out.println(edad.getEtapaDeLaVida()+" "+edad.getNumeroDeAnos());
    	 }
    	 
    }
	public static void main(String[] args) {
		new Prueba().probar();
	}
}
