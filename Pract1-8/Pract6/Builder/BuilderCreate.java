package Pract6.Builder;

public class BuilderCreate implements Builder {
    Person person = new Person();

    @Override
    public Builder setName(String name) {
        person.name = name;
        return this;
    }

    @Override
    public Builder setAge(int age) {
        person.age = age;
        return this;
    }

    @Override
    public Builder setPets(boolean pets) {
        person.pets = pets;
        return this;
    }

    @Override
    public Person build() {
        return person;
    }
}
