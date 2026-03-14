# Atomic variables

```shell
curl http://localhost:8080/counter/standard
curl http://localhost:8080/counter/atomic
# 0
# 0

docker run --rm williamyeh/hey -n 2000 -c 10 -m POST http://host.docker.internal:8080/counter/standard
docker run --rm williamyeh/hey -n 2000 -c 10 -m POST http://host.docker.internal:8080/counter/atomic

curl http://localhost:8080/counter/standard
curl http://localhost:8080/counter/atomic
# 1949
# 2000
```

