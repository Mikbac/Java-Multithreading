package pl.mikbac.threads.Example500;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MikBac on 27.01.2024
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {

        List<Thread> virtualThreads = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            // Standard thread:
            // Thread thread = Thread.ofPlatform().unstarted(new NewThread());
            // Virtual thread:
            Thread virtualThread = Thread.ofVirtual().unstarted(new NewThread());
            virtualThreads.add(virtualThread);
        }

        for (Thread virtualThread : virtualThreads) {
            virtualThread.start();
        }

        for (Thread virtualThread : virtualThreads) {
            virtualThread.join();
        }
    }

}
