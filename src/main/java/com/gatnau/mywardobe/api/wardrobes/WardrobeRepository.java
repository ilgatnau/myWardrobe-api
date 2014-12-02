package com.gatnau.mywardobe.api.wardrobes;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "wardrobes")
public interface WardrobeRepository extends PagingAndSortingRepository<Wardrobe, Long> {

}
