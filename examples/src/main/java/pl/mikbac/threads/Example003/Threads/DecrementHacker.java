package pl.mikbac.threads.Example003.Threads;

import pl.mikbac.threads.Example003.Credential;

/**
 * Created by MikBac on 29.12.2023
 */
public class DecrementHacker extends HackerThread {

    private final int maxPasswordValue;

    public DecrementHacker(final Credential credential, final int maxPasswordValue) {
        super(credential);
        this.maxPasswordValue = maxPasswordValue;
    }

    @Override
    public void run() {
        for (int i = maxPasswordValue; i >= 0; i--) {
            if (credential.isCorrectPassword(i)) {
                System.out.println(STR."Decrement hacker: \{getName()} found password: \{i}");
                System.exit(0);
            }
        }
    }

}
