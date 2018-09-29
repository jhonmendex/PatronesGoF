package CreacionFabrica;

public class MarcoDeSecuencia extends AMarcoGrafico {
	@Override
	protected ADiagramaDeUml montarBarraDeHerramientas() {
		return  new DiagramaDeSecuencia();
	}     
}