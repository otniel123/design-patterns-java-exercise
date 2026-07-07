package Adapter.second.model;

import Adapter.second.interfaces.MusicPlayer;

public class MP3Player implements MusicPlayer {
    @Override
    public void play(String arquivo) {
        System.out.println(arquivo);
    }
}
