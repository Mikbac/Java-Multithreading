package pl.mikbac.threads.example900.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mikbac.threads.example900.Service.UserService;

import java.util.concurrent.TimeUnit;

/**
 * Created by MikBac on 04.01.2024
 */

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService businessService;

    @GetMapping("/user/async")
    public ResponseEntity<Long> getAsyncUsersDetails() {
        return ResponseEntity.ok(TimeUnit.NANOSECONDS.toMillis(businessService.getAsyncUsersDetails()));
    }

    @GetMapping("/user/async-queue")
    public ResponseEntity<Long> measureAsyncUsersDetailsWithQueueing() {
        return ResponseEntity.ok(TimeUnit.NANOSECONDS.toMillis(businessService.measureAsyncUsersDetailsWithQueueing()));
    }

    @GetMapping("/user/sec-async")
    public ResponseEntity<Long> getUserDetailsSequentiallyWithAsyncClient() {
        return ResponseEntity.ok(TimeUnit.NANOSECONDS.toMillis(businessService.getUserDetailsSequentiallyWithAsyncClient()));
    }

    @GetMapping("/user/sync")
    public ResponseEntity<Long> getSyncUsersDetails() {
        return ResponseEntity.ok(TimeUnit.NANOSECONDS.toMillis(businessService.getSyncUsersDetails()));
    }

}
