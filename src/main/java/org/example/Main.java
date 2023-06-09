package org.example;


import java.util.ArrayList;
import java.util.List;
import java.util.function.BinaryOperator;

public class Main {
    static ArrayList<String> toUpper(ArrayList<String> input){
        ArrayList<String> output = new ArrayList<>();
        input.stream().forEach(p->output.add(p.toUpperCase()));
        return output;
    }
    public static void main(String[] args) {
        Person person = new Person("john",0);
        person.introduce();

        Rectangle rect = new Rectangle();
        rect.setHeight(4);
        rect.setWidth(6);
        System.out.println("REctangle surfase is "+String.valueOf(rect.calculateArea()));

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i=0;i<10;i++){
            list.add(i);
        }
        list.stream().filter((a)->{return a%2==0?true:false;}).forEach((a)->System.out.println(a));

        BinaryOperator<Integer>cs = new BinaryOperator<Integer>(){
          public Integer apply(Integer a,Integer b){
              return a+b;
          }
        };

        System.out.println("sum"+cs.apply(1,2));

        ArrayList<String> strings = new ArrayList<>();
        strings.add("sad");
        strings.add("Dfa");
        toUpper(strings).stream().forEach(System.out::println);
    }
}