package com.edflor.herencia;

/**
 *
 * @author luis.flores.ramirez
 */
class Top {

    public Top(String s) {
        System.out.println("B");
    }
}

public class Bottom2 extends Top {

    public Bottom2(String s) {
        //Solucion: Agregar super y el parametro requerido
        super(s);
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Bottom2("C");
        System.out.println(" ");
    }
}

/**
 * Cual es el resultado?
 * El resultado es "Compilation Fails", debido a que la
 * clase Ejercicio esta heredando de la clase Top pero la clase Bottom2 no esta
 * usando "Super" por tal motivo arrojara un error de compilacion
 *
 */
