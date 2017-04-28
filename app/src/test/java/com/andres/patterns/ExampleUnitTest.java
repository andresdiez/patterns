package com.andres.patterns;

import com.example.Player;
import com.example.PlayerControllerImpl;
import com.example.UserVideo;
import com.example.Video;

import org.junit.Test;

import java.util.ArrayList;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void builder_test() {

        ArrayList<Video> videos = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            videos.add(new UserVideo("video" + i));
        }

        Player.Builder builder = new Player.Builder("Player Name")
                .setController(new PlayerControllerImpl())
                .setPlayList(videos)
                .setContinuesPlay(true);

        Player player = builder.build();
        player.skipTo(20);
        player.play();
        player.playNext();
        player.pause();
        player.stop();

        System.out.print(player.getPlayerName());
    }
}