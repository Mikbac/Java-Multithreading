package pl.mikbac.threads.Example005;

/**
 * Created by MikBac on 28.12.2023
 */

public class NewThread extends Thread {

    @Override
    public void run() {
        while (true) {
            if (Thread.currentThread().isInterrupted()) {
                System.out.println(STR."interrupt the thread: \{Thread.currentThread().getName()}");
                return;
            } else {
                System.out.println(STR."Thread name: \{Thread.currentThread().getName()}");
            }
        }
    }

}
