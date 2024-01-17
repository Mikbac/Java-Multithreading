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

## Atomic operations

https://www.baeldung.com/java-atomic-variables

Atomic means the operation completes without any possibility for something to happen between (if it appears to the rest
of the system as if it occurred at once).

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
