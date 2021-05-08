# LinkedList Challenge

// Create a program that implements a playlist for songs
// Create a Song class having Title and Duration for a song.
// The program will have an Album class containing a list of songs.
// The albums will be stored in an ArrayList
// Songs from different albums can be added to the playlist and will appear in the list in the order
// they are added.
// Once the songs have been added to the playlist, create a menu of options to:-
// Quit,Skip forward to the next song, skip backwards to a previous song.  Replay the current song.
// List the songs in the playlist
// A song must exist in an album before it can be added to the playlist (so you can only play songs that
// you own).
// Hint:  To replay a song, consider what happened when we went back and forth from a city before we
// started tracking the direction we were going.
// As an optional extra, provide an option to remove the current song from the playlist
// (hint: listiterator.remove()

one of the built in capabilities of Java is in the method below
private Song findSong(String title) {
for(Song checkedSong: this.songs) {
if(checkedSong.getTitle().equals(title)) {
    return checkedSong;
}
}
return null;
}
Line 22 is a shortcut to the for each loop where it is looping through the 
array list of songs, checking the title and if there is a title that matches,
it returns that song title, otherwise it returns null.  Without this shortcut 
the method would look like this.
private Song findSong(String title) {
    for(int i = 0; i < songs.size(); i++;) {
    if(checkedSong.getTitle().equals(title)) {
    return checkedSong;
}
}
return null;
}