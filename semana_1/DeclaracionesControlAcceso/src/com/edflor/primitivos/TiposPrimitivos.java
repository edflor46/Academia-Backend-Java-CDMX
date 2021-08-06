package com.edflor.primitivos;

/**
 *
 * @author luis.flores.ramirez
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        /*==========Enteros==========*/
        //byte
        System.out.println("/*==========Byte==========*/");
        byte numeroBite = 10;
        System.out.println("numeroBite = " + numeroBite);
        System.out.println("Valor minimo del byte = " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte = " + Byte.MAX_VALUE);
        System.out.println();

        //short
        System.out.println("/*==========Short==========*/");
        short numeroShort = 10;
        System.out.println("numeroBite = " + numeroShort);
        System.out.println("Valor minimo del short = " + Short.MIN_VALUE);
        System.out.println("Valor maximo del short = " + Short.MAX_VALUE);
        System.out.println();

        //int
        System.out.println("/*==========Int==========*/");
        int numeroInt = 10;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo del int = " + Integer.MIN_VALUE);
        System.out.println("Valor maximo del int = " + Integer.MAX_VALUE);
        System.out.println();

        //long
        System.out.println("/*==========Long==========*/");
        long numeroLong = 10;
        System.out.println("numeroInt = " + numeroLong);
        System.out.println("Valor minimo del long = " + Long.MIN_VALUE);
        System.out.println("Valor maximo del long = " + Long.MAX_VALUE);
        System.out.println();

        /*==========Flotantes==========*/
        //float
        System.out.println("/*==========Float==========*/");
        float numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo del float = " + Float.MIN_VALUE);
        System.out.println("Valor maximo del float = " + Float.MAX_VALUE);
        System.out.println();
        
        //double
         System.out.println("/*==========Double==========*/");
        double numeroDouble = 10;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo del double = " + Double.MIN_VALUE);
        System.out.println("Valor maximo del double = " + Double.MAX_VALUE);
        System.out.println();
        
        /*==========Char==========*/
         System.out.println("/*==========Char==========*/");
        char miCaracter = '\u0021';
        System.out.println("miCaracter = " + miCaracter);
        System.out.println();
        
        char charDecimal = 33;
        System.out.println("charDecimal = " + charDecimal);
        System.out.println();
        
        char charSimbolo = '!';
        System.out.println("charSimbolo = " + charSimbolo);
        System.out.println();
        /*==========Boolean==========*/
         System.out.println("/*==========Boolean==========*/");
        boolean falseBoolean = false;
        System.out.println("varBoolean = " + falseBoolean);
        
        boolean trueBoolean = true;
        System.out.println("trueBoolean = " + trueBoolean);
        
    }
}
