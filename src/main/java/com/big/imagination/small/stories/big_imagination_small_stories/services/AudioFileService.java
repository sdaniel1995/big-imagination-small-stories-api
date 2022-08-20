package com.big.imagination.small.stories.big_imagination_small_stories.services;

import java.io.IOException;
import java.util.stream.Stream;

import com.big.imagination.small.stories.big_imagination_small_stories.models.AudioFile;
import com.big.imagination.small.stories.big_imagination_small_stories.repositories.AudioFileRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class AudioFileService {
    private AudioFileRepository audioFileRepository;

    @Autowired
    public AudioFileService(AudioFileRepository audioFileRepository) {
        this.audioFileRepository = audioFileRepository;
    }

    public AudioFile store(MultipartFile file, String series, String chapter) throws IOException {
        AudioFile audioFile = new AudioFile(series, chapter, file.getContentType(), file.getBytes());
        return audioFileRepository.save(audioFile);
    }

    public AudioFile getFile(Integer id) {
        return audioFileRepository.findById(id).get();
    }

    public Stream<AudioFile> getAllFiles() {
        return audioFileRepository.findAll().stream();
    }
}
