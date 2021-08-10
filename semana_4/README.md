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