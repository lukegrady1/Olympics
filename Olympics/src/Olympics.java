import java.util.ArrayList;
import java.util.Arrays;

public class Olympics {
    public static void main(String[] args) {
        //15 players
        Player aBrad = new Player("Tom Brady");
        Player aGrnk = new Player("Rob Gronkowski");
        Player aBojk = new Player("Bo Jackson");
        Player aJord = new Player("Michael Jordan");
        Player aRona = new Player("Cristiano Ronaldo");
        Player aLebr = new Player("LeBron James");
        Player aKobe = new Player("Kobe Bryant");
        Player aBapp = new Player("Kylian Mbappe");
        Player aRoon = new Player("Wayne Rooney");
        Player aDevr = new Player("Rafael Devers");
        Player aKyle = new Player("Kyler Murray");
        Player aBoga = new Player("Xander Bogaerts");
        Player aGret = new Player("Wayne Gretzky");
        Player aBerg = new Player("Patrice Bergeron");
        Player aMarc = new Player("Brad Marchand");

        //creating 5 NSFs
        NSF Football = new NSF("Football");
        NSF Basketball = new NSF("Basketball");
        NSF Soccer = new NSF("Soccer");
        NSF Baseball = new NSF("Baseball");
        NSF Hockey = new NSF("Hockey");

        //all five NSFs adding atleast three players to each
        //Football
        Football.addPlayer(aBrad);
        Football.addPlayer(aGrnk);
        Football.addPlayer(aBojk);
        Football.addPlayer(aKyle);

        //basketball
        Basketball.addPlayer(aJord);
        Basketball.addPlayer(aLebr);
        Basketball.addPlayer(aKobe);

        //soccer
        Soccer.addPlayer(aRona);
        Soccer.addPlayer(aBapp);
        Soccer.addPlayer(aRoon);

        //baseball
        Baseball.addPlayer(aKyle);
        Baseball.addPlayer(aBoga);
        Baseball.addPlayer(aJord);
        Baseball.addPlayer(aDevr);

        //hockey
        Hockey.addPlayer(aGret);
        Hockey.addPlayer(aBerg);
        Hockey.addPlayer(aMarc);

        //Take 3 players and add at least 2 national sports federations to each of them.
        //lebron
        aLebr.addNSF(Hockey);
        aLebr.addNSF(Football);

        //gretzky
        aGret.addNSF(Baseball);
        aGret.addNSF(Soccer);

        //ronaldo
        aRona.addNSF(Basketball);
        aRona.addNSF(Hockey);

        //Create 2 NOCs. The first NOC has 3 national sports federations and the second NOC has the remaining 2 national sports federations.
        //football basketball baseball
        NOC fbb = new NOC("Football Basketball and Baseball NOC", new ArrayList<NSF>(Arrays.asList(Football, Basketball, Baseball)));
        //soccer hockey
        NOC sh = new NOC("Soccer and Hockey NOC", new ArrayList<NSF>(Arrays.asList(Soccer, Hockey)));

        //Create a ROC that contains the 2 NOCs
        ROC roc = new ROC("Regional Olympic Committee", new ArrayList<NOC>(Arrays.asList(fbb, sh)));

        //Display the players for the NSFs
        Football.listNSFPlayers();
        Basketball.listNSFPlayers();
        Soccer.listNSFPlayers();
        Baseball.listNSFPlayers();
        Hockey.listNSFPlayers();

        //For two players, display the NSFs they are in. Make sure at they are each registered for more than one NSF.
        aKyle.listPlayerNSFs();
        aLebr.listPlayerNSFs();

        //Display the total number of players registered with NSFs in each NOC, and in the ROC
        int fbbPlayerCount = fbb.countPlayersInNSFs();
        int shPlayerCount = sh.countPlayersInNSFs();
        int fbbNSFCount = fbb.countNSFs();
        int shNSFCount = sh.countNSFs();
        int rocPlayerCount = roc.countPlayersInNOCNSFs();
        int rocNSFCount = roc.countNSFs();

        //Display the total number of NSFs in each NOC and and in the ROC.
        System.out.println();
        System.out.printf("Total number of players in %s: %d %n", fbb.getName(), fbbPlayerCount);
        System.out.printf("Total number of players in %s: %d %n", sh.getName(), shPlayerCount);
        System.out.printf("Total number of players in %s: %d %n", roc.getName(), rocPlayerCount);
        System.out.println();
        System.out.printf("Total number of NSFs in %s: %d %n", fbb.getName(), fbbNSFCount);
        System.out.printf("Total number of NSFs in %s: %d %n", sh.getName(), shNSFCount);
        System.out.printf("Total number of NSFs in %s: %d %n", roc.getName(), rocNSFCount);
    }
}