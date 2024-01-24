package pl.mikbac.threads.Example29;

import java.util.concurrent.atomic.AtomicReference;

/**
 * Created by MikBac on 24.01.2024
 */
public class Main {

    public static void main(String[] args) {
        // Atomically sets the value to newValue if the current value == expectedValue, with memory effects as specified by
        System.out.println(STR."Example one: \{trueCase()}");
        System.out.println(STR."Example two: \{falseCase()}");
    }

    private static boolean trueCase() {
        final String oldValue = "a";
        final String newValue = "b";
        final AtomicReference<String> atomicReference = new AtomicReference<>(oldValue);

        return atomicReference.compareAndSet(oldValue, newValue);
    }

    private static boolean falseCase() {
        final String oldValue = "a";
        final String newValue = "b";
        final AtomicReference<String> atomicReference = new AtomicReference<>(oldValue);
        atomicReference.set("c");

        return atomicReference.compareAndSet(oldValue, newValue);
    }

}
