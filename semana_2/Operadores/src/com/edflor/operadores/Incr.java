package com.edflor.operadores;

/**
 *
 * @author luis.flores.ramirez
 */
public class Incr {
    public static void main(String[] args) {
        Integer x = 7;
        int y = 2;

        x *= x; // Multiplica 7 * 7 = 49  
        y *= y;  // Multiplica 2 * 2 = 4  
        y *= y; // Multiplica 4 * 4 = 16
        x -= y; // Resta 49 - 16 

        System.out.println("x = " + x);
    }
}
