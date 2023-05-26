package Pract2;

import java.time.LocalDate;

public class Human {
    int age;
    String firstName;
    String lastName;
    LocalDate birthDate;
    int weight;

    public Human(int age, String firstName, String lastName, LocalDate birthDate, int weight) {
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.weight = weight;
    }

    public int getSum() {
        return age+weight;
    }
    public String getFirstName() {
        return firstName;
    }
    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return age + " " + firstName + " " + lastName + " " + birthDate + " " + weight;
    }
}

