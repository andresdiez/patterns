package com.example;


interface PlayerController {
    void skipTo(int timeSec);

    void play();

    void pause();

    void stop();

    void setContinuesPlay(boolean playerController);

    void playNext();

    void setVideoLoader(VideoLoader videoLoader);

    interface VideoLoader{
        Video onLoad();
    }
}
