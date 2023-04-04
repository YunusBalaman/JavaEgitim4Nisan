package org.egitim.inheritance;

public class MainMethod {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.move();
        cat.eat();
        cat.sound();
        cat.protectedMethodDemo();

        System.out.println("\n*** cat 2 ****");
        Cat2 cat2 = new Cat2();
        cat2.move();
        cat2.eat();
        cat2.sound();
        cat2.protectedMethodDemo();
    }
}
