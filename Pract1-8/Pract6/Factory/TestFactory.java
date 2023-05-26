package Pract6.Factory;

public class TestFactory {
    public static void main(String[] args) {
        Factory factory = new Factory();

        IceCream chocolate = factory.getIceCream(Types.Chocolate);
        IceCream cherry = factory.getIceCream(Types.Cherry);
        IceCream bubbleGum = factory.getIceCream(Types.BubbleGum);

        chocolate.printInfo();
        cherry.printInfo();
        bubbleGum.printInfo();
    }
}
