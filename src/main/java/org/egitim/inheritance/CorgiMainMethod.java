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

        Corgi corgi2 = new Corgi("deneme","2");

    }
}
