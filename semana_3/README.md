## Semana 3
### Control de Flujo
**Ejercicio 1 - For anidado**
<pre>
    <code>      
Implement a Java-main-method that prints out the multiplication table for all numbers from 1 to 10. Use the tabulator character '\t' to align the values. The output of your method should be as follows:

1       2       3       4       5       6       7       8       9       10     

2       4       6       8       10      12      14      16      18      20     

3       6       9       12      15      18      21      24      27      30     

4       8       12      16      20      24      28      32      36      40     

5       10      15      20      25      30      35      40      45      50     

6       12      18      24      30      36      42      48      54      60     

7       14      21      28      35      42      49      56      63      70     

8       16      24      32      40      48      56      64      72      80     

9       18      27      36      45      54      63      72      81      90     

10      20      30      40      50      60      70      80      90      100
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
public class TablaMultiplicar {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) { //Recorre i del 1 al 10
            for (int j = 1; j <= 10; j++) {//Recorre j del 1 al 10
                System.out.printf("\t" + i*j);//En cada iteracion multiplica i X j; ejemplo 1X1, 1X2 1X3
            }
        System.out.println("\n");//Cuando el flujo de las iteraciones termine dar un salto de linea
        }
    }
}
    </code>
</pre>

![multiplicacion](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1628192567/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/Multiplicacion_iz9obh.png)

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