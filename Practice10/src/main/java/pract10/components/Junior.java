package pract10.components;

import pract10.interfaces.Programmer;

public class Junior implements Programmer {
    @Override
    public void doCoding() {
        System.out.println("Junior programmer");
    }
}
