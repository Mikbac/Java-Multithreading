package pl.mikbac.threads.Example50;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.LongStream;

/**
 * Created by MikBac on 24.09.2024
 */
public class Main {

    public static void main(String[] args) {
        // Parallel streams make use of the fork-join framework and its common pool of worker threads.
        System.out.println("----------- For each example");
        List.of(1, 2, 3, 4, 5).parallelStream()
                .forEach(n -> System.out.println("ParallelStream: " + n + " " + Thread.currentThread().getName()));

        List.of(1, 2, 3, 4, 5).stream()
                .forEach(n -> System.out.println("Stream: " + n + " " + Thread.currentThread().getName()));

        System.out.println("----------- Reduce (with identity) example");
        final var parallelStreamSum1 = List.of(1, 2, 3, 4, 5).parallelStream().reduce(2, Integer::sum);
        System.out.println(parallelStreamSum1); // can add 2 many times (in each thread) and returns e.g. 25

        final var streamSum1 = List.of(1, 2, 3, 4, 5).stream().reduce(2, Integer::sum);
        System.out.println(streamSum1); // 17

        System.out.println("----------- Reduce example");
        final var parallelStreamSum2 = List.of(1, 2, 3, 4, 5).parallelStream().reduce(Integer::sum);
        System.out.println(parallelStreamSum2); // 15

        final var streamSum2 = List.of(1, 2, 3, 4, 5).stream().reduce(Integer::sum);
        System.out.println(streamSum2); // 15

        System.out.println("----------- Pi example");
        // Parallel works faster
        final int n = 1_000_000;
        final var parallelPiCount = LongStream.rangeClosed(2, n)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
        System.out.println(parallelPiCount);

        final var piCount = LongStream.rangeClosed(2, n)
                .mapToObj(BigInteger::valueOf)
                .filter(i -> i.isProbablePrime(50))
                .count();
        System.out.println(piCount);

    }

}
