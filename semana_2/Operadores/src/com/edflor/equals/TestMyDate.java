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
