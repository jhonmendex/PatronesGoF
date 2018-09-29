package comportamiento.momento;

import java.util.Stack;

/** @author Sandro Bola�os */

public class Vida {
       Stack<Edad> edades=new Stack<Edad>();
       public void cumplirAnos(Edad edad){
    	   edades.push(edad);
       }
       public Edad consultarAnos(){
    	   return edades.pop();
       }
       public boolean hayEdades(){
    	   return !edades.isEmpty();
       }
}
