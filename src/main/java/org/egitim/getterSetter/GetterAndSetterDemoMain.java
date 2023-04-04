package org.egitim.getterSetter;

public class GetterAndSetterDemoMain {

    public static void main(String[] args) {

        GetterSetterDemo getterSetterDemo1 = new GetterSetterDemo();
        getterSetterDemo1.setName("Ali");
        getterSetterDemo1.setSurname("A");
        getterSetterDemo1.setCinsiyet(Cinsiyet.ERKEK);
        GetterSetterDemo getterSetterDemo2 = new GetterSetterDemo();
        getterSetterDemo2.setName("Mehmet");
        getterSetterDemo2.setSurname("b");
        getterSetterDemo2.setAge(30);
        getterSetterDemo2.setCinsiyet(Cinsiyet.ERKEK);
        GetterSetterDemo getterSetterDemo3 = new GetterSetterDemo();
        getterSetterDemo3.setName("elif");
        getterSetterDemo3.setSurname("R");
        getterSetterDemo3.setAge(25);
        getterSetterDemo3.setCinsiyet(Cinsiyet.KADIN);

        GetterSetterDemo getterSetterDemo4 = new GetterSetterDemo("AyşE","C"
                ,20, Cinsiyet.KADIN);

        System.out.println(getterSetterDemo1.getName() + " " + getterSetterDemo1.getSurname()
                + " " + getterSetterDemo1.getAge() + " " + getterSetterDemo1.getCinsiyet());
        System.out.println(getterSetterDemo2.getName() + " " + getterSetterDemo2.getSurname()
                + " " + getterSetterDemo2.getAge() + " " + getterSetterDemo2.getCinsiyet());
        System.out.println(getterSetterDemo3.getName() + " " + getterSetterDemo3.getSurname()
                + " " + getterSetterDemo3.getAge() + " " + getterSetterDemo3.getCinsiyet());
        System.out.println(getterSetterDemo4.getName() + " " + getterSetterDemo4.getSurname()
                + " " + getterSetterDemo4.getAge() + " " + getterSetterDemo4.getCinsiyet());
    }
}
