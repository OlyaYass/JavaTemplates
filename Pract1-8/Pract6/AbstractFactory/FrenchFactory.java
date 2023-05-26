package Pract6.AbstractFactory;

public class FrenchFactory implements Cosmetics {
    @Override
    public Lipstick createLipstick() {
        return new Dior();
    }

    @Override
    public Perfume createPerfume() {
        return new Chanel();
    }
}
