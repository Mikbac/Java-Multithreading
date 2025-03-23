package pl.mikbac.threads.Example007;

/**
 * Created by MikBac on 23.03.2025
 */
public class Main {

// ThreadLocal provides an easy-to-use API to confine some values to each thread.

    public static ThreadLocal<String> threadLocalString = ThreadLocal.withInitial(() -> "defaultValue");

    public static void main(String[] args) {
        threadLocalString.set("mainValue");

        final Thread newThread = new NewThread();

        newThread.start();

        System.out.println("From: " + Thread.currentThread().getName() + " Value: " + threadLocalString.get());

        // From: Thread-0 Value: defaultValue
        // From: main Value: mainValue
    }

}
