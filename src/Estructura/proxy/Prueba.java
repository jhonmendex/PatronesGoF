package Estructura.proxy;

public class Prueba {
	public void probar(){
		APago efectivo = new Efectivo(10000);
		APago sustituto = new Cheque(efectivo);		
		sustituto.pagar();
	}
	 
	public static void main(String[] args) {
		new Prueba().probar();
	}
}
