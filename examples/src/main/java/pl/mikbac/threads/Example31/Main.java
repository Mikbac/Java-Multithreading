package pl.mikbac.threads.Example31;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by MikBac on 25.01.2024
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        try (ExecutorService executorService = Executors.newFixedThreadPool(100)) {

            for (int i = 0; i < 100_000; i++) {
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

// Executed by: pool-1-thread-74
// Executed by: pool-1-thread-89
// Executed by: pool-1-thread-51
// Executed by: pool-1-thread-53
// Executed by: pool-1-thread-75
// Executed by: pool-1-thread-81
// Executed by: pool-1-thread-99
// Executed by: pool-1-thread-93
// Executed by: pool-1-thread-96
// Executed by: pool-1-thread-23
