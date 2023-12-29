package pl.mikbac.threads.Example07;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MikBac on 29.12.2023
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        List<NewThread>  threadsList = new ArrayList<>();

        for (Thread thread: threadsList){
            thread.start();
        }

        for (Thread thread: threadsList){
            thread.join();
        }


    }

}
