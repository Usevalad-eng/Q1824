package homeTasks.homeTask9MusicPlaylist;

public class MusicPlayer {
    public static void main(String[] args) {

        PlayList playList = new PlayList();
        MusicItem song1 = new Song("Song one","Artist one", 180, "Rock", 5);
        MusicItem song2 = new Song("Song two","Artist two", 190, "Pop", 4);
        MusicItem podcast1 = new Podcast("Pod one","Artist two", 200, "Pop", 3);
        playList.addTrack(song1);
        playList.addTrack(song2);
        playList.addTrack(podcast1);
        playList.searchByTitle("Song one");
        playList.searchByArtist("Artist two");
        playList.getTracksByGenre("Pop");
        playList.removeTrack(song2);
        playList.printPlaylist();
        playList.getTotalDuration();
        playList.addTrack(song2);
        playList.sortPlaylist();

    }
}
