package net.ensah.Builder;

public class Person {

    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private Person(PersonBuilder builder) {
        this.userId = builder.userId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
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

    public static PersonBuilder Builder() {
        return new PersonBuilder();
    }

    public static class PersonBuilder {
        private String userId;
        private String firstName;
        private String lastName;
        private String email;
        private String password;

        // Constructeur privé pour forcer l'utilisation du Builder
        private PersonBuilder() {
        }

        // Méthodes de chaînage pour définir les attributs
        public PersonBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder email(String email) {
            this.email = email;
            return this;
        }

        public PersonBuilder password(String password) {
            this.password = password;
            return this;
        }

        // Méthode pour construire l'objet Person
        public Person build() {
            return new Person(this);
        }
    }
}
