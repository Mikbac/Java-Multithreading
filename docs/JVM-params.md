# JVM params

## Virtual threads

https://docs.oracle.com/en/java/javase/21/core/virtual-threads.html

Prints a complete stack trace when a thread blocks while pinned, highlighting native frames and frames holding monitors:

```
-Djdk.tracePinnedThreads=full
```

Running with the option:

```
-Djdk.tracePinnedThreads=short
```

limits the output to just the problematic frames.

