package com.gatnau.mywardobe.api.moods;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "moods")
public interface MoodRepository extends PagingAndSortingRepository<Mood, Long> {

}
