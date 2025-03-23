package pl.mikbac.threads.Example001;

/**
 * Created by MikBac on 27.12.2023
 */

public class ThreadSampleExample {

    public static void main(String[] args) {
        // Thread creation
        Thread threadOne = new Thread(() -> {
            // Code that will run in a thread
            System.out.println(STR."Thread name: \{Thread.currentThread().getName()}");
            System.out.println(STR."Thread priority: \{Thread.currentThread().getPriority()}");
        });

        threadOne.setName("New Thread - 1");
        threadOne.setPriority(Thread.MAX_PRIORITY);

        System.out.println(STR."Thread name before starting: \{Thread.currentThread().getName()}");
        // Starting thread
        threadOne.start();
        System.out.println(STR."Thread name after starting: \{Thread.currentThread().getName()}");

        // Thread exception
        Thread threadTwo = new Thread(() -> {
            throw new RuntimeException("Important exception");
        });

        threadTwo.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(final Thread t, final Throwable e) {
                System.out.println(STR."Exception from thread: \{t.getName()} (\{Thread.currentThread().getName()})");
            }
        });
        threadTwo.start();
    }
}
