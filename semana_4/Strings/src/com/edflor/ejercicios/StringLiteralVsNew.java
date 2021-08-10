package com.edflor.ejercicios;

/**
 *
 * @author luis.flores.ramirez
 */
public class StringLiteralVsNew {

    public static void main(String[] args) {
        String literal1 = "Hello"; // Java compiler puts the literal in the string pool
        String literal2 = "Hello"; // Java compiler checks if the literal is already in the string pool
        String example = new String("Hello"); // Java compiler handles this string as any other object

        // Prints strings comparation
        System.out.println("literal1 == literal2 " + (literal1 == literal2));
        System.out.println("example == literal1 " + (example == literal1));
        System.out.println("example == literal2 " + (example == literal2));
        System.out.println("example equals to literal1 " + (example.equals(literal1)));
        System.out.println("example equals to literal2 " + (example.equals(literal2)));
    }
}
