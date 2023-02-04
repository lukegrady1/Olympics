import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
public class NSF {
    @Getter @Setter
    protected String name;
    @Getter @Setter
    protected List<Player> players;

    public NSF(String name){
        this.name = name;
        this.players = new ArrayList<Player>();
    }

    public void listNSFPlayers(){
        System.out.println();
        System.out.printf("%s players: ", name);
        Boolean first = true;
        for(Player player : players) {
            if (first) {
                System.out.printf(" %s", player.getName());
                first = false;
            } else {
                System.out.printf(", %s", player.getName());
            }
        }
        System.out.println();
    }

    public void addPlayer(Player player){
        if(!players.contains(player)){
            players.add(player);
        }
        if(!player.getNSFs().contains(this)){
            player.addNSF(this);
        }
    }

    @Override
    public String toString(){
        return name;
    }
}
