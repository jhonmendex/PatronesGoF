package Estructura.Componente;

public abstract class AArchivo {

    String nombre;
    int tamano;

    public int getTamano() {
        return tamano;
    }

    public AArchivo(String nombre, int tamano) {
        //super();
        this.nombre = nombre;
        this.tamano = tamano;
    }

    public void listar() {
        System.out.println("nombre:" + nombre + " tamaño:" + tamano);
    }
}
