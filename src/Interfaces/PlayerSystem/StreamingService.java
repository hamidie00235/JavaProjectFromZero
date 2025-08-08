package Interfaces.PlayerSystem;

public class StreamingService implements Playable{
    @Override
    public void play() {
        System.out.println("Streaming service is played.");
    }

    @Override
    public void pause() {
        System.out.println("Streaming service is paused.");
    }

    @Override
    public void stop() {
        System.out.println("Streaming service is stopped.");

    }
    public static void main(String[] args){
        Mp3Player mp3=new Mp3Player();
        StreamingService ss=new StreamingService();
        mp3.play();
        mp3.pause();
        mp3.stop();
        ss.play();
        ss.pause();
        ss.stop();
    }
}
