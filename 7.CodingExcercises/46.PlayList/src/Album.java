import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class Album {
    //Create the fields needed
    private String name;
    private String artist;

    private ArrayList<Song> songs;
    //Create a constructor that initializes the fields
    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    //Create a method to add a song
    public boolean addSong(String title, double duration) {
        //check if the song exists
        if(findSong(title) != null) {
            return false;
        }

        Song songAdded = new Song(title, duration);
        songs.add(songAdded);
        System.out.println(songAdded + " has been added to the playlist");

        return true;
    }

    //Create the find song method
    private Song findSong(String title) {
        if(!songs.isEmpty()) {
            for(Song song: songs) {
                if(song.getTitle().equals(title)) {
                    return song;
                }
            }
        }
        return null;
    }

    //Create method to add a song to the playlist
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        if(trackNumber <= 0 || trackNumber > songs.size()) {
            return false;
        }
        Song songAdded = songs.get(trackNumber-1);
        String songTitleAdded = songAdded.getTitle();

        ListIterator<Song> playListIterator = playList.listIterator();
        while(playListIterator.hasNext()) {
            if(playListIterator.next().getTitle().compareTo(songTitleAdded) == 0) {
                return false;
            }
        }
        playList.add(songAdded);
        
        return true;
    }
    //Create overloaded method to add a song to the playlist
    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song songAdded = findSong(title);
        if(songAdded == null) {
            return false;
        }
        ListIterator<Song> playListIterator = playList.listIterator();
        while(playListIterator.hasNext()) {
            if(playListIterator.next().getTitle().compareTo(songAdded.getTitle()) == 0) {
                return false;
            }
        }
        playList.add(songAdded);
        return true;
    }
}
