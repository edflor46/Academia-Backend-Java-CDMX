package com.edflor.operadores;

/**
 *
 * @author luis.flores.ramirez
 */
public class ArithmeticDemo {
    public static void main(String[] args) {
        int result = 1 + 2; // Result is now 3
        System.out.println("result = " + result);
        
        //Operador compuesto -=
        result -= 1; //Result is now 2
        System.out.println("result =- : " + result);
        
        //Operador compuesto *=
        result *= 2; //Result is now  4
        System.out.println("result *= : " + result);
        
        //Operador compuesto /= 
        result /= 2; //Result is now 2
        System.out.println("result /= : " + result);
        
        //Operador compuesto +=
        result +=8; //Result is now 10;
        System.out.println("result += : " + result);
        
        //Operador compuesto %=
        result %= 7; //Result is now 3
        System.out.println("result %= : " + result);
    }
}
