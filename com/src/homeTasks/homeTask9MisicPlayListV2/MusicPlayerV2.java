package homeTasks.homeTask9MisicPlayListV2;

import homeTasks.homeTask9MisicPlayListV2.MusicItemV2;
import homeTasks.homeTask9MisicPlayListV2.PlayListV2;
import homeTasks.homeTask9MisicPlayListV2.PodcastV2;
import homeTasks.homeTask9MisicPlayListV2.SongV2;

import java.util.List;

public class MusicPlayerV2 {
    public static void main(String[] args) {
        PlayListV2 playListL = new PlayListV2();
        MusicItemV2 song1 = new SongV2("Song one","Artist one", 180, "Rock", 5, "album1");
        MusicItemV2 song2 = new SongV2("Song two","Artist two", 190, "Pop", 4, "album2");
        MusicItemV2 podcast1 = new PodcastV2("Pod one","Artist two", 200, "Pop", 3, "www.h.com");
        playListL.addTrack(song1);
        playListL.addTrack(song2);
        playListL.addTrack(podcast1);
        System.out.println("*****************************************************************************************");
        System.out.println("Searching title: Pod");
        List<AudioTrackV2> podcasts = playListL.searchbyTitle("Pod one");
        for (AudioTrackV2 track : podcasts){
            System.out.println(track.getTitle() + " " + track.getArtist());
        }
        System.out.println("*****************************************************************************************");
        System.out.println("Searching Artist: 'Artist two' ");
        List<AudioTrackV2> podcasts2 = playListL.searchbyArtist("Artist two");
        for (AudioTrackV2 track : podcasts2){
            System.out.println(track.getTitle() + " " + track.getArtist());
        }
        System.out.println("*****************************************************************************************");
        System.out.println("Searching Genre: 'Pop' ");
        List<AudioTrackV2> podcasts3 = playListL.searchbyGenre("Pop");
        for (AudioTrackV2 track : podcasts3){
            System.out.println(track.getTitle() + " " + track.getArtist() + " " + track.getGenre());
        }
        System.out.println("*****************************************************************************************");
        playListL.removeTrack(song2);
        playListL.printPlaylist();
        playListL.getAllDuration();
        playListL.addTrack(song2);
        playListL.sortPlaylist();

    }
}
