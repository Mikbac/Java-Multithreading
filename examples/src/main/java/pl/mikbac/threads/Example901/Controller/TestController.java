package pl.mikbac.threads.Example901.Controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by MikBac on 19.10.2024
 */

@RestController
@RequiredArgsConstructor
public class TestController {

    private final TestService testService;

    @PostMapping("/counter/atomic")
    public ResponseEntity<Long> atomicIncrementAndGet() {
        return ResponseEntity.ok(testService.atomicCounter());
    }

    @GetMapping("/counter/atomic")
    public ResponseEntity<Long> atomicGet() {
        return ResponseEntity.ok(testService.getAtomicCounter());
    }

    @PostMapping("/counter/standard")
    public ResponseEntity<Long> standardIncrementAndGet() {
        return ResponseEntity.ok(testService.standardCounter());
    }

    @GetMapping("/counter/standard")
    public ResponseEntity<Long> standarGet() {
        return ResponseEntity.ok(testService.getStandardCounter());
    }

}
