package homeTasks.homeTask9MusicPlaylist;

public class Podcast extends MusicItem {

    String host;

    public Podcast(String title, String artist, int duration, String genre, int rating, String host) {
        super(title, artist, duration, genre, rating);
        this.host=host;
    }
}
