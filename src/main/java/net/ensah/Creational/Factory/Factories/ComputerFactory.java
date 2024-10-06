package net.ensah.Creational.Factory.Factories;

import net.ensah.Creational.Factory.ComputerImpl;
import net.ensah.Creational.Factory.IProduct;
import net.ensah.Creational.Factory.creator.Creator;

public class ComputerFactory extends Creator {
    @Override
    public IProduct createProduct() {
        return new ComputerImpl();
    }
}
