package pl.mikbac.threads.Example008;

/**
 * Created by MikBac on 28.12.2023
 */

public class NewThread extends Thread {

    private long sleepMillis;
    private boolean finished;

    public NewThread(final long sleepMillis) {
        finished = false;
        this.sleepMillis = sleepMillis;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(sleepMillis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finished = true;
    }

    public boolean isFinished() {
        return finished;
    }

}
