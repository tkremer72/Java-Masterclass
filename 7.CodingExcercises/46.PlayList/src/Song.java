public class Song {
    //Create two fields
    private String title;
    private double duration;
    //Create a constructor that initializes the fields
    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }
    //Create a getter to get the song title

    public String getTitle() {
        return title;
    }
    //Create an override method that converts the title to string

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
