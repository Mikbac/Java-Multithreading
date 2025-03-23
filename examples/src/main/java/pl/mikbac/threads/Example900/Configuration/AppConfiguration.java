package pl.mikbac.threads.Example900.Configuration;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.Executor;

/**
 * Created by MikBac on 04.01.2024
 */

@Configuration
public class AppConfiguration {

    @Bean
    public Executor taskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        // corePoolSize is the minimum number of workers to keep alive without timing out
        executor.setCorePoolSize(3);
        // maxPoolSize defines the maximum number of threads that can ever be created
        executor.setMaxPoolSize(3);
        // maxPoolSize depends on queueCapacity in that ThreadPoolTaskExecutor will only create a new thread
        // if the number of items in its queue exceeds queueCapacity
        executor.setQueueCapacity(100);
        executor.setThreadNamePrefix("Users");
        executor.initialize();
        return executor;
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplateBuilder().build();
    }

}
