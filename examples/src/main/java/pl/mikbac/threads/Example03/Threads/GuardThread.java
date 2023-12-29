package pl.mikbac.threads.Example03.Threads;

/**
 * Created by MikBac on 29.12.2023
 */
public class GuardThread extends Thread {

    private final static int SECONDS_LIMIT = 10;

    @Override
    public void run() {
        for (int i = 0; i < SECONDS_LIMIT; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println(STR."Sescond \{i+1}/\{SECONDS_LIMIT}");
        }

        System.out.println("Game over");
        System.exit(0);
    }

}
