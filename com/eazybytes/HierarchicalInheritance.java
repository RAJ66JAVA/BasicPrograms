package com.eazybytes;

class Animal1 {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog1 extends Animal1 {
    public void bark() {
        System.out.println("Dog barks");
    }
}
class Cat1 extends Animal1 {
    public void meow() {
        System.out.println("Cat meows");
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args){
        Cat1 c = new Cat1();
         c.meow();
         c.sound();

         Dog1 d = new Dog1();
          d.bark();
          d.sound();


    }

}
