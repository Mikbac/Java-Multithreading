package pl.mikbac.threads.Example07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by MikBac on 29.12.2023
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<Long> valueToWaiting = Arrays.asList(1000L, 5000L, 10000L, 20000L, 30000L);

        List<NewThread> threadsList = new ArrayList<>();

        for (long value : valueToWaiting) {
            threadsList.add(new NewThread(value));
        }

        for (Thread thread : threadsList) {
            thread.setDaemon(true); // (optional - prevent waiting for threads)
            thread.start();
        }

        // all threads from the thread list wait in the following loop
        for (Thread thread : threadsList) {
            // waits unlimited
            // thread.join();
            // waits 10000L milliseconds
            thread.join(1000L);
        }

        for (int i = 0; i < valueToWaiting.size(); i++) {
            NewThread thread = threadsList.get(i);
            if (thread.isFinished()) {
                System.out.println(STR."Thread is done");
            } else {
                System.out.println(STR."Thread is not done");
            }
        }
    }

}
