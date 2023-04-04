package org.egitim.inheritance;

public class Dog extends Animal implements DogInterface, DogInterface2, DogInterface3{

    // https://github.com/YunusBalaman/JavaEgitim4Nisan

    public Dog(){
        System.out.println("Hav Hav Hav");
    }

    public Dog(String log){
        System.out.println("dog: " + log);
    }

    @Override
    public void sound() {
        System.out.println("Havlar");
    }

    @Override
    public void salya() {

        System.out.println("salya");
    }

    @Override
    public void bite() {

    }

    @Override
    public void egitim() {

    }
}
