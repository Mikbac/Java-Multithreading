# Memory regions

* Stack Memory Region
* Heap Memory Region

## Stack Memory (not shared)

All variables belong to the thread executing on that stack - local primitive types, local references.

https://www.baeldung.com/java-stack-heap

Stack Memory in Java is used for static memory allocation and the execution of a thread. It contains primitive values
that are specific to a method and references to objects referred from the method that are in a heap.

Stack size is fixed.

## Heap Memory Region (shared)

Includes objects, collections, class members, static variables.

Shared memory region belongs to the process.

Managed by Garbage Collector.

Object stay as long as we have reference to them.

Static variables stay forever.

---------------------------------------------

## Synchronized

https://www.baeldung.com/java-synchronized

We can use the synchronized keyword on different levels:

* Instance methods
* Static methods
* Code blocks

When we use a synchronized block, Java internally uses a monitor, also known as a monitor lock or intrinsic lock, to
provide synchronization. These monitors are bound to an object; therefore, all synchronized blocks of the same object
can have only one thread executing them at the same time.

```java
// synchronize a whole method
public synchronized void increment() {
    this.items++;
}
```

or

```java
public void increment() {
    // synchronize only the part of the method
    synchronized (this.lock) {
        items++;
    }
}
```

The lock behind the synchronized methods and blocks is a reentrant. This means the current thread can acquire the same
synchronized lock over and over again while holding it.

## Race Condition

https://www.linkedin.com/pulse/understanding-race-conditions-causes-prevention-pavan-pothuganti-9z61c

A race condition in Java emerges when two or more threads concurrently access shared data, and the final outcome hinges
on the timing or order of their execution.

## Data Race

Data races occur when a shared resource is unpredictably accessed by multiple tasks.

---------------------------------------------

## Atomic operations

https://www.baeldung.com/java-atomic-variables

Atomic means the operation completes without any possibility for something to happen between (if it appears to the rest
of the system as if it occurred at once).

Atomic operations are those that can be performed atomically without interference from other threads.

Atomic operations:

* all assignments to primitive types are safe except long and duble
* assignments to reference
* assignments to `duble` and `long` using `volatile` keyword

Volatile is quite a useful keyword because it can help ensure the visibility aspect of the data change without providing
mutual exclusion.

Without volatile, readers could see some non-updated value.

```
private static volatile int a = 0;
```

A small toolkit of classes that support lock-free thread-safe programming on single
variables -> `java.util.concurrent.atomic`

---------------------------------------------

## Deadlock

Deadlock occurs in a situation where two or more threads are blocked forever, waiting for each other.

Deadlock conditions:

* Mutual exclusion
* Hold and wait
* Non-preemptive allocation
* Circular wait

Deadlock solutions:

* Avoid circular wait e.g. [Example17 - Item](../examples/src/main/java/pl/mikbac/threads/Example108/Item.java)
* Deadlock detection - watchdog
* Thread interruption
* tryLock operations
