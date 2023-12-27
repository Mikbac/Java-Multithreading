# Base information

Concurrency == Multithreading

Don't need multiple cores to achieve concurrency

Can create an illusion of multiple tasks execution in parallel using just a single core.
With multiple cores we can truly run tasks completely parallel.

Multiple threads in a single process share:
* the heap
* code
* the process's open files
* the process's metadata

## Context Switching

Context switching in an operating system involves saving the context or state of a running process so that it can be
restored later, and then loading the context or state of another. process and run it.

Too many threads - spending more time in management than real productive work

Threads consume less resources than processes.

## Threads scheduling

System creates epochs and ech epoch contains parts of threads (to select
uses `Dynamic Priority = Static Priority + Bonus`). `Static Priority` is set by developer programmatically, `Bonus` can
be negative and is adjusted by the Operating System in every epoch.

## When multiple threads

* if the tasks share a lot of data
* threads are much faster to create and destroy
* switching between threads of the same process is faster

## When multiple processes

* security and stability are of higher importance
* tasks are unrelated to each other
