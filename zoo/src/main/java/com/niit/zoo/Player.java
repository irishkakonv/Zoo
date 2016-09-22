package com.niit.zoo;

import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by Михаил Чугунов on 22.09.2016.
 */
public class Player {

    public static void play(String soundFile) {
        try {
            AudioPlayer.player.start(new AudioStream(new FileInputStream(Player.class.getResource(soundFile).getFile())));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
