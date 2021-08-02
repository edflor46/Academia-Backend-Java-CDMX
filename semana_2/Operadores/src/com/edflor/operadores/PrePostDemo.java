package com.edflor.operadores;

/**
 *
 * @author luis.flores.ramirez
 */
public class PrePostDemo {
    public static void main(String[] args) {
        //Inicia i con un valor de 3
        int i = 3;
        
        //Postincremento, aumentara la proxima vez que se ejecute
        i++;
        
        //Al ser llamado i cambia su valor de 3 a 4 debido al postincremento
        System.out.println("i = " + i);  // "4"
        
        //Preincrement, i aumentara en 1 desde antes
        ++i;
        
        //i vale 5
        System.out.println("i = " + i);  // "5"
        
        //precremento i vale 6 debido a que se incremento antes
        System.out.println("i = " + ++i);  // "6"

        //postcremento i sigue valiendo 6, aumentara en 1 la proxima vez que sea ejecutado
        System.out.println("i = " + i++);  // "6"
        
        //i vale 7 debido al postcremento
        System.out.println("i = " + i);  // "7"

    }
}
