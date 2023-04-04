package org.egitim.inheritance;

public class Cat2 extends AbstractClassDemo implements CatInterface, CatInterface2{

    public Cat2(){
        super();
    }

    @Override
    public void sound(){

        super.sound();
        System.out.println("miyavlar");
    }

    @Override
    public void move(){

        System.out.println("dört ayak üstünde yürür");
    }

    @Override
    public void dortAyakUzerineDuser() {

        System.out.println();
    }

    @Override
    public void dokuzCanli() {

    }

    @Override
    public void purring() {

    }
}
