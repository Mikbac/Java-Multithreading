package pl.mikbac.threads.Example115;

import lombok.SneakyThrows;

/**
 * Created by MikBac on 24.01.2024
 */
public class ConsumerThread extends Thread {

    private final Item item;

    public ConsumerThread(Item item) {
        this.item = item;
    }

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            item.incomplete();
        }
    }

}
