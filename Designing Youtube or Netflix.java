
https://www.educative.io/courses/grokking-the-system-design-interview/xV26VjZ7yMl

Features
1)Upload/download video
2)write comments
3)Rate -> objections
3)Like/Dislike/subscribe
4)share
5)Add to watch list

SCALE, hence use Cache: Serve global users
1)use caching , and use LRU eviction policy


CDN(Content delivery network) Distrbuted servers : Reduce the number of hops and closer to User geogaphic location .
If not present only then query the Back end server.


Load Balancing & Fault Tolerance:
We should use Consistent Hashing among our cache servers, which will also help in balancing the load between cache servers.
 We should use Consistent Hashing for distribution among database servers as fault tolerence.
Consistent hashing is a very useful strategy for distributed caching system
and DHTs(Distributed hash table). It allows us to distribute data across a cluster 
in such a way that will minimize reorganization when nodes are added or removed.
Hence, the caching system will be easier to scale up or scale down.
 Consistent hashing will not only help in replacing a dead server, but also help in distributing load among servers.
