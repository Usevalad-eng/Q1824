package homeTasks.homeTask9MisicPlayListV2;

import homeTasks.homeTask9MisicPlayListV2.AudioTrackV2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class PlayListV2 {
    ArrayList<AudioTrackV2> audioTracks = new ArrayList<>();

    public void addTrack(AudioTrackV2 track){
        audioTracks.add(track);
        System.out.println("Track is added");
    }

    public void removeTrack(AudioTrackV2 track){
        audioTracks.remove(track);
        System.out.println("Track is removed");
    }

    public List<AudioTrackV2> searchbyTitle(String title){
        return audioTracks.stream()
                .filter(track -> track.getTitle().equalsIgnoreCase(title))
                .collect(Collectors.toList());
    }


    public List<AudioTrackV2> searchbyArtist(String artist){
        return audioTracks.stream()
                .filter(track -> track.getArtist().equalsIgnoreCase(artist))
                .collect(Collectors.toList());
    }

    public List<AudioTrackV2> searchbyGenre(String genre){
        return audioTracks.stream()
                .filter(track -> track.getGenre().equalsIgnoreCase(genre))
                .collect(Collectors.toList());
    }

    public void printPlaylist(){
        System.out.println("All songs and podcasts: \t");
        for (AudioTrackV2 i : audioTracks) {
            System.out.println(" - " + i);
        }
    }

    public int getAllDuration(){
        return audioTracks.stream()
                .mapToInt(AudioTrackV2::getDuration)
                .sum();
    }

    public void sortPlaylist(){
        audioTracks.sort(new Comparator<AudioTrackV2>() {
            @Override
            public int compare(AudioTrackV2 o1, AudioTrackV2 o2) {
                return Integer.compare(o2.getRating(),o1.getRating());
            }
        });
        System.out.println("Sorted songs and podcasts: \t");
        for (AudioTrackV2 i : audioTracks) {
            System.out.println(" - " + i);
        }
    }


}
