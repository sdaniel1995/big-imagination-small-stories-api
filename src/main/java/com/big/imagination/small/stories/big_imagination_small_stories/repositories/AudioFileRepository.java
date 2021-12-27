package com.big.imagination.small.stories.big_imagination_small_stories.repositories;

import com.big.imagination.small.stories.big_imagination_small_stories.models.AudioFile;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudioFileRepository extends JpaRepository<AudioFile, String> {

}
