package pl.mikbac.threads.Example32;

import lombok.SneakyThrows;

/**
 * Created by MikBac on 27.01.2024
 */

public class NewThread extends Thread {

    @SneakyThrows
    @Override
    public void run() {
        System.out.println(STR."Thread name: \{Thread.currentThread()}");
        Thread.sleep(10000);
    }

}
