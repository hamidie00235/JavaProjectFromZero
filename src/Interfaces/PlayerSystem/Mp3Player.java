package Interfaces.PlayerSystem;

public class Mp3Player implements  Playable{
    @Override
    public void play() {
        System.out.println("Mp3 is played.");
    }

    @Override
    public void pause() {
        System.out.println("Mp3 is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Mp3 is stopped.");

    }
}
