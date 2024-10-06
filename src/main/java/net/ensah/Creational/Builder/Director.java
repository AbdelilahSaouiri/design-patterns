package net.ensah.Creational.Builder;

public class Director {

    public static Person.PersonBuilder personBuilder(){
        return new Person.PersonBuilder();
    }
}
