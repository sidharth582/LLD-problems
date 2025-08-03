
public class Main {
    public static void main(String[] args) {
        AudioPlayer player=new AudioPlayer();
        
        player.play("mp3", "low.mp3");
        player.play("mp4", "far_away.mp4");
        player.play("vlc", "conjuring.vlc");
        player.play("avi", "mind_blown.avi");
    }
}
