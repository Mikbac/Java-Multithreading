package pl.mikbac.threads.Example14;

/**
 * Created by MikBac on 16.01.2024
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
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

            double currentAverage = counter.getAverage();

            System.out.println(STR."Average: \{currentAverage}");
        }
    }

}
