package Pract5;

public class Test {
    public static void main(String[] args) {
        Singleton1 singleton1 = Singleton1.getInstance();
        Singleton1 singleton2 = Singleton1.getInstance();
        System.out.println(singleton1.getClass()+" "+singleton2.getClass()+" "+singleton1.equals(singleton2));

        Singleton2 s21 = Singleton2.getInstance();
        Singleton2 s22 = Singleton2.getInstance();
        System.out.println(s21.getClass()+" "+s22.getClass()+" "+s21.equals(s22));

        Singleton3 s31 = Singleton3.getInstance();
        Singleton3 s32 = Singleton3.getInstance();
        System.out.println(s31.getClass()+" "+s32.getClass()+" "+s31.equals(s32));

        Singleton4 s41 = Singleton4.getInstance();
        Singleton4 s42 = Singleton4.getInstance();
        System.out.println(s41.getClass()+" "+s42.getClass()+" "+s41.equals(s42));

        Singleton5 s51 = Singleton5.getInstance();
        Singleton5 s52 = Singleton5.getInstance();
        System.out.println(s51.getClass()+" "+s52.getClass()+" "+s51.equals(s52));
    }
}
