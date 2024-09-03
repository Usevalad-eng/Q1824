package homeTasks.homeTask9MisicPlayListV2;

public class PodcastV2 extends MusicItemV2{
    String host;

    public PodcastV2(String title, String artist, int duration, String genre, int rating, String host) {
        super(title, artist, duration, genre, rating);
        this.host=host;
    }
}
