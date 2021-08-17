package com.edflor.genericos;

import java.util.SortedMap;
import java.util.TreeMap;

/**
 *
 * @author luis.flores.ramirez
 */
public class Magellan {

    public static void main(String[] args) {
        TreeMap<String, String> myMap = new TreeMap<String, String>();
        myMap.put("a", "apple");
        myMap.put("d", "date");
        myMap.put("f", "fig");
        myMap.put("p", "pear");
        System.out.println("sop 1 1st after mango: "
                + // sop 1
                myMap.higherKey("f"));
        System.out.println("sop 2 1st after mango: "
                + // sop 2
                myMap.ceilingKey("f"));
        System.out.println("sop 3 1st after mango: "
                + // sop 3
                myMap.floorKey("f"));
        SortedMap<String, String> sub = new TreeMap<String, String>();
        sub = myMap.tailMap("f");
        System.out.println("sop 4 1st after mango: "
                + // sop 4
                sub.firstKey());
    }
}
