package Inheritance;

public class Dog {
    public void sound(){
        System.out.println("dog barks");
    }
    public void tail(){
        System.out.println("dog tail");
    }

    public static void main(String[] args) {
        Dog dog=new Dog();
        dog.sound();
        dog.tail();
    }
}
