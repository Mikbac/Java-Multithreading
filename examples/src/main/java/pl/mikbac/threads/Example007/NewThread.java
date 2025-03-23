package pl.mikbac.threads.Example007;

import static pl.mikbac.threads.Example007.Main.threadLocalString;

/**
 * Created by MikBac on 28.12.2023
 */

public class NewThread extends Thread {

    @Override
    public void run() {
        System.out.println("From: " + Thread.currentThread().getName() + " Value: " + threadLocalString.get());
    }

}
