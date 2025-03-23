package pl.mikbac.threads.Example002;

/**
 * Created by MikBac on 28.12.2023
 */

// Thread implements Runnable
public class NewThread extends Thread {

    @Override
    public void run() {
        System.out.println(STR."Thread name: \{getName()}");
    }

}
