package pl.mikbac.threads;

import static java.lang.StringTemplate.STR;

/**
 * Created by MikBac on 27.12.2023
 */

public class ThreadSampleExample {

    public static void main(String[] args) {
        // Thread creation
        Thread thread = new Thread(() -> {
            // Code that will run in a thread
            System.out.println(STR."Thread name: \{Thread.currentThread().getName()}");
            System.out.println(STR."Thread priority: \{Thread.currentThread().getPriority()}");
        });

        thread.setName("New Thread - 1");
        thread.setPriority(Thread.MAX_PRIORITY);

        System.out.println(STR."Thread name before starting: \{Thread.currentThread().getName()}");
        // Starting thread
        thread.start();
        System.out.println(STR."Thread name after starting: \{Thread.currentThread().getName()}");

    }
}
