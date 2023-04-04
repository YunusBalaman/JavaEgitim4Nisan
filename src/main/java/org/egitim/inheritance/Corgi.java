package org.egitim.inheritance;

public class Corgi extends Dog implements CorgiInterface{


    public Corgi(){

        super();
        System.out.println("Corgi");
    }

    public Corgi(String log, String age){

        super(log);
        System.out.println("corgi: " + age);
    }

    @Override
    public void description() {
        System.out.println("Kraliçe çok severdi");
    }

    public void corgi(){

        System.out.println("Kuyruksuz");
    }
}
