# ReentrantReadWriteLock

Synchronized and ReentrantLock don't allow multiple readers to access a shared resource concurrently.

ReentrantReadWriteLock allows multiple readers, read shared resource concurrency.

Since the method is guarded by a read lock. Many threads can acquire that lock as long as no other thread is holding the write lock

```java
public void doSomething() {
    ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
    Lock readLock = reentrantReadWriteLock.readLock();
    Lock writeLock = reentrantReadWriteLock.writeLock();

    writeLock.lock();
    try {
        // do something
    } finally {
        writeLock.unlock();
    }

    readLock.lock();
    try {
        // do something
    } finally {
        readLock.unlock();
    }
}
```
