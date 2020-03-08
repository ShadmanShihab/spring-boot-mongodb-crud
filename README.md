# Spring-Boot-MongoDB-CRUD application
It is a simple crud application using Spring Boot with NoSQL database - MongoDB.
- [Step By Step Guide](docs/step-by-step.md)

## Functionality
| SL | Action               | Endpoint       | Request Type | Payload                                                |
|----|----------------------|----------------|--------------|--------------------------------------------------------|
| 1  | Add single record    | /students      | POST         | {     	 "id":3, 		 "name":"name3", 		 "dept":"dp3" }        |
| 2  | Get all record       | /students      | GET          | X                                                      |
| 3  | Get any record by Id | /students/{id} | GET          | X                                                      |
| 4  | Update record by Id  | /students/{id} | PUT          | {     	 "id":3, 		 "name":"name3updated", 		 "dept":"dp3" } |
| 5  | Delete record by Id  | /students/{id} | DELETE       | X                                                      |
| 6  | Delete all record    | /students      | DELETE       | X                                                      |


## MongoDB integration with Spring Boot

Add this dependency into your `pom.xml` file if you not chose this dependency while creating new project:
```xml
<dependency>
	<groupId>org.springframework.boot</groupId>
	<artifactId>spring-boot-starter-data-mongodb</artifactId>
</dependency>
```

Update `application.properties` file like this:
```
server.port=8087
 
spring.data.mongodb.host=localhost
spring.data.mongodb.port=27017
spring.data.mongodb.database=StudentDetail
```

## References
* [SQL vs NoSQL](https://www.guru99.com/sql-vs-nosql.html)
* [Horizontal vs Vertical Scaling](https://github.com/vaquarkhan/vaquarkhan/wiki/Difference-between-scaling-horizontally-and-vertically)
* [ACID vs BASE](https://neo4j.com/blog/acid-vs-base-consistency-models-explained/)