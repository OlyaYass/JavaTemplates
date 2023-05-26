package Pract7.Composite;

public class ContemporaryDancer implements Dancers {
    private String name;

    public ContemporaryDancer(String name) {
        this.name = name;
    }

    @Override
    public void dance() {
        System.out.println("Contemporary dancer " + this.name + " is dancing!");
    }
}
