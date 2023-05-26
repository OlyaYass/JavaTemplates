package Pract6.Builder;

public class Test {
    public static void main(String[] args) {
        Person person = new BuilderCreate().setName("Olya").setAge(19).build();
        System.out.println(person);

        person = new BuilderCreate().setAge(20).setPets(true).build();
        System.out.println(person);
    }
}
