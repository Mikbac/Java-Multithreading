package pl.mikbac.threads.Example03;

/**
 * Created by MikBac on 29.12.2023
 */
public record Credential(int password) {

    public boolean isCorrectPassword(final int providedPassword) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {}

        return password == providedPassword;
    }

}
