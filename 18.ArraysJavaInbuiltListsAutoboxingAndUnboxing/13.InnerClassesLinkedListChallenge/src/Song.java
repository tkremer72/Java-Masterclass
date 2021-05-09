public class Song {
    //Create two fields
    private String title;
    private double duration;
    //Create a constructor to initialize the fields
    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }
    //Create a getter for the title
    public String getTitle() {
        return title;
    }
    //The method below is optional and is what the instructor did
    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}
