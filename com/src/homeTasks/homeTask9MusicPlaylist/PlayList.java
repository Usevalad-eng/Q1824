package homeTasks.homeTask9MusicPlaylist;

import homeTasks.homeTask4.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PlayList {
    ArrayList<AudioTrack> audioTracks = new ArrayList<>();

    public void addTrack(AudioTrack track){
        audioTracks.add(track);
        System.out.println("Track is added");
    }

    public void removeTrack(AudioTrack track){
        audioTracks.remove(track);
        System.out.println("Track is removed");
    }

    public List<AudioTrack> searchByTitle(String title){
        for (AudioTrack i : audioTracks) {
            if (i.getTitle().equalsIgnoreCase(title)){
                System.out.println(title + " - " + " Songs/podcasts by title: " + i);
            }
        }
        return audioTracks;
    }

    public void searchByArtist(String artist){
        for (AudioTrack i : audioTracks) {
            if (i.getArtist().equalsIgnoreCase(artist)){
                System.out.println(artist + " - " + " Songs/podcasts by artist: " + i);
            }
        }
    }

    public void getTracksByGenre(String genre){
        for (AudioTrack i : audioTracks) {
            if (i.getGenre().equalsIgnoreCase(genre)){
                System.out.println(genre + " - " + " Songs/podcasts by genre: " + i);
            }
        }
    }

    public void printPlaylist(){
        System.out.println("All songs and podcasts: \t");
        for (AudioTrack i : audioTracks) {
            System.out.println(" - " + i);
        }
    }

    public int getTotalDuration(){
        int sumDuration = 0;
        for (AudioTrack i : audioTracks) {
            sumDuration+=i.getDuration();
        }
        System.out.println("All songs/podcasts duration: " + sumDuration + " seconds. ");
        return sumDuration;
    }

    public void sortPlaylist(){
        audioTracks.sort(new Comparator<AudioTrack>() {
            @Override
            public int compare(AudioTrack o1, AudioTrack o2) {
                return Integer.compare(o2.getRating(),o1.getRating());
            }
        });
        System.out.println("Sorted songs and podcasts: \t");
        for (AudioTrack i : audioTracks) {
            System.out.println(" - " + i);
        }
    }
}
