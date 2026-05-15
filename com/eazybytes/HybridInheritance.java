package com.eazybytes;

class Animal3 {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog3 extends Animal3 {
    public void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy1 extends Dog3 {
    void weep() {
        System.out.println("weeping");
    }
}
class Cat3 extends Animal3 {
    public void meow() {
        System.out.println("Cat meows");
    }
}

public class HybridInheritance {
    public static void main(String[] args){
        Puppy1 p = new Puppy1();
        p.weep();
        p.bark();
        p.sound();

        Cat3 c = new Cat3();
         c.meow();
         c.sound();
    }
}
