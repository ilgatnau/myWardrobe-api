package com.gatnau.mywardobe.api.tags;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "tags")
public interface TagRepository extends PagingAndSortingRepository<Tag, Long> {

	Tag findByDescription(@Param("description") String description);
}
