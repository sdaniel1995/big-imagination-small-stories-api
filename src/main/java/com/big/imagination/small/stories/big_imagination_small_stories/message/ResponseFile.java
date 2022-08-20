package com.big.imagination.small.stories.big_imagination_small_stories.message;

public class ResponseFile {
    private String series;
    private String chapter;
    private String url;
    private String type;
    private byte[] data;
    private long size;

    public ResponseFile(String series, String chapter, String url, String type, byte[] data, long size) {
        this.series = series;
        this.chapter = chapter;
        this.url = url;
        this.type = type;
        this.data = data;
        this.size = size;
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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
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

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }
}
