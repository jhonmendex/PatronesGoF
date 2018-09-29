package CreacionBuilder;

public class Prueba {

    public void probar() {
        Comprador jhon = new Comprador(new TiendaDeportiva());

        jhon.comprarTraje();

        Comprador jose = new Comprador(new TiendaFormal());

        jose.comprarTraje();
    } 

    public static void main(String[] args) {
        new Prueba().probar();
    }

}
