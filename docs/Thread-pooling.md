# Thread pooling

(Thread-per-task)

Allows reuse the same threads for the entire application.

## IO-Bounds applications

I/O bound refers to a condition in which the time it takes to complete a computation is determined principally by the
period spent waiting for input/output operations to be completed.

For this reason, many threads can wait for a response from the database without using the CPU.

`# threads == # cores` doesn't give the best performance and the best CPU utilization.

## Fixed ThreadPool and dynamic ThreadPool

`ExecutorService` with `newFixedThreadPool` - fixed
`ExecutorService` with `newCachedThreadPool` - dynamic

Threadshing - a situation where most of the CPU is spent on the OS managing the system.
