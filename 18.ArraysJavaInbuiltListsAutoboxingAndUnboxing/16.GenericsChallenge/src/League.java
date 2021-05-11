import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {
    //Create fields
    public String name;
    private ArrayList<T> league = new ArrayList<>();

    //Create a constructor that initializes name field
    public League(String name) {
        this.name = name;
    }
    //Create a method that adds a team
    public boolean add(T team){
        if(league.contains(team)) {
            return false;
        }
        league.add(team);
        return true;
    }
    //Create a method to show a league table
    public void showLeagueTable() {
        Collections.sort(league);//sorts the array
        for(T t : league) {
            System.out.println(t.getName() + ": " + t.ranking());//prints the table
        }
    }
}
