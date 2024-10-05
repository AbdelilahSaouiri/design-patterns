package net.ensah.Builder;

public class Director {

    public static Person.PersonBuilder personBuilder(){
        return new Person.PersonBuilder();
    }
}
