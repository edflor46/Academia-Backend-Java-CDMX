## Semana 1
### Declaraciones y Control de Acceso
**Tipos Primitivos**
<pre>
    <code>
package com.edflor.primitivos;
/**
 *
 * @author luis.flores.ramirez
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        /*==========Enteros==========*/
        //byte
        System.out.println("/*==========Byte==========*/");
        byte numeroBite = 10;
        System.out.println("numeroBite = " + numeroBite);
        System.out.println("Valor minimo del byte = " + Byte.MIN_VALUE);
        System.out.println("Valor maximo del byte = " + Byte.MAX_VALUE);
        System.out.println();

        //short
        System.out.println("/*==========Short==========*/");
        short numeroShort = 10;
        System.out.println("numeroBite = " + numeroShort);
        System.out.println("Valor minimo del short = " + Short.MIN_VALUE);
        System.out.println("Valor maximo del short = " + Short.MAX_VALUE);
        System.out.println();

        //int
        System.out.println("/*==========Int==========*/");
        int numeroInt = 10;
        System.out.println("numeroInt = " + numeroInt);
        System.out.println("Valor minimo del int = " + Integer.MIN_VALUE);
        System.out.println("Valor maximo del int = " + Integer.MAX_VALUE);
        System.out.println();

        //long
        System.out.println("/*==========Long==========*/");
        long numeroLong = 10;
        System.out.println("numeroInt = " + numeroLong);
        System.out.println("Valor minimo del long = " + Long.MIN_VALUE);
        System.out.println("Valor maximo del long = " + Long.MAX_VALUE);
        System.out.println();

        /*==========Flotantes==========*/
        //float
        System.out.println("/*==========Float==========*/");
        float numeroFloat = 10.0F;
        System.out.println("numeroFloat = " + numeroFloat);
        System.out.println("Valor minimo del float = " + Float.MIN_VALUE);
        System.out.println("Valor maximo del float = " + Float.MAX_VALUE);
        System.out.println();
        
        //double
         System.out.println("/*==========Double==========*/");
        double numeroDouble = 10;
        System.out.println("numeroDouble = " + numeroDouble);
        System.out.println("Valor minimo del double = " + Double.MIN_VALUE);
        System.out.println("Valor maximo del double = " + Double.MAX_VALUE);
        System.out.println();
        
        /*==========Char==========*/
         System.out.println("/*==========Char==========*/");
        char miCaracter = '\u0021';
        System.out.println("miCaracter = " + miCaracter);
        System.out.println();
        
        char charDecimal = 33;
        System.out.println("charDecimal = " + charDecimal);
        System.out.println();
        
        char charSimbolo = '!';
        System.out.println("charSimbolo = " + charSimbolo);
        System.out.println();
        /*==========Boolean==========*/
         System.out.println("/*==========Boolean==========*/");
        boolean falseBoolean = false;
        System.out.println("varBoolean = " + falseBoolean);
        
        boolean trueBoolean = true;
        System.out.println("trueBoolean = " + trueBoolean);
        
    }
}
    </code>
</pre>

![img](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1628222544/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/primitivos_1_dfik3l.png)



### Orientaci??n??a??objetos
**Ejercicio 1  - Herencia**

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

**Ejercicio 2 - Herencia**

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
