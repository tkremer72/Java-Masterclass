public class Hamburger {
    //Create four variables
    private String name;
    private String meat;
    private String breadRollType;
    private double price;

    //Create four addons for hamburgers
    private String addition1Name;
    private double addition1Price;

    private String addition2Name;
    private double addition2Price;

    private String addition3Name;
    private double addition3Price;

    private String addition4Name;
    private double addition4Price;

    //constructor to initialize the four fields
    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.breadRollType = breadRollType;
        this.price = price;
    }
    //Create four methods for adding items to hamburger
    public void addHamburgerAddition1(String name, double price) {
        this.addition1Price += price;
        addition1Name = name;
    }
    public void addHamburgerAddition2(String name, double price) {
        this.addition2Price += price;
        addition2Name = name;
    }
    public void addHamburgerAddition3(String name, double price) {
        this.addition3Price += price;
        addition3Name = name;
    }
    public void addHamburgerAddition4(String name, double price) {
        this.addition4Price += price;
        addition4Name = name;
    }
    //Create one method to tall up the hamburger and its additions
    public double itemizeHamburger() {
        double hamburgerPrice = this.price;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " roll with " + this.meat + ", price is " + this.price);
        if(this.addition1Name != null) {
            hamburgerPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if(this.addition2Name != null) {
            hamburgerPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if(this.addition3Name != null) {
            hamburgerPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if(this.addition4Name != null) {
            hamburgerPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        return hamburgerPrice;
    }
}
