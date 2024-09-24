# Parallel Stream

https://www.baeldung.com/java-when-to-use-parallel-stream

The number of threads in the common pool is equal to (the number of processor cores -1).

However, the API allows us to specify the number of threads it will use by passing a JVM parameter:

```
-D java.util.concurrent.ForkJoinPool.common.parallelism=4
```
