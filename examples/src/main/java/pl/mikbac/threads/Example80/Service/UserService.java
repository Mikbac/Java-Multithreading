package pl.mikbac.threads.Example80.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pl.mikbac.threads.Example80.Model.UserModel;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

/**
 * Created by MikBac on 04.01.2024
 */

@Service
@RequiredArgsConstructor
@Slf4j
public class UserService {

    private final GitHubApi gitHubApi;

    public Long getAsyncUsersDetails() {
        final long start = System.nanoTime();

        // Call asynchronous clients
        final CompletableFuture<UserModel> user1 = gitHubApi.findAsyncUser("MikBac");
        final CompletableFuture<UserModel> user2 = gitHubApi.findAsyncUser("TheAlgorithms");
        final CompletableFuture<UserModel> user3 = gitHubApi.findAsyncUser("mtdvio");

        // Wait for them
        CompletableFuture.allOf(user1, user2, user3).join();

        // Print results
        try {
            log.info(STR."User 1: \{user1.get().id()}");
            log.info(STR."User 2: \{user2.get().id()}");
            log.info(STR."User 3: \{user3.get().id()}");
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }
        return System.nanoTime() - start;
    }

    public Long getSyncUsersDetails() {
        final long start = System.nanoTime();

        // Call synchronous clients
        final UserModel user1 = gitHubApi.findSyncUser("MikBac");
        final UserModel user2 = gitHubApi.findSyncUser("TheAlgorithms");
        final UserModel user3 = gitHubApi.findSyncUser("mtdvio");

        // Print results
        log.info(STR."User 1: \{user1.id()}");
        log.info(STR."User 2: \{user2.id()}");
        log.info(STR."User 3: \{user3.id()}");

        return System.nanoTime() - start;
    }

}
