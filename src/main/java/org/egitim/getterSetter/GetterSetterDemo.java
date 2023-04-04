package org.egitim.getterSetter;

import java.util.Locale;

public class GetterSetterDemo {

    private String name;
    private String surname;
    private Integer age;
    private Cinsiyet cinsiyet;

    public GetterSetterDemo() {

    }

    public GetterSetterDemo(String name, String surname, Integer age, Cinsiyet cinsiyet) {
        this.name = name.toUpperCase(Locale.forLanguageTag("tr"));
        this.surname = surname;
        this.age = age;
        this.cinsiyet = cinsiyet;
    }

    public String getName(){

        return name;
    }

    public void setName(String name){

        this.name = name.toUpperCase(Locale.forLanguageTag("tr"));
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Cinsiyet getCinsiyet() {
        return cinsiyet;
    }

    public void setCinsiyet(Cinsiyet cinsiyet) {
        this.cinsiyet = cinsiyet;
    }
}
