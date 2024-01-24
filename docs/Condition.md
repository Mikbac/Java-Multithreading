# Condition

https://www.tutorialspoint.com/java_concurrency/concurrency_condition.htm

A java.util.concurrent.locks.Condition interface provides a thread ability to suspend its execution, until the given
condition is true. A Condition object is necessarily bound to a Lock and to be obtained using the newCondition() method.

## Await - suspend the thread

* `await()` - unlock lock, wait until signalled
* `awaitNanos(long nanosTimeout)` - wait no longer than nanosTimeout
* `await(long time, TimeUnit unit)` - wait no longer than time, in a given unit
* `long awaitUntil()` - wake up before deadline date

## Signal - wake thread/threads

* `signal()` - wakes up a signal thread,w waiting on the condition variable
* `signalAll()` - broadcast a signal to all threads currently waiting on the condition variable
