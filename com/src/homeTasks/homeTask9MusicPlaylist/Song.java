package homeTasks.homeTask9MusicPlaylist;

public class Song extends MusicItem {

    String album;

    public Song(String title, String artist, int duration, String genre, int rating, String album) {
        super(title, artist, duration, genre, rating);
        this.album = album;
    }
}
