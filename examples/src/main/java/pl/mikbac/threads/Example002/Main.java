package pl.mikbac.threads.Example002;

/**
 * Created by MikBac on 28.12.2023
 */

public class Main {

    public static void main(String[] args) {
        final Thread newThread = new NewThread();
        newThread.start();
    }

}
