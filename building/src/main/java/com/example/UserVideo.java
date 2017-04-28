package com.example;


public class UserVideo implements Video {
    private String video;
    private int time;
    private int codec;
    private long size;

    public UserVideo(String video) {
        this.video = video;
    }

    @Override
    public String getVideo() {
        return video;
    }

    @Override
    public int getLength() {
        return time;
    }

    @Override
    public int getCodec() {
        return codec;
    }

    @Override
    public long getSize() {
        return size;
    }
}
