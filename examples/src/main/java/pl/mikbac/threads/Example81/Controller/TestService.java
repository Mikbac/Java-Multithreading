package pl.mikbac.threads.Example81.Controller;

import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by MikBac on 19.10.2024
 */

@Service
public class TestService {

    private Long standardCounter = 0L;
    private final AtomicLong atomicCounter = new AtomicLong();

    public Long atomicCounter() {
        return atomicCounter.getAndIncrement();
    }

    public Long standardCounter() {
        return standardCounter++;
    }

    public Long getAtomicCounter() {
        return atomicCounter.get();
    }

    public Long getStandardCounter() {
        return standardCounter;
    }

}
