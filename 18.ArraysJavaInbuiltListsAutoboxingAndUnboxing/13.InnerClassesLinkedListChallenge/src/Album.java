import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    //Create two fields for the album class and one ArrayList
    private String albumName;
    private String artist;
    //Create the ArrayList
    private SongList songs;

    public Album(String albumName, String artist) {
        this.albumName = albumName;
        this.artist = artist;
        this.songs = new SongList();
    }

    //Create the methods that add functionality
    //Add a song method
    public boolean addSong(String title, double duration) {
        return this.songs.add(new Song(title, duration));
    }

    //Create a playlist and add songs to that playlist
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumber);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }//other wise do below
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    //Create an overloaded addToPlaylist method that uses the title to indicate the position in the list
    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        Song checkedSong = songs.findSong(title);
        if(checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song, " + "'" + title + "'" + ", is not in this album");
        return false;
    }
    
    private class SongList {
        private ArrayList<Song>  songs;

        public SongList() {
            this.songs = new ArrayList<Song>();
        }
        public boolean add(Song song) {
            if(songs.contains(song)) {
                return false;
            }
            this.songs.add(song);
            return true;
        }

        private Song findSong(String title) {
            //below is a for each loop
            for(Song checkedSong: this.songs) {
                if(checkedSong.getTitle().equals(title) ) {
                    return checkedSong;
                }
            }
            return null;
        }
        public Song findSong(int trackNumber) {
            int index = trackNumber - 1;
            if((index >= 0) && (index < songs.size())) {
                return songs.get(index);
            }
            return null;
        }
    //inner class

    }

//outer class

}
