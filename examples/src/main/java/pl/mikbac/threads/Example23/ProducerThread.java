package pl.mikbac.threads.Example23;

import lombok.SneakyThrows;

import java.util.concurrent.Semaphore;

/**
 * Created by MikBac on 23.01.2024
 */
public class ProducerThread extends Thread {

    private final Semaphore consumer;
    private final Semaphore producer;
    private final Item item;

    public ProducerThread(Semaphore consumer, Semaphore producer, Item item) {
        this.consumer = consumer;
        this.producer = producer;
        this.item = item;
    }

    @SneakyThrows
    @Override
    public void run() {
        while (true) {
            producer.acquire();
            System.out.println(STR."Item is increased by: \{Thread.currentThread().getName()}");
            item.increase();
            Thread.sleep(1000);
            consumer.release();
        }
    }

}
