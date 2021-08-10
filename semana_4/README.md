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