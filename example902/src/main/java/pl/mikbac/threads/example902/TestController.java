package pl.mikbac.threads.example902;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MikBac on 14.03.2026
 */

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@Slf4j
public class TestController {

    private final AsyncExecutorService asyncExecutorService;

    @PostMapping("/success")
    public ResponseEntity<Void> successTest() {
        log.info("Starting success test");
        asyncExecutorService.submit("sk", () -> 1 + 1);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/error")
    public ResponseEntity<Void> errorTest() {
        log.info("Starting error test");
        asyncExecutorService.submit("eK", () -> {
            throw new NullPointerException("Simulated error – without completeExceptionally!");
        });
        return ResponseEntity.ok().build();
    }

}
