# Semaphore

We can use semaphores to limit the number of concurrent threads accessing a specific resource.

Unlike the locks that allows only one user per resource.

`release()` – release a permit
`acquire()` - acquires a permit and blocking until one is available

```java
class Pool {
    static final int MAX_AVAILABLE = 100;
    final Semaphore available = new Semaphore(MAX_AVAILABLE, true);

    public Object doSomething() {
        available.acquire();
        // do something
        available.release();
    }

}
```
