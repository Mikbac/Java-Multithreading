package pl.mikbac.threads.Example33;

import lombok.SneakyThrows;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by MikBac on 27.01.2024
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        try (ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor()) {

            for (int i = 0; i < 100_000; i++) {
                executorService.submit(Main::doSomething);
            }
        }

    }

    @SneakyThrows
    private static void doSomething() {
        System.out.println(STR."Executed by: \{Thread.currentThread()}");
        Thread.sleep(1000);
    }

}

// Executed by: VirtualThread[#100026]/runnable@ForkJoinPool-1-worker-3
// Executed by: VirtualThread[#100029]/runnable@ForkJoinPool-1-worker-2
// Executed by: VirtualThread[#100028]/runnable@ForkJoinPool-1-worker-5
// Executed by: VirtualThread[#100030]/runnable@ForkJoinPool-1-worker-3
// Executed by: VirtualThread[#100031]/runnable@ForkJoinPool-1-worker-2
// Executed by: VirtualThread[#100032]/runnable@ForkJoinPool-1-worker-5
// Executed by: VirtualThread[#100033]/runnable@ForkJoinPool-1-worker-3
// Executed by: VirtualThread[#100036]/runnable@ForkJoinPool-1-worker-5
// Executed by: VirtualThread[#100035]/runnable@ForkJoinPool-1-worker-2
// Executed by: VirtualThread[#100034]/runnable@ForkJoinPool-1-worker-1
