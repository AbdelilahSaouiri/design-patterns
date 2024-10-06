package net.ensah.FactoryMethod.Factories;

import net.ensah.FactoryMethod.IProduct;
import net.ensah.FactoryMethod.PhoneImpl;
import net.ensah.FactoryMethod.creator.Creator;

public class PhoneFactory extends Creator {
    @Override
    public IProduct createProduct() {
        return new PhoneImpl();
    }
}
