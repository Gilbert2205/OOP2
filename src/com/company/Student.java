package com.company;

/**
 * Created by uitsc_000 on 23.01.2016.
 */
public class Student implements Cloneable {
//    private String FullName;
//    private int Age;
    int id;

    public Student(int id){
        System.out.println("const");
        this.id=id;
    }
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }
    //    public String getFullName(){
//        return getFullName();
//    }
//    public void setFullName(String FullName){
//        this.FullName = FullName;
//    }
//    public int getAge(){
//        return Age;
//    }
//    public void setAge(int Age){
//        this.Age= Age;
//    }
//    public Student (String FullName, int Age){
//        this.FullName= FullName;
//        this.Age = Age;
//    }

//    public String toString() {
//        return "Student{" +
//                "FullName='" + FullName + '\'' +
//                ", Age=" + Age +
//                '}';
//    }
}
