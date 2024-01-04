package pl.mikbac.threads.Example80.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mikbac.threads.Example80.Service.UserService;

/**
 * Created by MikBac on 04.01.2024
 */

@RestController
@RequiredArgsConstructor
public class UserController {

    private final UserService businessService;

    @GetMapping("/user/async")
    public ResponseEntity<Long> getAsyncUsersDetails() {
        return ResponseEntity.ok(businessService.getAsyncUsersDetails());
    }

    @GetMapping("/user/sync")
    public ResponseEntity<Long> getSyncUsersDetails() {
        return ResponseEntity.ok(businessService.getSyncUsersDetails());
    }

}
