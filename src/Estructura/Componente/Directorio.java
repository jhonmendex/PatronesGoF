package Estructura.Componente;

import java.util.ArrayList;
import java.util.List;

public class Directorio extends AArchivo {

    List<AArchivo> archivos = new ArrayList<AArchivo>();

    public Directorio(String nombre, int tamano) {
        super(nombre, tamano);
    }

    public void adicionar(AArchivo archivo) {
        if (archivo != null) {
            archivos.add(archivo);
        }
    }

    @Override
    public void listar() {
        System.out.print("directorio ");
        for (AArchivo archivo_i : archivos) {
            tamano += archivo_i.getTamano();
        }
        super.listar();
        for (AArchivo archivo_i : archivos) {
            archivo_i.listar();
        }
    }

    @Override
    public int getTamano() {
        int tamano = 0;
        for (AArchivo archivo_i : archivos) {
            tamano += archivo_i.getTamano();
        }
        return tamano;
    }
}
