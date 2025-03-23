# Concurrent Collections

Thread-safe collections -- Java provides the java.util.concurrent package, which contains several concurrent collections

https://docs.oracle.com/en/java/javase/21/docs/api/java.base/java/util/concurrent/package-summary.html

```
When many threads are expected to access a given collection, a ConcurrentHashMap is normally preferable to a synchronized HashMap, 
and a ConcurrentSkipListMap is normally preferable to a synchronized TreeMap. 
A CopyOnWriteArrayList is preferable to a synchronized ArrayList when the expected number of reads and traversals greatly outnumber 
the number of updates to a list.
```

* ConcurrentHashMap
* ConcurrentLinkedDeque
* ConcurrentLinkedQueue
* ConcurrentNavigableMap
* ConcurrentSkipListMap
* ConcurrentSkipListSet
* CopyOnWriteArrayList
* CopyOnWriteArraySet
