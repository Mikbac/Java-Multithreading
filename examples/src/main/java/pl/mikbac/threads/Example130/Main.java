package pl.mikbac.threads.Example130;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by MikBac on 23.03.2025
 */
public class Main {
// A Future represents the result of an asynchronous computation.

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newSingleThreadExecutor();

        Future<String> futureResult = executor.submit(() -> {
            Thread.sleep(2000);
            return "res value";
        });

        System.out.println(futureResult.get());

    }

}
