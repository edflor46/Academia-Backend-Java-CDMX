package com.edflor.pasoPorValor;
/**
 *
 * @author luis.flores.ramirez
 */
public class PasoPorValor {
    public static void main(String[] args) {
        int x = 10;
        System.out.println("x = " + x);
        
        cambiarValor(x);
        
        System.out.println("valor de X " + x);
    }
    
    public static void cambiarValor(int arg1){
        arg1 = 15;
        System.out.println("arg1 = " + arg1);
    }
}
