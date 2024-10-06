package net.ensah.Behavioral.Iterator;

public class Main {

    public static void main(String[] args) {
      Person p= new Person();

      for (String name:p){
          System.out.println(name);
      }
    }
}
