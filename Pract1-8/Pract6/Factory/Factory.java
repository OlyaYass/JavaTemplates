package Pract6.Factory;

public class Factory {
    public IceCream getIceCream(Types type) {
        IceCream iceCream = null;
        switch (type) {
            case Cherry -> iceCream = new CherryIceCream();
            case Chocolate -> iceCream = new ChocolateIceCream();
            case BubbleGum -> iceCream = new BubbleGum();
            default -> System.out.println("Wrong type of ice cream!");
        }
        return iceCream;
    }
}
