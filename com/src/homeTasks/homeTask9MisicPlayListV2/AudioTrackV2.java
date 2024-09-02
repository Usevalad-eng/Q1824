package homeTasks.homeTask9MisicPlayListV2;

public interface AudioTrackV2 {
    String getTitle();

    String getArtist();

    int getDuration();

    String getGenre();

    int getRating();

    void setRating(int rating);
}
