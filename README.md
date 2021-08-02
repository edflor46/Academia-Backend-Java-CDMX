# Academia Backend Java CDMX 
Ejercicios propuestos en las sesiones de la Academia Backend Java CDMX.

## Semana 1
### Orientación a objetos
**Ejercicio 1**

![Ejercicio](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1627869371/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/image001_t07ctl.png)

**Respuesta**
<pre>
    <code>
package com.edflor.herencia;
/**
 * @author luis.flores.ramirez
 */
class Top {

    public Top(String s) {
        System.out.println("B");
    }
}

public class Bottom2 extends Top {

    public Bottom2(String s) {
        //Solucion: Agregar super y el parametro requerido
        super(s);
        System.out.println("D");
    }

    public static void main(String[] args) {
        new Bottom2("C");
        System.out.println(" ");
    }
}

/**
 * Cual es el resultado?
 * El resultado es "Compilation Fails", debido a que la
 * clase Ejercicio esta heredando de la clase Top pero la clase Bottom2 no esta
 * usando "Super" por tal motivo arrojara un error de compilacion
 *
 */
    </code>
</pre>

**Ejercicio 2**
![ejercicio2](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1627576234/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/ejercicio2Herencia_btbiwb.png)

**Respuesta**
<pre>
    <code>
package com.edflor.herencia;

/**
 *
 * @author luis.flores.ramirez
 */
class AgedP{
    //Constructor vacio
    AgedP(){}
    
    //Constructor con parametros
    public AgedP(int x){
        
    }
}

//Herencia de la clase AgedP
public class Kinder extends AgedP{
    //Main
    public static void main(String[] args) {
        
    }
    //Constructor y uso de super
    public Kinder(int x){
        super(x);    
    }
}
    </code>
</pre>

## Semana 2
### Operadores
**Ejercicio 1**
<pre>
    <code>
Change the following program to use compound assignments:

class ArithmeticDemo {

 

    public static void main (String[] args){

         

        int result = 1 + 2; // result is now 3

        System.out.println(result);

 

        result = result - 1; // result is now 2

        System.out.println(result);

 

        result = result * 2; // result is now 4

        System.out.println(result);

 

        result = result / 2; // result is now 2

        System.out.println(result);

 

        result = result + 8; // result is now 10

        result = result % 7; // result is now 3

        System.out.println(result);

 

    }

}
    </code>
</pre>

**Respuesta**
<pre>
    <code>
package com.edflor.operadores;

/**
 *
 * @author luis.flores.ramirez
 */
public class ArithmeticDemo {
    public static void main(String[] args) {
        int result = 1 + 2; // Result is now 3
        System.out.println("result = " + result);
        
        //Operador compuesto -=
        result -= 1; //Result is now 2
        System.out.println("result =- : " + result);
        
        //Operador compuesto *=
        result *= 2; //Result is now  4
        System.out.println("result *= : " + result);
        
        //Operador compuesto /= 
        result /= 2; //Result is now 2
        System.out.println("result /= : " + result);
        
        //Operador compuesto +=
        result +=8; //Result is now 10;
        System.out.println("result += : " + result);
        
        //Operador compuesto %=
        result %= 7; //Result is now 3
        System.out.println("result %= : " + result);
    }
}
    </code>
</pre>

![Captura](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1627588702/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/ejercicio_operadores_dgwrin.png)