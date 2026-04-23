import java.util.LinkedList;

public class Practical48 {
    public static void main(String[] args) {
        System.out.println("Dhruv Soni - 240390107005");
        LinkedList<String> playlist = new LinkedList<>();

        playlist.add("Song A");
        playlist.add("Song B");
        playlist.add("Song C");
        playlist.add("Song D");

        System.out.println("Full playlist: " + playlist);

        String firstSong = playlist.removeFirst();
        System.out.println("Playing first song: " + firstSong);
        System.out.println("Playlist after playing first song: " + playlist);

        String lastSong = playlist.removeLast();
        System.out.println("Skipped last song: " + lastSong);
        System.out.println("Playlist after skipping last song: " + playlist);
    }
}

