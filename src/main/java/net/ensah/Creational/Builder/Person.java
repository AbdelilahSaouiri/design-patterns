package net.ensah.Creational.Builder;

public class Person {

    private  String userId;
    private  String firstName;
    private  String lastName;
    private  String email;
    private  String password;

    public Person(String userId, String firstName, String lastName, String email, String password) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }

    public Person() {
    }

    @Override
    public String toString() {
        return "Person{" +
                "userId='" + userId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }


    public static class PersonBuilder{
        private final Person person = new Person();

        public PersonBuilder firstName(String firstName){
            person.firstName=firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName){
            person.lastName=lastName;
            return this;
        }

        public PersonBuilder email(String email){
            person.email=email;
            return this;
        }

        public PersonBuilder password(String password){
            person.password=password;
            return this;
        }

        public PersonBuilder userId(String userId){
            person.userId=userId;
            return this;
        }

        public Person build(){
            return this.person;
        }
    }
    }
