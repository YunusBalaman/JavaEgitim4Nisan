package org.egitim.inheritance;

import java.util.ArrayList;
import java.util.List;

public class InheritanceMain1 {

    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();
        Animal sokakKopegi = new Dog();
        Animal sokakKedisi = new Cat();
        Animal corgi = new Corgi();
       // Animal corgi = new Corgi();

        System.out.println(corgi instanceof Dog);
        System.out.println(corgi instanceof Corgi);
        System.out.println(hayvanTuru(sokakKedisi));
        System.out.println(hayvanTuru(sokakKopegi));
        System.out.println(hayvanTuru(corgi));
        System.out.println(hayvanTuru(sokakKedisi));
        DogInterface dogInterface = new Dog();
        dogInterface.salya();

    }

    public static String hayvanTuru(Animal animal){

        if (animal instanceof Dog){
            if (animal instanceof Corgi){
                ((Corgi) animal).corgi();
                return "corgi";
            }
            return "sokakKopegi";
        }
        if (animal instanceof Cat){
           return "sokakKedisi";
        }
        return "Tür bulunamadı";
    }

}
