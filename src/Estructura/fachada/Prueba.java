package Estructura.fachada;
import java.io.IOException;
 
public class Prueba implements ICompilable {

	@Override
	public void compilar() {
		String[] ruta = {"cmd", "/c", "start", "C:\\Program Files\\Java\\jdk1.8.0_20\\bin\\javac.exe"};
		try {
			Process proceso = Runtime.getRuntime().exec(ruta);
			proceso.waitFor();
			byte be[] = new byte[100];
			System.err.println(proceso.getErrorStream().read(be));
			byte bi[] = new byte[100];
			System.out.println(proceso.getInputStream().read(bi));
			byte bo[] = new byte[100];
			proceso.getOutputStream().write(bo);
		} catch (IOException | InterruptedException e) {			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new Prueba().compilar();
	}

}
