package net.ensah.Creational.Factory.Factories;

import net.ensah.Creational.Factory.IProduct;
import net.ensah.Creational.Factory.PhoneImpl;
import net.ensah.Creational.Factory.creator.Creator;

public class PhoneFactory extends Creator {
    @Override
    public IProduct createProduct() {
        return new PhoneImpl();
    }
}
