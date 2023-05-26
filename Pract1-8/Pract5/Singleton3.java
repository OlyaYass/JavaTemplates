package Pract5;

public class Singleton3 {
    private Singleton3() {}

    private static class SingletonHolder {
        private final static Singleton3 instance = new Singleton3();
    }

    public static Singleton3 getInstance() {

        return SingletonHolder.instance;
    }
}
