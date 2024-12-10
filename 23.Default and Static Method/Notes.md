# Predicates:
 Functional interface:
 abstarct:boolean test(Object o)
 predicate is a function with only one argumentand returns a boolean value.
 there is an abstract boolena method we can use like 
 ``` java
 import java.util.function.Predicate;

public class Ticket_booking {
    public static void main(String[] args) {
        // Ticket_booking tb=new Ticket_booking();
        // System.out.println(tb.Test(65));
        Predicate<Integer> p=(no)->(no>60);
        System.out.println(p.test(65));
        Predicate<String> p=(name)->(name.length()>=8);
        p.test("aashiqui");
    }
   // public boolean Test(int age)
    // {
    //     if(age>60){
    //         return true;
    //     }
    //     else{
    //         return false;
    //     }
    // }
}
```
apply lambda expression

java.util.function.Predicate

Predicates: Predicate -boolean -test()

java.util.function --
@FunctionalInterface -->Lambda Expression--apply()

Predicates returns only boolean value.
Predicate accept only one arguments.

Function returns any type of value.
Function accept two argument.

import java.util.function.*;
class Demo
{
    p s v main(String[] args)
    {
        Function<Input,Output> f=(name)->name.length();
        sysout(f.apply("samsung"));
    }
}


Functional interface--Consumer Interface

Package: java.util.function.Consumer;
Functional interface
apply()

inner class:
4 ways to create Inner classes:
1.Regular Inner class/ Nested Class.
2.Method Local Inner class
3.Anonymous Inner class
4.static nested class

Anonymous Inner class:
Inner class without name.
one time usage.
3 ways to create:

    1.anonmyous inner class extended from normal class.
    class A{
        A obj=new A()
        {

        };
    }
    2.anonmyous inner class implmented  from  interface.

    Runnable r=new Runnable()
    {

    };
    3.anonmyous inner class inside arguments.
