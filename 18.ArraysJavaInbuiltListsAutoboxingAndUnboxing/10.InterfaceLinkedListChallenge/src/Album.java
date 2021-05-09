import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    //Create two fields for the album class and one ArrayList
    private String albumName;
    private String artist;
    //Create the ArrayList
    private ArrayList<Song> songs;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }

    //Create the methods that add functionality
    //Add a song method
    public boolean addSong(String title, double duration) {
        if(findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    //Create a method to find a song based on the title
    private Song findSong(String title) {
        //below is a for each loop
        for(Song checkedSong: this.songs) {
            if(checkedSong.getTitle().equals(title) ) {
                return checkedSong;
            }
        }
        return null;
    }

    //Create a playlist and add songs to that playlist
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber -1;//For this method tracknumber represents the position in the list
        if((index >= 0) && (index <= this.songs.size())) {//make sure there is a song with that track number
            playList.add(this.songs.get(index));//if song exists, Add the song to the playlist
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    //Create an overloaded addToPlaylist method that uses the title to indicate the position in the list
    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song, " + "'" + title + "'" + ", is not in this album");
        return false;
    }

}
