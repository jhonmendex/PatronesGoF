package inv.logica.patrones.comportamiento.observador;

import java.util.ArrayList;
import java.util.List;

/** @author Sandro Bolaños */

public abstract class ASintoma {
       List<IMedico> cuerpoMedico=new ArrayList<IMedico>();
       public void entrarAlTurno(IMedico medico){
    	   cuerpoMedico.add(medico);
       }
       public void salirDelTruno(IMedico medico){
    	   cuerpoMedico.remove(medico);
       }
       public void presentarNovedad(){
    	   for(IMedico medico:cuerpoMedico){
    		   medico.observar();
    	   }
       }
}
