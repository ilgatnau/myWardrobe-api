package com.gatnau.mywardobe.api.users;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


/**
	How to manage resouces relationships
	- http://stackoverflow.com/questions/17981252/how-to-update-reference-object-in-spring-data-rest?rq=1
	- http://docs.spring.io/spring-data/rest/docs/2.2.0.RELEASE/reference/html/#repository-resources.association-resource	
	- http://stackoverflow.com/questions/22499819/spring-data-rest-update-a-resource%C2%B4s-association-using-proper-http-method
*/
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends PagingAndSortingRepository<User, Long> {


}
