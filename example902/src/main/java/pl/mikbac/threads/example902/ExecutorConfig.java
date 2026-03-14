package pl.mikbac.threads.example902;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

/**
 * Created by MikBac on 14.03.2026
 */

@Configuration
public class ExecutorConfig {

    @Bean
    @Primary
    public ThreadPoolTaskExecutor factorialExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(10);
        executor.setMaxPoolSize(10);
        executor.setQueueCapacity(100);
        executor.setThreadNamePrefix("factorial-");
        executor.initialize();
        return executor;
    }
}
