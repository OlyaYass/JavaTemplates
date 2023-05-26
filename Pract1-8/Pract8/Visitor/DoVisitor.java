package Pract8.Visitor;

public class DoVisitor implements Visitor {
    @Override
    public void visit(Cat cat) {
        System.out.println("Cat says meow!");
    }

    @Override
    public void visit(Dog dog) {
        System.out.println("Dog says woof!");
    }
}
