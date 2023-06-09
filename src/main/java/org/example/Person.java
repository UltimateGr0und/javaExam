package org.example;

public class Person {
    public Person(String name,Integer age){
        this.name = name;
        this.age=age;
    }
    String name;
    int age;
    public void introduce(){
        System.out.println("hello "+name+" you are "+String.valueOf(age)+" now");
    }
}
