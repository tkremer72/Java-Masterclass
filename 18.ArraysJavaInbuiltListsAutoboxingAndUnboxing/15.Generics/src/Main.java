import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        ArrayList<Integer> items = new ArrayList<>();
//        items.add(1);
//        items.add(2);
//       // items.add("thomas"); //will throw an exception error at run time.
//        items.add(3);
//        items.add(4);
//        items.add(5);
//
//        printDoubled(items);
//    }
//
//    private static void printDoubled(ArrayList<Integer> n) {
//        for(int i : n) {
//            System.out.println(i * 2);
//        }

        FootballPlayer joe = new FootballPlayer("Joe");
        BaseballPlayer pat = new BaseballPlayer("Pat");
        SoccerPlayer beckham = new SoccerPlayer("Beckham");

        Team<FootballPlayer> adelaideCrows = new Team<>("Adelaide Crows");
        adelaideCrows.addPlayer(joe);
//        adelaideCrows.addPlayer(pat);
//        adelaideCrows.addPlayer(beckham);
        System.out.println(adelaideCrows.numPlayers());
        System.out.println("********************************");

        Team<BaseballPlayer> baseballTeam = new Team<>("Chicago Cubs");
        baseballTeam.addPlayer(pat);
        System.out.println(baseballTeam.numPlayers());
        System.out.println("*********************************");

        Team<SoccerPlayer> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(beckham);

        System.out.println(brokenTeam.numPlayers());
        System.out.println("***********************************");

        Team<FootballPlayer> melbourne = new Team<>("Melbourne");
        FootballPlayer banks = new FootballPlayer("Gordon");
        melbourne.addPlayer(banks);

        Team<FootballPlayer> hawthorn = new Team<>("Hawthorne");
        Team<FootballPlayer> fremantle = new Team<>("Fremantle");

        hawthorn.matchResult(fremantle, 1, 0);
        hawthorn.matchResult(adelaideCrows, 3, 8);

        adelaideCrows.matchResult(fremantle, 2, 1);
        //adelaideCrows.matchResult(baseballTeam, 1, 1);

        System.out.println("************************************");

        System.out.println("Rankings");
        System.out.println(adelaideCrows.getName() + ": " + adelaideCrows.ranking());
        System.out.println(melbourne.getName() + ": " + melbourne.ranking());
        System.out.println(fremantle.getName() + ": " + fremantle.ranking());
        System.out.println(hawthorn.getName() + ": " + hawthorn.ranking());

        System.out.println("************************************");

        System.out.println(adelaideCrows.compareTo(melbourne));
        System.out.println(adelaideCrows.compareTo(hawthorn));
        System.out.println(hawthorn.compareTo(adelaideCrows));
        System.out.println(melbourne.compareTo(fremantle));

    }
}
