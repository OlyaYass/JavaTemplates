package pract10.components;

import pract10.interfaces.Programmer;

public class Senior implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("Senior programmer");
    }
}
