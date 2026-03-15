# Async vs sync requests

Tutorial: https://spring.io/guides/gs/async-method/

## Async

```shell
curl http://localhost:8080/user/async
```

Time: 1574 ms

## Async-queue

```shell
curl http://localhost:8080/user/async-queue
```

Time: 2815 ms

## Sec-async

```shell
curl http://localhost:8080/user/sec-async
```

Time: 3225 ms

## Sync

```shell
curl http://localhost:8080/user/sync
```

Time: 3217 ms
