package Pract7.Facade;

public class Facade {
    private Dancer dancer;
    private Music music;

    public Facade() {
        music = new Music();
        dancer = new Dancer();
    }
    public void startDance() {
        music.start();
        dancer.start();
    }
    public void stopDance() {
        dancer.stop();
        music.stop();
    }
}
