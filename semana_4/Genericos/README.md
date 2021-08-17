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