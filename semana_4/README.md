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
 
        s1.add("Adios"); //Intentamos a??adir un duplicado.
 
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

**List**
<pre>
    <code>
package com.edflor.collections;

import java.util.ArrayList;
/**
 *
 * @author luis.flores.ramirez
 */
public class List {
       public static void main (String[] args){
        ArrayList nombres = new ArrayList();
        System.out.println("Elementos al inicio: " + nombres.size());
        nombres.add("Ana");
        nombres.add("Bea");
        nombres.add("Dalia");
        nombres.add("Pedro");
        nombres.add("Bea");  //comprobar que admite duplicados
 
        System.out.println("Contenido: " + nombres);
        System.out.println("Elementos: " + nombres.size());
        System.out.println(nombres.contains("Ana"));
 
        nombres.remove("Ana"); //eliminamos un elemento
 
        System.out.println("Contenido: " + nombres);
        System.out.println("Elementos: " + nombres.size());
        System.out.println(nombres.contains("Ana"));
 
        nombres.add(3, "Ana"); //A??adir en posicion x
        System.out.println("Contenido: " + nombres);
 
        System.out.println("SubLista(1,4):" + nombres.subList(1,4));
    }
}
    </code>
</pre>

![List](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1628696744/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/List_ycixgn.png)

**Map**
<pre>
    <code>
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
}</code>
</pre>

![map](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1628697832/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/map_w6sxry.png)

**Ejercicio Collection - Khaty Sierra**
<pre>
    <code>
ordenar alfab??ticamente una ArrayList of Strings.
Resultado esperado:
unsorted [Denver, Boulder, Vail, Aspen, Telluride]
sorted [Aspen, Boulder, Denver, Telluride, Vail]
    </code>
</pre>

**Respuesta**
<pre>
    <code>
package com.edflor.collections;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author luis.flores.ramirez
 */
public class ArrayListAlfabeticamente {

    public static void main(String[] args) {
        ArrayList<String> stuff = new ArrayList<String>(); // #1
        stuff.add("Denver");
        stuff.add("Boulder");
        stuff.add("Vail");
        stuff.add("Aspen");
        stuff.add("Telluride");
        System.out.println("unsorted " + stuff);
        Collections.sort(stuff); // #2
        System.out.println("sorted " + stuff);
    }
}
    </code>
</pre>

![Collections](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1629226585/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/collections_1_nxc6zm.png)

**Ejercicio Map - Kathy Sierra**
<pre>
    <code>
Given:
import java.util.*;
class MapEQ {
public static void main(String[] args) {
Map<ToDos, String> m = new HashMap<ToDos, String>();
ToDos t1 = new ToDos("Monday");
ToDos t2 = new ToDos("Monday");
ToDos t3 = new ToDos("Tuesday");
m.put(t1, "doLaundry");
m.put(t2, "payBills");
m.put(t3, "cleanAttic");
System.out.println(m.size());
} }
class ToDos{
String day;
ToDos(String d) { day = d; }
public boolean equals(Object o) {
return ((ToDos)o).day == this.day;
}
// public int hashCode() { return 9; }
}
Which is correct? (Choose all that apply.)
A. As the code stands it will not compile
B. As the code stands the output will be 2
C. As the code stands the output will be 3
D. If the hashCode() method is uncommented the output will be 2
E. If the hashCode() method is uncommented the output will be 3
F. If the hashCode() method is uncommented the code will not compile
    </code>
</pre>

**Respuesta**
<pre>
    <code>
        C and D are correct.
    </code>
</pre>
![map](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1629231797/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/MapQ_mpkp1a.png)

**Ejercicio List - Kathy Sierra**
<pre>
    <code>
Given:
public static void main(String[] args) {
// INSERT DECLARATION HERE
for (int i = 0; i <= 10; i++) {
List<Integer> row = new ArrayList<Integer>();
for (int j = 0; j <= 10; j++)
row.add(i * j);
table.add(row);
}
for (List<Integer> row : table)
System.out.println(row);
}
Which statements could be inserted at // INSERT DECLARATION HERE to allow this code to
compile and run? (Choose all that apply.)
A. List<List<Integer>> table = new List<List<Integer>>();
B. List<List<Integer>> table = new ArrayList<List<Integer>>();
C. List<List<Integer>> table = new ArrayList<ArrayList<Integer>>();
D. List<List, Integer> table = new List<List, Integer>();
E. List<List, Integer> table = new ArrayList<List, Integer>();
F. List<List, Integer> table = new ArrayList<ArrayList, Integer>();
G. None of the above
    </code>
</pre>

**Respuesta**
<pre>
    <code>
    B is correct.
    </code>
</pre>

![List](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1629232595/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/List-Kathy_jzmvbz.png)

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

**Ejercicio Genericos - Kathy Sierra**
<pre>
    <code>
Given:
3. import java.util.*;
4. class Dog { int size; Dog(int s) { size = s; } }
5. public class FirstGrade {
6. public static void main(String[] args) {
7. TreeSet<Integer> i = new TreeSet<Integer>();
8. TreeSet<Dog> d = new TreeSet<Dog>();
9.
10. d.add(new Dog(1)); d.add(new Dog(2)); d.add(new Dog(1));
11. i.add(1); i.add(2); i.add(1);
12. System.out.println(d.size() + " " + i.size());
13. }

What is the result?
A. 1 2
B. 2 2
C. 2 3
D. 3 2
E. 3 3
F. Compilation fails
G. An exception is thrown at runtime
    </code>
</pre>

**Respuesta**
<pre>
    <code>
        G. An exception is thrown at runtime
    </code>
</pre>

![generics](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1629233283/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/Generics_2_vnvug3.png)

**Ejercicio Genericos - Kathy Sierra**
<pre>
    <code>
Given:
3. import java.util.*;
4. public class Magellan {
5. public static void main(String[] args) {
6. TreeMap<String, String> myMap = new TreeMap<String, String>();
7. myMap.put("a", "apple"); myMap.put("d", "date");
8. myMap.put("f", "fig"); myMap.put("p", "pear");
9. System.out.println("1st after mango: " + // sop 1
10. myMap.higherKey("f"));
11. System.out.println("1st after mango: " + // sop 2
12. myMap.ceilingKey("f"));
13. System.out.println("1st after mango: " + // sop 3
14. myMap.floorKey("f"));
15. SortedMap<String, String> sub = new TreeMap<String, String>();
16. sub = myMap.tailMap("f");
17. System.out.println("1st after mango: " + // sop 4
18. sub.firstKey());
19. }
20. }
Which of the System.out.println statements will produce the output 1st after mango: p?
(Choose all that apply.)
A. sop 1
B. sop 2
C. sop 3
D. sop 4
E. None; compilation fails
F. None; an exception is thrown at runtime
    </code>
</pre>

**Respuesta**
<pre>
    <code>
    A. sop 1
    </code>
</pre>

![generics](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1629233910/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/generics_2_h8dpqt.png)

**Ejercicio Genericos - Kathy Sierra**
<pre>
    <code>
Given:
3. import java.util.*;
4. class Business { }
5. class Hotel extends Business { }
6. class Inn extends Hotel { }
7. public class Travel {
8. ArrayList<Hotel> go() {
9. // insert code here
10. }
11. }
Which, inserted independently at line 9, will compile? (Choose all that apply.)
A. return new ArrayList<Inn>();
B. return new ArrayList<Hotel>();
C. return new ArrayList<Object>();
D. return new ArrayList<Business>();
    </code>
</pre>

**Respuesta**
<pre>
    <code>
    B. return new ArrayList<Hotel>();

    public class Travel {
    ArrayList<Hotel> go() {
// insert code here
        return new ArrayList<Hotel>();
    }
}
    </code>
</pre>