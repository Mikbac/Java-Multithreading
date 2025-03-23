package pl.mikbac.threads.Example003;

import pl.mikbac.threads.Example003.Threads.DecrementHacker;
import pl.mikbac.threads.Example003.Threads.GuardThread;
import pl.mikbac.threads.Example003.Threads.IncrementHacker;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by MikBac on 29.12.2023
 */
public class Main {

    private static final int MAX_PASSWORD_VALUE = 200;

    public static void main(String[] args) {
        Random random = new Random();

        final Credential credential = new Credential(random.nextInt(MAX_PASSWORD_VALUE));

        List<Thread> threads = new ArrayList<>();

        threads.add(new IncrementHacker(credential, MAX_PASSWORD_VALUE));
        threads.add(new DecrementHacker(credential, MAX_PASSWORD_VALUE));
        threads.add(new GuardThread());

        for (Thread thread : threads) {
            thread.start();
        }
    }

}
