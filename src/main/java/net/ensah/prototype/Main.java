package net.ensah.prototype;

import java.util.UUID;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
     Person p1=  new Person(UUID.randomUUID().toString(),"abdelilah","saouiri","abdelilah@gmail.com","1234");
        System.out.println(p1);
        Person p2=p1.clone();
        System.out.println(p2);

    }
}
