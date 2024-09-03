package homeTasks.homeTask9MusicPlaylist;

import java.util.List;

public class MusicPlayer {
    public static void main(String[] args) {

        PlayList playList = new PlayList();
        MusicItem song1 = new Song("Song one","Artist one", 180, "Rock", 5, "album1");
        MusicItem song2 = new Song("Song two","Artist two", 190, "Pop", 4, "album2");
        MusicItem podcast1 = new Podcast("Pod one","Artist two", 200, "Pop", 3, "www.h.com");
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
        System.out.println("*****************************************************************************************");
        System.out.println("Searching for Pod");
        List<AudioTrack> podcasts = playList.searchByTitleV2("pod");
        for (AudioTrack track : podcasts){
            System.out.println(track.getTitle());
        }
        System.out.println("*****************************************************************************************");
        podcast1.setRating(1);
        playList.sortByRating();
        System.out.println("Playlist sorted by rating");
        playList.printPlaylist();
    }
}
