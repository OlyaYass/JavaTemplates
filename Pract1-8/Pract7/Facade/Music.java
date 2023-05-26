package Pract7.Facade;

public class Music implements Dance {
    @Override
    public void start() {
        System.out.println("Music starts playing!");
    }

    @Override
    public void stop() {
        System.out.println("Music stops playing!");

    }
}
