## Semana 2
### Operadores
**Ejercicio 1 - Operadores Compuestos**
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

**Ejercicio 2 - Precremento / Postcremento**
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
public class PrePostDemo {
    public static void main(String[] args) {
        //Inicia i con un valor de 3
        int i = 3;
        
        //Postincremento, aumentara la proxima vez que se ejecute
        i++;
        
        //Al ser llamado i cambia su valor de 3 a 4 debido al postincremento
        System.out.println("i = " + i);  // "4"
        
        //Preincrement, i aumentara en 1 desde antes
        ++i;
        
        //i vale 5
        System.out.println("i = " + i);  // "5"
        
        //precremento i vale 6 debido a que se incremento antes
        System.out.println("i = " + ++i);  // "6"

        //postcremento i sigue valiendo 6, aumentara en 1 la proxima vez que sea ejecutado
        System.out.println("i = " + i++);  // "6"
        
        //i vale 7 debido al postcremento
        System.out.println("i = " + i);  // "7"
    }
}
    </code>
</pre>

![precremento](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1627589449/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/precremento_vqkakz.png)

**Ejercicio 3 - equals**
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

**Ejercicio 4 equals**
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

**Ejercicio 5 - Operadores Compuestos**
![operadores_compuestos](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1627664969/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/ejercicio5_klm44p.png)

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

![ejercicio5_operadoresCompuestos](https://res.cloudinary.com/dvhl6xkqf/image/upload/v1627667049/Academia-Java.-CDMX/Ejercicios%20Academia-Java-CDMX/Screenshot_37_fvq9ee.png)

