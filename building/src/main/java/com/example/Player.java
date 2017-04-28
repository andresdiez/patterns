package com.example;


import java.util.ArrayList;

public class Player {

    private final String playerName;
    private final PlayerController playerController;
    private final ArrayList<Video> playList;

    private int currentVideo = 0;

    private Player(Builder builder) {
        this.playerName = builder.playerName;
        this.playerController = builder.playerController;
        this.playerController.setContinuesPlay(builder.continuesPlay);
        PlayerController.VideoLoader videoLoader = new PlayerController.VideoLoader() {
            @Override
            public Video onLoad() {
                return playList.get(currentVideo++);
            }
        };
        this.playerController.setVideoLoader(videoLoader);
        this.playList = builder.playList;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void skipTo(int timeSec) {
        playerController.skipTo(timeSec);
    }

    public void play() {
        playerController.play();
    }

    public void pause() {
        playerController.pause();
    }

    public void stop() {
        playerController.stop();
    }

    public void playNext() {
        playerController.playNext();
    }

    public static class Builder {

        private final String playerName;
        private PlayerController playerController;
        private boolean continuesPlay = false;
        private ArrayList<Video> playList;

        public Builder(String playerName) {
            this.playerName = playerName;
        }

        public Builder setController(PlayerController playerController) {
            this.playerController = playerController;
            return this;
        }

        public Player build() {
            return new Player(this);
        }

        public Builder setContinuesPlay(boolean continuesPlay) {
            this.continuesPlay = continuesPlay;
            return this;
        }

        public Builder setPlayList(ArrayList<Video> playList) {
            this.playList = playList;
            return this;
        }
    }


}
