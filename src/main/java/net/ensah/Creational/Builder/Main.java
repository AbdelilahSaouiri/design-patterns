package net.ensah.Creational.Builder;


import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        Person person= Director.personBuilder()
                .firstName("abdelilah")
                .lastName("saouiri")
                .email("abdelilah@gmail.com")
                .password("1234")
                .userId(UUID.randomUUID().toString())
                .build();

        System.out.println(person);
    }
}
