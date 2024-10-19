package pl.mikbac.threads.Example81.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by MikBac on 19.10.2024
 */

@RestController
@RequiredArgsConstructor
public class AtomicTestController {

    private final AtomicLong counter = new AtomicLong();

    @PostMapping("/counter")
    public ResponseEntity<Long> incrementAndGet() {
        return ResponseEntity.ok(counter.getAndIncrement());
    }

}
