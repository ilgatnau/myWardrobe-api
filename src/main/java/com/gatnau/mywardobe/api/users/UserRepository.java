package com.gatnau.mywardobe.api.users;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {

	List<User> findByLastName(String name);

}
