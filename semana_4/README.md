## Semana 4
### Strings
**Ejercicio 1 - Formas de concatenar**

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

**Ejercicio 2 - while**
<pre>
    <code>
Given the output:
DooBeeDooBeeDo

Fill in the missing code:

public class DooBee {

  public static void main (String[] args) {

    int x = 1;

    while (x < _____ ) {

      System.out._________(“Doo”);

      System.out._________(“Bee”);

      x = x + 1;

    }

    if (x == ______ ) {

      System.out.print(“Do”);

    }

  }

}
    </code>
</pre>

**Respuesta**
<pre>
    <code>
package com.edflor.controlFlujo;
/**
 *
 * @author luis.flores.ramirez
 */
public class DooBee {
    public static void main(String[] args) {
        int x = 1;
        while (x < 3) { //Mientras x sea menor a 3 se imprimira "Doo" "Bee" las veces que itere el bucle           
            System.out.printf("Doo");
            System.out.printf("Bee");
            x = x + 1; // x aumenta en 1
        }
        if (x == 3) {
            System.out.printf("Do"); //x al valer 3 se saldra del bucle e imprimira "Do"
        }
    }
}
    </code>
</pre>
![while](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1628193607/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/Screenshot_65_ondoma.png)