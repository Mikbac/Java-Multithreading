package pl.mikbac.threads.Example30;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by MikBac on 25.01.2024
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        // Can cause OutOfMemoryError
        try (ExecutorService executorService = Executors.newCachedThreadPool()) {

            for (int i = 0; i < 100_000_000; i++) {
                executorService.submit(Main::doSomething);
            }
        }

    }

    @SneakyThrows
    private static void doSomething() {
        System.out.println(STR."Executed by: \{Thread.currentThread().getName()}");
        Thread.sleep(1000);
    }

}

// Executed by: pool-1-thread-19979
// Executed by: pool-1-thread-19980
// Executed by: pool-1-thread-19981
// Executed by: pool-1-thread-19982
// Executed by: pool-1-thread-19983
// Executed by: pool-1-thread-19984
// Executed by: pool-1-thread-19985
// Executed by: pool-1-thread-19986
// Executed by: pool-1-thread-19987
// Executed by: pool-1-thread-19988
