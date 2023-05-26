package Pract3;

import java.util.List;
import java.util.Set;

public class SetTest {
    static volatile SynchronizedSet<Integer> mySet = new SynchronizedSet<>();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 11; i++) {
                mySet.add(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 11; i < 21; i++) {
                mySet.add(i);
            }
        });

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Set:");
        mySet.forEach(System.out::println);
    }
}
