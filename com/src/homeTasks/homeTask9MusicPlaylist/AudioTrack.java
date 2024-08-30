package homeTasks.homeTask9MusicPlaylist;

public interface AudioTrack {
    String getTitle();
    String getArtist();
    int getDuration();
    String getGenre();
    int getRating();
    void setRating(int rating);

}
