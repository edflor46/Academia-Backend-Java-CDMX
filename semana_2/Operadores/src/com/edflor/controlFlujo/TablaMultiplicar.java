package com.edflor.controlFlujo;

/**
 *
 * @author luis.flores.ramirez
 */
public class TablaMultiplicar {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("\t" + i*j);  
            }
        System.out.println("\n");
        }
    }
}
