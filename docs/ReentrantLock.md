# ReentrantLock

https://www.baeldung.com/java-concurrent-locks

ReentrantLock class implements the Lock interface. It offers the same concurrency and memory semantics as the implicit
monitor lock accessed using synchronized methods and statements, with extended capabilities.

Works like the `synchronized` keyword.

Requires explicit locking and unlocking.

## ReentrantLock

* works like the `synchronized` keyword
* requires explicit locking and unlocking

```java
Object object = new Object();

public void method() {
    synchronized (object) {
        // do something with resource
    }
}
```

equivalent

```java
Object object = new Object();

public void method() {
    object.lock();
    // do something with resource
    object.unlock();
}
```

https://www.javatpoint.com/java-reentrantlock-getqueuedthreads-method

methods:

* `getQueuedThreads()` - returns a collection containing threads that may be waiting to acquire this lock
* `getOwner()` - returns the current owner thread of the lock
* `isHeldByCurrentThread()`- checks if the current thread occupies this lock
* `isLocked()` - checks if any thread occupies this lock
* `lockInterruptibly()` -  hold the lock until or unless the current thread is interrupted
* `tryLock()` - holds the lock only when any other thread does not hold it at the time of invocation
