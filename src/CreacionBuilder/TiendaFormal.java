package CreacionBuilder;

public class TiendaFormal extends ATienda<String> {
	    String traje="";
		@Override
		public void vendeCalzado() {
			traje+="mocasín ";
			System.out.println("mocasín");
		}
		@Override
		public void vendeAjuar() {
			traje+="pantalon camisa saco ";
			System.out.println("pantalon camisa saco ");
		}
		@Override
		public void vendeAccesorios() {
			traje+="correa corbata pañuelo";
			System.out.println("correa corbata pañuelo");
		}
		public String getTraje(){
			return traje;
		}	
}
