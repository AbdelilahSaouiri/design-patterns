package net.ensah.FactoryMethod.Factories;

import net.ensah.FactoryMethod.ComputerImpl;
import net.ensah.FactoryMethod.IProduct;
import net.ensah.FactoryMethod.creator.Creator;

public class ComputerFactory extends Creator {
    @Override
    public IProduct createProduct() {
        return new ComputerImpl();
    }
}
