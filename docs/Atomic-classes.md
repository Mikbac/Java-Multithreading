# Atomic

Lock free solution:

* utilize operations which are guaranteed to be one hardware operations
* a single hardware operation is atomic by definition and thread safe

## Atomic instructions

* read/assignee on all primitive types (except long and duble)
* read/assignee on all references
* read/assignee on volatile long and duble

## Atomic classes

From `java.util.concurrent.atomic` package.

Internally uses the unsafe class which provides access to low level, native methods.

Utilize platform specific implementation of atomic operations.

https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/concurrent/atomic/package-summary.html

* `AtomicBoolean` - A boolean value that may be updated atomically.
* `AtomicInteger` - An int value that may be updated atomically.
* `AtomicIntegerArray` - An int array in which elements may be updated atomically.
* `AtomicIntegerFieldUpdater<T>` - A reflection-based utility that enables atomic updates to designated volatile int fields of designated classes.
* `AtomicLong` - A long value that may be updated atomically.
* `AtomicLongArray` - A long array in which elements may be updated atomically.
* `AtomicLongFieldUpdater<T>` - A reflection-based utility that enables atomic updates to designated volatile long fields of designated classes.
* `AtomicMarkableReference<V>` - An AtomicMarkableReference maintains an object reference along with a mark bit, that can be updated atomically.
* `AtomicReference<V>` - An object reference that may be updated atomically.
* `AtomicReferenceArray<E>` - An array of object references in which elements may be updated atomically.
* `AtomicReferenceFieldUpdater<T,V>` - A reflection-based utility that enables atomic updates to designated volatile reference fields of designated classes.
* `AtomicStampedReference<V>` - An AtomicStampedReference maintains an object reference along with an integer "stamp", that can be updated atomically.
* `DoubleAccumulator` - One or more variables that together maintain a running double value updated using a supplied function.
* `DoubleAdder` - One or more variables that together maintain an initially zero double sum.
* `LongAccumulator` - One or more variables that together maintain a running long value updated using a supplied function.
* `LongAdder` - One or more variables that together maintain an initially zero long sum.

-----------------------------------------------------------------------------------

## AtomicReference

An object reference that may be updated atomically.

Atomically sets the value to newValue if the current value == expectedValue, with memory effects as specified by

```
final boolean compareAndSet(V expectedValue, V newValue)
```
