package Creacion.prototipo;
 
public class Ciudadano {

    public void hacerCopias() {
        Cedula nit = new Cedula();
        nit.setNumero(123456789);
        nit.setNombre("Jhon mendez");
        Cedula copiaDeLaCedula = (Cedula) nit.copiar();
        System.out.println("nombre: " + copiaDeLaCedula.nombre + "\ncc....: " + copiaDeLaCedula.numero);
    }
}
