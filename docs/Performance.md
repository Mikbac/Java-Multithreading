# Performance

Latency - Time to completion of a task.
Throughput - The number of tasks completed in a given period (task/time).

## Optimizations

* Thread pooling - creating the threads once and reusing them for feature tasks - instead of recreating threads in every
  time from scratch. This means that tasks are distributed among threads when a thread is available. Assuming that we
  have a 16-core machine - the optimal size of the thread pool to handle an HTTP request is more than 16.
