package com.edflor.collections;

import java.util.Collection;
import java.util.HashMap;
/**
 *
 * @author luis.flores.ramirez
 */
public class Map {
    public static void main(String[] args) {
         java.util.Map miMapa = new HashMap();
        miMapa.put("valor1", "Eduardo");
        miMapa.put("VAlor2", "Luis");
        miMapa.put("VAlor3", "Rosario");
        
        imprimir(miMapa.values());
    }
    
    public static void imprimir(Collection coleccion){
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
