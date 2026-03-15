package pl.mikbac.threads.example900.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.mikbac.threads.example900.Model.UserModel;

import java.util.concurrent.CompletableFuture;

/**
 * Created by MikBac on 04.01.2024
 */

@Service
@RequiredArgsConstructor
@Slf4j
public class GitHubApi {

    private final RestTemplate restTemplate;

    @Async("userTaskExecutor")
    public CompletableFuture<UserModel> findAsyncUser(String user) {
        log.info("Finding async user: {}", user);
        final String url = String.format("https://api.github.com/users/%s", user);
        final UserModel results = restTemplate.getForObject(url, UserModel.class);

        // long response simulation
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return CompletableFuture.completedFuture(results);
    }

    public UserModel findSyncUser(String user) {
        log.info("Find sync user: {}", user);
        final String url = String.format("https://api.github.com/users/%s", user);

        // long response simulation
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return restTemplate.getForObject(url, UserModel.class);
    }

}
