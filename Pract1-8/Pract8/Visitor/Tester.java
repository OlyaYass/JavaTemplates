package Pract8.Visitor;

public class Tester {
    public static void main(String[] args) {
        Animal animal = new Dog();
        animal.accept(new DoVisitor());

        Animal animal2 = new Cat();
        animal2.accept(new DoVisitor());
    }
}
