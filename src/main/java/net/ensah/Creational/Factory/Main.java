package net.ensah.Creational.Factory;

import net.ensah.Creational.Factory.Factories.ComputerFactory;
import net.ensah.Creational.Factory.Factories.PhoneFactory;
import net.ensah.Creational.Factory.creator.Creator;

public class Main {

    public static void main(String[] args) {
        Creator phoneFactory= new PhoneFactory();
        System.out.println(phoneFactory.useProduct());
        ComputerFactory computerFactory = new ComputerFactory();
        System.out.println(computerFactory.useProduct());

    }
}
