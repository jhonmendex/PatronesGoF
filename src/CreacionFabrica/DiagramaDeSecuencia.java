package CreacionFabrica;

public class DiagramaDeSecuencia extends ADiagramaDeUml {
	public DiagramaDeSecuencia() {
	cargarArtefactos();
	}

    @Override
    public void cargarArtefactos() {
        	System.out.println("creando un diagrama de secuencia: objeto, kkinea, peticiones");
    }
}
