**Ejercicio Collection - Khaty Sierra**
<pre>
    <code>
ordenar alfabéticamente una ArrayList of Strings.
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