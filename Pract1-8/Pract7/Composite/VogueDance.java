package Pract7.Composite;

public class VogueDance implements Dancers {
    String name;

    public VogueDance(String name) {
        this.name = name;
    }

    @Override
    public void dance() {
        System.out.println("Vogue dancer " + this.name + " is dancing!");
    }
}
