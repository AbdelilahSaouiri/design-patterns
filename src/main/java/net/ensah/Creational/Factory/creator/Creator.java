package net.ensah.Creational.Factory.creator;

import net.ensah.Creational.Factory.IProduct;

public  abstract class Creator {

   public abstract IProduct createProduct();

   public String useProduct(){
       IProduct product= createProduct();
      return  product.getType();
   }
}
