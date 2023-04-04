package org.egitim.inheritance;

public abstract class AbstractClassDemo {

    public AbstractClassDemo(){

    }

    public void eat(){

        System.out.println("Yemek yer");
    }

    public void sleep(){

        System.out.println("Uyur");
    }

    public void move(){

        System.out.println("hareket edebilir");
    }

    public void sound(){

        System.out.println("ses çıkarır");
    }

    private void privateMethodDemo(){

        System.out.println("privateMethodDemo");
    }

    protected void protectedMethodDemo(){

        System.out.println("protectedMethodDemo");
    }
}
