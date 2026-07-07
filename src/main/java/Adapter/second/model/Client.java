package Adapter.second.model;

import Adapter.second.interfaces.MusicPlayer;

public class Client {
    private MusicPlayer musicPlayer;

    public Client(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    public void tocar(String arquivo){
        this.musicPlayer.play(arquivo);
    }
}
