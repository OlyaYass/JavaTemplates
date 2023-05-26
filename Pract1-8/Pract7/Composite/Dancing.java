package Pract7.Composite;

import java.util.ArrayList;
import java.util.List;

public class Dancing implements Dancers{
    private List<Dancers> dancers = new ArrayList<>();

    @Override
    public void dance() {
        for (Dancers dancer : dancers) {
            dancer.dance();
        }
    }

    public void add(Dancers dancer) {
        this.dancers.add(dancer);
    }

    public void remove(Dancers dancer) {
        this.dancers.remove(dancer);
    }
}
