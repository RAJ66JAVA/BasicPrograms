// Parent class
class Animal {
   public void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
   public void bark() {
        System.out.println("Dog barks");
    }
}
public class SingleLevelInheritannce {
    public static void main(String[] args){
        Dog d = new Dog();
        d.bark();
        d.sound();
    }
}
