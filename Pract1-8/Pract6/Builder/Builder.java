package Pract6.Builder;

public interface Builder {
    Builder setName(String name);
    Builder setAge(int age);
    Builder setPets(boolean pets);
    Person build();
}
