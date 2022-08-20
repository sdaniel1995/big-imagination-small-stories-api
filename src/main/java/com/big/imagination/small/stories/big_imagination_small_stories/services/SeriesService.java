package com.big.imagination.small.stories.big_imagination_small_stories.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.big.imagination.small.stories.big_imagination_small_stories.models.Series;
import com.big.imagination.small.stories.big_imagination_small_stories.repositories.SeriesRepository;

@Service
public class SeriesService {
    private SeriesRepository seriesRepository;

    @Autowired
    public SeriesService(SeriesRepository seriesRepository) {
        this.seriesRepository = seriesRepository;
    }

    public List<Series> getAllSeries() {
        return seriesRepository.findAll();
    }
}
