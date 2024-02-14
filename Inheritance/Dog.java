package Inheritance;

public class Dog extends Animal{

    public void sound(){
        System.out.println("dog sound");
    }
    public void  tail(){
        super.sound();
        System.out.println("dog tail");
    }

    public static void main(String[] args) {
       // Animal animal=new Dog();
      // animal.sound();
        Dog dog=new Dog();
        dog.tail();
        dog.sound();
    }
}
