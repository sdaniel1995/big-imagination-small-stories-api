package com.big.imagination.small.stories.big_imagination_small_stories.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "AudioFiles")
public class AudioFile {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String series;

    @Column
    private String chapter;

    @Column
    private String type;

    @Lob
    private byte[] data;

    public AudioFile() {

    }

    public AudioFile(String series, String chapter, String type, byte[] data) {
        this.series = series;
        this.chapter = chapter;
        this.type = type;
        this.data = data;
    }

    public Integer getId() {
        return this.id;
    }

    public String getSeries() {
        return series;
    }

    public void setName(String series) {
        this.series = series;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
