package Pract6.AbstractFactory;

public class Test {
    public static void main(String[] args) {
        Cosmetics factoryUSA = new USAfactory();
        Lipstick lipstickUSA = factoryUSA.createLipstick();
        lipstickUSA.printInfo();

        Cosmetics factoryFrench = new FrenchFactory();
        Perfume perfumeFrench = factoryFrench.createPerfume();
        perfumeFrench.printInfo();
    }
}
