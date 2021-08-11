package com.edflor.genericos;

/**
 *
 * @author luis.flores.ramirez
 */
//Declaracion de clase generica
class ClaseGenericos<T> {

    //Se asigna un atrbuto de tipo T que hace referencia a que es un generico
    private T objeto;

    //Inicializacion del atributo
    public ClaseGenericos(T objeto) {
        this.objeto = objeto;
    }

    //Imprime por pantalla el tipo que recibe el constructor como argumento
    public void detectarTipo() {
        System.out.println("El tipo T es: " + objeto.getClass().getSimpleName());
    }
}

public class Genericos{
    public static void main(String[] args) {
        //Tipo Integer
        ClaseGenericos<Integer> objetoInt = new ClaseGenericos(1);
        objetoInt.detectarTipo();
        
        //Tipo String
        ClaseGenericos<String> objetoStr = new ClaseGenericos("Eduardo");
        objetoStr.detectarTipo();
        
        //Tipo Boolean
        ClaseGenericos<Boolean> objetoBool = new ClaseGenericos(true);
        objetoBool.detectarTipo();
    }
}

