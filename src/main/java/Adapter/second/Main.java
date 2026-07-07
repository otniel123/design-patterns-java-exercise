package Adapter.second;

import Adapter.second.interfaces.MusicPlayer;
import Adapter.second.model.Client;
import Adapter.second.model.MP3Player;

public class Main {
    public static void main(String[] args) {
        MusicPlayer musicPlayer = new MP3Player();
        Client client = new Client(musicPlayer);

        client.tocar("Tocando música legal");
    }
}
