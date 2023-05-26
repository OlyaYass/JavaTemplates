package pract10.components;

import pract10.interfaces.Programmer;

public class Middle implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("Middle programmer");
    }
}
