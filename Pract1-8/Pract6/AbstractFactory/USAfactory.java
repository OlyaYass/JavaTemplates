package Pract6.AbstractFactory;

public class USAfactory implements Cosmetics {
    @Override
    public Lipstick createLipstick() {

        return new Maybelline();
    }

    @Override
    public Perfume createPerfume() {

        return new TomFord();
    }
}
