package com.example;


public class PlayerControllerImpl implements PlayerController {

    private boolean continuesPlay;
    private VideoLoader videoLoader;

    @Override
    public void skipTo(int timeSec) {
    }

    @Override
    public void play() {
        Video video = videoLoader.onLoad();
        while (continuesPlay && video != null) {
            video = videoLoader.onLoad();
        }
    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void setContinuesPlay(boolean continuesPlay) {
        this.continuesPlay = continuesPlay;
    }

    @Override
    public void playNext() {

    }

    @Override
    public void setVideoLoader(VideoLoader videoLoader) {
        this.videoLoader = videoLoader;
    }
}
