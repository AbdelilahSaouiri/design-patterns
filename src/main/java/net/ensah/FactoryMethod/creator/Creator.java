package net.ensah.FactoryMethod.creator;

import net.ensah.FactoryMethod.IProduct;

public  abstract class Creator {

   public abstract IProduct createProduct();

   public String useProduct(){
       IProduct product= createProduct();
      return  product.getType();
   }
}
