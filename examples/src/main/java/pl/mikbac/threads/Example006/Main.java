package pl.mikbac.threads.Example006;

/**
 * Created by MikBac on 29.12.2023
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        final Thread newThread = new NewThread();

        newThread.setDaemon(true);
        newThread.start();
        Thread.sleep(1000);
        // daemon thread doesn't block main thread
        // newThread.interrupt();
    }

}
