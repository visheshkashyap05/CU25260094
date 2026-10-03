interface Camera {
    void takePhoto();
}

interface MusicPlayer {
    void playMusic();
}

class Smartphone implements Camera, MusicPlayer {
    @Override
    public void takePhoto() {
        System.out.println("Smartphone is taking a photo.");
    }

    @Override
    public void playMusic() {
        System.out.println("Smartphone is playing music.");
    }
}

public class ques16 {
    public static void main(String[] args) {
        Smartphone phone = new Smartphone();
        phone.takePhoto();
        phone.playMusic();
    }
}
