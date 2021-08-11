package com.edflor.coleccionesgenericas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author luis.flores.ramirez
 */
public class ColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        System.out.println("===========List==============");
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Sabado");
        miLista.add("Domingo");
        imprimir(miLista);
        System.out.println();

        Set<String> miSet = new HashSet<>();
        System.out.println("===========Set==============");
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        imprimir(miSet);
        System.out.println();

        Map<String, String> miMapa = new HashMap<>();
        System.out.println("===========Map==============");
        miMapa.put("valor1", "Eduardo");
        miMapa.put("Valor2", "Luis");
        miMapa.put("Valor3", "Rosario");
        imprimir(miMapa.keySet());
        System.out.println();
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection<String> coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
