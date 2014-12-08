package com.gatnau.mywardobe.api.brands;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "brands")
public interface BrandRepository extends PagingAndSortingRepository<Brand, Long> {
	
	Brand findByDescription(@Param("description") String description);

}
