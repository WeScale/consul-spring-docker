# consul-spring-docker

This "hello world" project can be use to:
- launch a simple webservice with spring boot
- create a docker with maven / spring boot (just launch mvn package docker:build)
- this docker connect to consul on env variable CONSUL_HOST :8500
- you have to create env variable NETWORK with the network you want to use for consul register, ex: 10.0

I push the docker to: wescale/consuldemo on the DockerHub with 
```docker push wescale/consuldemo``
