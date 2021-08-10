package com.edflor.ejercicios;
/**
 *
 * @author luis.flores.ramirez
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        String hi = "Hi, ";
        String mom = "mom.";
        //Concatenar con +
        System.out.println("/*========== Concatenar con + ==========*/");
        System.out.printf(hi+mom);
        System.out.println();
        //Concatenar con concat()
        System.out.println("/*========== Concatenar con concat() ==========*/");
        System.out.printf(hi.concat(mom));
    }
}
