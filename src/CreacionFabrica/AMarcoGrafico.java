package CreacionFabrica;

public abstract class AMarcoGrafico {
       public void crearMarco(){
    	   montarBarraDeHerramientas();
       }
       protected abstract ADiagramaDeUml montarBarraDeHerramientas();
}
