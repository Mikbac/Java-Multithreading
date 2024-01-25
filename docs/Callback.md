# Non-blocking IO and callback

(Thread-per-core)

Improve performance and minimize context switching and memory overhead.

## Disadvantages

* very hard to work
* JDK provides only a thin layer of abstraction

## Callback

https://www.baeldung.com/java-callback-functions

A callback function is a function passed as an argument to another function and executed when that function completes or
some event happens.

## Third part libraries:

* netty
* vert.x
* webflux
