package com.big.imagination.small.stories.big_imagination_small_stories.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.big.imagination.small.stories.big_imagination_small_stories.models.Series;
import com.big.imagination.small.stories.big_imagination_small_stories.services.SeriesService;

@RestController
@CrossOrigin("*")
@RequestMapping("/api")
public class SeriesController {
    private SeriesService seriesService;

    @Autowired
    public SeriesController(SeriesService seriesService) {
        this.seriesService = seriesService;
    }

    @GetMapping("/series")
    public List<Series> getSeries() {
        return seriesService.getAllSeries();
    }
}
