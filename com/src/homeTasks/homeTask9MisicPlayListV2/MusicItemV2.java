package homeTasks.homeTask9MisicPlayListV2;

public abstract class MusicItemV2 implements AudioTrackV2{
    String title;
    String artist;
    int duration;
    String genre;
    int rating;

    static {
        System.out.println("Rating of song or podcast  must be from 0 to 5");
    }

    public MusicItemV2(String title, String artist, int duration, String genre, int rating) {
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
        this.rating = rating;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getArtist() {
        return artist;
    }

    @Override
    public int getDuration() {
        return duration;
    }

    @Override
    public String getGenre() {
        return genre;
    }

    @Override
    public int getRating() {
        return rating;
    }

    @Override
    public void setRating(int rating) {
        if (rating >= 0 && rating < 6){
            this.rating = rating;
        }else {
            System.out.println("rating must be from 0 to 5");
        }
    }

    @Override
    public String toString() {
        return "MusicItem{" +
                "title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", duration=" + duration +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                '}';
    }

}
