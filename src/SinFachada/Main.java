/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SinFachada;

public class Main {

    public static void main(String[] args) {
        ComprobarLiquidos liquidos = new ComprobarLiquidos();
        liquidos.comprobar();
        ComprobarAsiento asiento = new ComprobarAsiento();
        asiento.comprobar();
        ComprobarEspejos espejos = new ComprobarEspejos();
        espejos.comprobar();
        Arrancar arrancar = new Arrancar();
        arrancar.encenderContacto();
        System.out.println("\nProceso finalizado.");
    }
}
