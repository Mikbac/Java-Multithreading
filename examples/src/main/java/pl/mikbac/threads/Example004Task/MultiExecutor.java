package pl.mikbac.threads.Example004Task;

import java.util.List;

/**
 * Created by MikBac on 29.12.2023
 */

public class MultiExecutor {

    // Add any necessary member variables here
    private final List<Runnable> tasks;

    /*
     * @param tasks to executed concurrently
     */
    public MultiExecutor(List<Runnable> tasks) {
        this.tasks = tasks;
    }

    /**
     * Starts and executes all the tasks concurrently
     */
    public void executeAll() {
        for (Runnable task : tasks) {
            new Thread(task).start();
        }
    }
}
