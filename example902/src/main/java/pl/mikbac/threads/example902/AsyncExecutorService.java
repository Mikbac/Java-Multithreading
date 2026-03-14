package pl.mikbac.threads.example902;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * Created by MikBac on 14.03.2026
 */

@Service
@RequiredArgsConstructor
@Slf4j
public class AsyncExecutorService {

    private final ThreadPoolTaskExecutor executor;
    private final CacheService cacheService;

    public CompletableFuture<Integer> submit(final String key, final Supplier<Integer> supplier) {
        log.info("Submitting task to executor, [threads={}/{}, queue={}]", executor.getActiveCount(), executor.getCorePoolSize(), executor.getQueueSize());
        return CompletableFuture.supplyAsync(() -> cacheService.doSomething(key, supplier), executor);
    }
}
