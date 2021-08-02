package com.edflor.herencia;

/**
 *
 * @author luis.flores.ramirez
 */
class AgedP{
    //Constructor vacio
    AgedP(){}
    
    //Constructor con parametros
    public AgedP(int x){
        
    }
}

//Herencia de la clase AgedP
public class Kinder extends AgedP{
    //Main
    public static void main(String[] args) {
        
    }
    //Constructor y uso de super
    public Kinder(int x){
        super(x);    
    }
}
