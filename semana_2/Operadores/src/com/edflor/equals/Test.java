package com.edflor.equals;

/**
 *
 * @author luis.flores.ramirez
 */
class Person {
}

class Student {

    int id;

    public Student(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Student) {
            Student s = (Student) obj;
            return this.id == s.id;
        }
        return false;
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
