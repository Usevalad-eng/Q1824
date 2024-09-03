package homeTasks.homeTask9MisicPlayListV2;

public class SongV2 extends MusicItemV2{
    String album;

    public SongV2(String title, String artist, int duration, String genre, int rating, String album) {
        super(title, artist, duration, genre, rating);
        this.album = album;
    }

}
