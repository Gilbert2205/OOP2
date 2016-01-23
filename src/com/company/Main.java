package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
//        Student student = new Student("Ivanov Konstantin",22);
//            System.out.println(student);
//        Aspirant aspirant = new Aspirant("Ivanov Konstantin",22, "Issledovanie OOP");
//            System.out.println(aspirant);
//        C4 c = new C4();
//        System.out.println(c.m());
        Student a = new Student(12);
        Student b =(Student) a.clone();
        b.id = 100;
        System.out.println(a);
        System.out.println(b);
        Object f;
//        f.clone();
    }
}
