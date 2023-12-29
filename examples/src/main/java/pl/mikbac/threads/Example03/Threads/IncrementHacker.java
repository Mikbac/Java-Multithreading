package pl.mikbac.threads.Example03.Threads;

import pl.mikbac.threads.Example03.Credential;

/**
 * Created by MikBac on 29.12.2023
 */
public class IncrementHacker extends HackerThread {

    private final int maxPasswordValue;

    public IncrementHacker(final Credential credential, final int maxPasswordValue) {
        super(credential);
        this.maxPasswordValue = maxPasswordValue;
    }

    @Override
    public void run() {
        for (int i = 0; i < maxPasswordValue; i++) {
            if (credential.isCorrectPassword(i)) {
                System.out.println(STR."Increment hacker: \{getName()} found password: \{i}");
                System.exit(0);
            }
        }
    }

}
