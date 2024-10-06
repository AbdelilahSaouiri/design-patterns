package net.ensah.FactoryMethod;

import net.ensah.FactoryMethod.Factories.ComputerFactory;
import net.ensah.FactoryMethod.Factories.PhoneFactory;
import net.ensah.FactoryMethod.creator.Creator;

public class Main {

    public static void main(String[] args) {
        Creator phoneFactory= new PhoneFactory();
        System.out.println(phoneFactory.useProduct());
        ComputerFactory computerFactory = new ComputerFactory();
        System.out.println(computerFactory.useProduct());

    }
}
