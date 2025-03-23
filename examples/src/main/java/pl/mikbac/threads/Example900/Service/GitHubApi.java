package pl.mikbac.threads.Example900.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.mikbac.threads.Example900.Model.UserModel;

import java.util.concurrent.CompletableFuture;

/**
 * Created by MikBac on 04.01.2024
 */

@Service
@RequiredArgsConstructor
public class GitHubApi {

    private final RestTemplate restTemplate;

    @Async
    public CompletableFuture<UserModel> findAsyncUser(String user) {
        final String url = String.format(STR."https://api.github.com/users/\{user}");
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
        final String url = String.format(STR."https://api.github.com/users/\{user}");

        // long response simulation
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        return restTemplate.getForObject(url, UserModel.class);
    }

}
