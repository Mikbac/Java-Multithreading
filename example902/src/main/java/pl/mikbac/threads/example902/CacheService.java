package pl.mikbac.threads.example902;

import com.github.benmanes.caffeine.cache.AsyncCache;
import com.github.benmanes.caffeine.cache.Caffeine;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;

/**
 * Created by MikBac on 14.03.2026
 */

@Service
public class CacheService {

    private final AsyncCache<String, Integer> cache = Caffeine.newBuilder().buildAsync();

    int doSomething(final String key, final Supplier<Integer> supplierX) {
        final CompletableFuture<Integer> future = new CompletableFuture<>();
        final CompletableFuture<Integer> prior = cache.asMap().putIfAbsent(key, future);
        if (prior != null) {
            return prior.join();
        }

        int result = supplierX.get();
        future.complete(result);

//        int result;
//        try {
//            result = supplierX.get();
//            future.complete(result);
//            return result;
//        } catch (Exception e) {
//            future.completeExceptionally(e);
//            throw e;
//        }

        return result;
    }
}
