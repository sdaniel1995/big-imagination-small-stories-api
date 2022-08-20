package com.big.imagination.small.stories.big_imagination_small_stories.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.big.imagination.small.stories.big_imagination_small_stories.models.Series;

@Repository
public interface SeriesRepository extends JpaRepository<Series, String> {
    
}
