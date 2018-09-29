package Creacion.prototipo;

public class Cedula implements ICopia {

    String nombre;
    int numero;

    public Object copiar() {
        Cedula copia = new Cedula();
        copia.nombre = new String(nombre);
        copia.numero = numero;
        return copia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
