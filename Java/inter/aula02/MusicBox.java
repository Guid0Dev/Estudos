package aula02;

public record MusicBox(String music) implements VideoPlayer {


    @Override
    public void playMusic() {
        System.out.println("Music box is playing now!");
    }

    @Override
    public void pauseMusic() {
        System.out.println("pausing music");
    }

    @Override
    public void stopMusic() {
        System.out.println("Stopping music");
    }

    @Override
    public void playVideo() {
        System.out.println("Music box is playing video");
    }

    @Override
    public void pauseVideo() {
        System.out.println("pausing vídeo");
    }

    @Override
    public void stopVideo() {
        System.out.println("Stopping music");
    }
    
}
