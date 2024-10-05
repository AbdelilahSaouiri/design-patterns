package net.ensah.Singleton;

public class Person {

    private final static Person person ;

    static {
        System.out.println("singleton instantiation ");
        person= new Person();
    }

    private Person(){}

    public static Person getInstance(){
        return person;
    }


}
