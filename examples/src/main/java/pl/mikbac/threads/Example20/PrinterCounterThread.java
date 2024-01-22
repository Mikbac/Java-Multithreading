package pl.mikbac.threads.Example20;

/**
 * Created by MikBac on 22.01.2024
 */
public class PrinterCounterThread extends Thread {

    private Counter counter;

    public PrinterCounterThread(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(STR."Average: \{counter.getItems()}");
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
        }
    }

}
