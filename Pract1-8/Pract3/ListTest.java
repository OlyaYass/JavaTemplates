package Pract3;

import java.util.List;

public class ListTest {
    static volatile SemaphoreList<Integer> myList = new SemaphoreList<>();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 11; i++) {
                myList.add(i);
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 11; i < 21; i++) {
                myList.add(i);
            }
        });

        thread1.start();
        thread2.start();

        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("list:");
        myList.forEach(System.out::println);
    }
}

