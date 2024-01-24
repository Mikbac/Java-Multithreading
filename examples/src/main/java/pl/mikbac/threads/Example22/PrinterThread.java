package pl.mikbac.threads.Example22;

import lombok.SneakyThrows;

/**
 * Created by MikBac on 22.01.2024
 */
public class PrinterThread extends Thread {

    private final Item item;

    public PrinterThread(Item item) {
        this.item = item;
    }

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            System.out.println(STR."Item value from printer: \{item.getValue()}");
            Thread.sleep(1000);
        }
    }

}
