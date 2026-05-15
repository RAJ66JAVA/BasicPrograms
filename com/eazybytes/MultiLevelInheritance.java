package com.eazybytes;

class Animal2 {
    public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog2 extends Animal2 {
    public void bark() {
        System.out.println("Dog barks");
    }
}

class Puppy extends Dog2 {
    void weep() {
        System.out.println("weeping");
    }
}

public class MultiLevelInheritance {
    public static void main(String[] args){
        Puppy p = new Puppy();
        p.weep();
        p.bark();
        p.sound();
    }
}
