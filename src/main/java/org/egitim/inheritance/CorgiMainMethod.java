package org.egitim.inheritance;

public class CorgiMainMethod {

    public static void main(String[] args) {

        Corgi corgi = new Corgi();
        System.out.println("corgi :");
        corgi.corgi();
        System.out.println("desc :");
        corgi.description();
        System.out.println("sound :");
        corgi.sound();

        System.out.println("******");
        Corgi corgi2 = new Corgi("deneme","2");
        Dog dog = (Dog) corgi2;
        dog.sound();
        System.out.println("******");
        Dog dog2 = new Corgi("deneme","2");
        dog2.sound();
        System.out.println(dog2 instanceof Corgi);
       // Corgi corgi1 = new Dog();
    }
}
