package com.edflor.controlFlujo;
/**
 *
 * @author luis.flores.ramirez
 */
public class DooBee {
    public static void main(String[] args) {
        int x = 1;
        while (x < 3) { //Mientras x sea menor a 3 se imprimira "Doo" "Bee" las veces que itere el bucle           
            System.out.printf("Doo");
            System.out.printf("Bee");
            x = x + 1; // x aumenta en 1
        }
        if (x == 3) {
            System.out.printf("Do"); //x al valer 3 se saldra del bucle e imprimira "Do"
        }
    }
}
