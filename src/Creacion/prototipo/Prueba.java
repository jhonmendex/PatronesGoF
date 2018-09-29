package Creacion.prototipo;

public class Prueba {
//crea copias del objeto para no afectar el objeto original
    public void probar() {
        new Ciudadano().hacerCopias();
    }

    public static void main(String[] args) {
        new Prueba().probar();
    }
}
