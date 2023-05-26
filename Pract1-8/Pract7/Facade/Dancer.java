package Pract7.Facade;

public class Dancer implements Dance {
    @Override
    public void start() {
        System.out.println("Dancer starts dancing!");
    }

    @Override
    public void stop() {
        System.out.println("Dancer stops dancing!");
    }
}
