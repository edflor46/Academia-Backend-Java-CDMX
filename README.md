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

**Ejercicio 2**
<pre>
    <code>
In the following program, explain why the value "6" is printed twice in a row:

class PrePostDemo {

    public static void main(String[] args){

        int i = 3;

        i++;

        System.out.println(i);    // "4"

        ++i;                    

        System.out.println(i);    // "5"

        System.out.println(++i);  // "6"

        System.out.println(i++);  // "6"

        System.out.println(i);    // "7"

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
public class Incr {
    public static void main(String[] args) {
        Integer x = 7;
        int y = 2;

        x *= x; // Multiplica 7 * 7 = 49  
        y *= y;  // Multiplica 2 * 2 = 4  
        y *= y; // Multiplica 4 * 4 = 16
        x -= y; // Resta 49 - 16 

        System.out.println("x = " + x);
    }
}
    </code>
</pre>
![precremento](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1627589449/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/precremento_vqkakz.png)

**Ejercicio 3**
<pre>
    <code>
Given the following program, overrides the equals method to get the output:

false
true

class Person { }

 

class Student {

  int id;

  Student(int id) {

     this.id = id;

  }

 

  @Override

  public boolean equals(Object obj) {

     // Write your code here

  }

}

 

public class Test {

  public static void main(String[] args) {

     Person p = new Person();

     Student s1 = new Student(1001);

     Student s2 = new Student(1001);

     System.out.println(s1.equals(p));

     System.out.println(s1.equals(s2));

  }

}
    </code>
</pre>

**Respuesta**
<pre>
    <code>
     @Override
    public boolean equals(Object obj){
        if(this == obj) return true;
        if (obj instanceof Student){
            Student s = (Student) obj;
            return this.id == s.id;
        }
        return false;
    }
    </code>
</pre>

![equals](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1627590488/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/equals_bfu8zq.png)

**Ejercicio 4**
<pre>
    <code>
Write the missing code, and override the equals method in MyDate class, so that it can compare that when two MyDate objects have the same year, month and day, the result is true, otherwise false. The expected output is:

m1!=m2

m1 is equal to m2

m3 is not equal to m1 or m2

public class TestMyDate {

 

      public static void main(String[] args) {

            MyDate m1 = new MyDate(2,8,2019);

            MyDate m2 = new MyDate(2,8,2019);

MyDate m3 = null;

            if(m1==m2) {

                  System.out.println("m1==m2");

            }else {

                  System.out.println("m1!=m2");

            }

            if(m1.equals(m2)) {

                  System.out.println("m1 is equal to m2");

            }else {

                  System.out.println("m1 is not equal to m2");

            }

 

// Compare if m3 is equals to m1 or m2

if(/* Write the missing condition */) {

      System.out.println("m3 is equal to m1 or m2");

}else {

      System.out.println("m3 is not equal to m1 or m2");

}

      }

}


class MyDate{

      private int day;

      private int month;

      private int year;

      // Write the missing constructor here

      public int getDay() {

            return day;

      }

      public void setDay(int day) {

            this.day = day;

      }

      public int getMonth() {

            return month;

      }

      public void setMonth(int month) {

            this.month = month;

      }

      public int getYear() {

            return year;

      }

      public void setYear(int year) {

            this.year = year;

      }

      public boolean equals(Object obj) {

            // Write your code here

      }

}
    </code>
</pre>

**Respuesta**
<pre>
    <code>
package com.edflor.equals;
/**
 *
 * @author luis.flores.ramirez
 */
public class TestMyDate {

    public static void main(String[] args) {
        //Instancia de Objetos
        MyDate m1 = new MyDate(2, 8, 2019);
        MyDate m2 = new MyDate(2, 8, 2019);
        MyDate m3 = null;

        //Validaciones entre objetos
        if (m1 == m2) {
            System.out.println("mi==m2");
        } else {
            System.out.println("m1!=m2");
        }

        if (m1.equals(m2)) {
            System.out.println("m1 is equal to m2");
        } else {
            System.out.println("m1 is not equal to m2");
        }

        if (m1.equals(m3) || m2.equals(m3)) {
            System.out.println("m3 is equal to m1 or m2");
        } else {
            System.out.println("m3 is not equal to m1 or m2");
        }

    }
}

class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    //GET Y SET
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    //Metodo equals
    public boolean equals(Object obj) {
        //Si el parametro es parte del objeto devuelve true
        if (this == obj) {
            return true;
            //Validar si el argumento es parte de MyDate
        } else if (obj instanceof MyDate) {
            //Convertir obj
            MyDate m = (MyDate) obj;
            return this.day == m.day && this.month == m.month && this.year == m.year;
        } else {
            return false;
        }
    }
}
    </code>
</pre>

![equals](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1627661499/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/equals_2_zp6zpx.png)