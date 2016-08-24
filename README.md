# akka-cluster-constructr-example

A modified [`akka-sample-cluster-scala`](http://www.lightbend.com/activator/template/akka-sample-cluster-scala) TransformationApp example that works with [ConstructR](https://github.com/hseeberger/constructr).  The only real change to this example was
the removal of akka cluster seed nodes and the addition of the required ConstructR configuration.  The hard coded ports for several of the 
TransformationApp backend nodes were also removed.  ConstructR coordinates the creation of the cluster for all akka nodes.

## To run

1. Start etcd.  I used the [`elcolio/etcd`](https://hub.docker.com/r/elcolio/etcd/) pub docker image: `docker run -d -p 2379:2379 elcolio/etcd:latest`
1. Update `./src/main/resources/transformation-constructr.conf` to provide appropriate connection details to running etcd.  Config is located in
 `constructr.coordination` section.
2. Run `sample.cluster.transformation.TransformationApp`.