public class Player {
    //No Encapsulation
    public String fullName;//When accessing fields directly, any changes
    //have to be made thorughout all the classes in the app.
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out!");
            //Reduce number of lives remaining for the player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
