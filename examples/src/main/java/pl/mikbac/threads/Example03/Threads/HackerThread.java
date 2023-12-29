package pl.mikbac.threads.Example03.Threads;

import pl.mikbac.threads.Example03.Credential;

/**
 * Created by MikBac on 29.12.2023
 */
public abstract class HackerThread extends Thread{

    protected Credential credential;

    public HackerThread(final Credential credential) {
        this.credential = credential;
        setName(getClass().getSimpleName());
        setPriority(MAX_PRIORITY);
    }

    @Override
    public void start() {
        System.out.println(STR."Starting hacking by \{getName()}");
        super.start();
    }
}
