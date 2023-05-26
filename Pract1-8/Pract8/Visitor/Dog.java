package Pract8.Visitor;

public class Dog implements Animal {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
