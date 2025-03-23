package pl.mikbac.threads.Example116;

import lombok.SneakyThrows;

/**
 * Created by MikBac on 24.01.2024
 */
public class Item {

    private boolean complete;

    @SneakyThrows
    public void complete() {
        synchronized (this) {
            while (complete) {
                this.wait();
            }
            System.out.println(STR."Item completed by: \{Thread.currentThread().getName()}");
            complete = true;
            this.notify();
            Thread.sleep(1000);
        }
    }

    @SneakyThrows
    public void incomplete() {
        synchronized (this) {
            while (!complete) {
                this.wait();
            }
            System.out.println(STR."Item incompleted by: \{Thread.currentThread().getName()}");
            complete = false;
            this.notify();
            Thread.sleep(1000);
        }
    }

}
