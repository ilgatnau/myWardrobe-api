package com.gatnau.mywardobe.api.users;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
	How to manage resources relationships
	- http://stackoverflow.com/questions/17981252/how-to-update-reference-object-in-spring-data-rest?rq=1
	- http://docs.spring.io/spring-data/rest/docs/2.2.0.RELEASE/reference/html/#repository-resources.association-resource	
	- http://stackoverflow.com/questions/22499819/spring-data-rest-update-a-resource%C2%B4s-association-using-proper-http-method
	
	PATCH relationship example: 
		{"wardrobes" : 
 			[
 				"http://localhost:8080/wardrobes/1", 
 				"http://localhost:8080/wardrobes/2"
 			]
		}
*/
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {

	User findByUsername(@Param("username") String username);
	User findByToken(@Param("token") String token);
}
