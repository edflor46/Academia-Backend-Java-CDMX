## Semana 4
### Strings
**Formas de concatenar**

<pre>
    <code>      
Show two ways to concatenate the following two strings together to get the string "Hi, mom.":

String hi = "Hi, ";

String mom = "mom.";
    </code>
</pre>

**Respuesta**
<pre>
    <code>
package com.edflor.ejercicios;
/**
 *
 * @author luis.flores.ramirez
 */
public class Ejercicio1 {
    public static void main(String[] args) {
        String hi = "Hi, ";
        String mom = "mom.";
        //Concatenar con +
        System.out.println("/*========== Concatenar con + ==========*/");
        System.out.printf(hi+mom);
        System.out.println();
        //Concatenar con concat()
        System.out.println("/*========== Concatenar con concat() ==========*/");
        System.out.printf(hi.concat(mom));
    }
}
    </code>
</pre>

![Concatenar](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1628614518/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/concatenar_strings_rrnhk3.png)

**Inmutabilidad**
<pre>
    <code>
package com.edflor.ejercicios;
/**
 *
 * @author luis.flores.ramirez
 */
public class StringImmutability {
    public static void main(String[] args) {
		// Instance the strings
		String s1 = "Hello";
		String s2 = s1.concat(" world");
		String s3 = s2.toUpperCase();
		
		// Prints each string value
		System.out.println("s1: " + s1);
		System.out.println("s2: " + s2);
		System.out.println("s3: " + s3);
	}
}
    </code>
</pre>

![inmutabilidad](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1628615205/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/inmutability_xl1yd1.png)

**String Literal - String New**
<pre>
    <code>
    public static void main(String[] args) {
		String literal1 = "Hello"; // Java compiler puts the literal in the string pool
		String literal2 = "Hello"; // Java compiler checks if the literal is already in the string pool
		String example = new String("Hello"); // Java compiler handles this string as any other object
		
		// Prints strings comparation
		System.out.println("literal1 == literal2 " + (literal1 == literal2));
		System.out.println("example == literal1 " + (example == literal1));
		System.out.println("example == literal2 " + (example == literal2));
		System.out.println("example equals to literal1 " + (example.equals(literal1)));
		System.out.println("example equals to literal2 " + (example.equals(literal2)));
	}
    </code>
</pre>

![inmutabilidad](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1628615575/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/literalnew_gcgpv2.png)

### Collections
**Set**
<pre>
    <code>
package com.edflor.collections;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author luis.flores.ramirez
 */
public class Set {
    public static void main(String[] args) {
        HashSet<String> s1 = new HashSet <String>();
        s1.add("Hola");
        s1.add("Hola amigo");
        s1.add("Encantado de conocerte");
        s1.add("Se me hace tarde");
        s1.add("Espero verte pronto");
        s1.add("Adios");
 
        s1.add("Adios"); //Intentamos añadir un duplicado.
 
        System.out.println("Numero de elementos: " + s1.size() + "\n");
 
        Iterator i = s1.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
    </code>
</pre>
![Set](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1628696208/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/Set_y4eslz.png)

### Genericos
**Clase Generica**
<pre>
    <code>
Programa que mediante una clase generica imprime por pantalla el tipo de dato que recibe por parametro.

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
    </code>
</pre>
![Generics](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1628653426/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/Generics_sctqgy.png)

**Colecciones Genericas**
<pre>
    <code>
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
        System.out.println("===========Set==============");
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
    </code>
</pre>

![c_genericas](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1628654495/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/Colecciones_genericos_ghxs0d.png)