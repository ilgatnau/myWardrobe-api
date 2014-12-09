package com.gatnau.mywardobe.api.pictures;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "favourites")
public interface FavouriteRepository extends PagingAndSortingRepository<Favourite, Long> {

}
