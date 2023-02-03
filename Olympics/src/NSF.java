import java.util.List;
public class NSF {
    protected String name;
    protected List<Player> players;

    public NSF(String name){
        name = this.name;

    }

    public String getName(){
        return name;
    }
    public void setName(String newName){
        name = newName;
    }
    public List<Player> getPlayers(){
        return players;
    }
    public void setPlayers(List<Player> newPlayers){
        players = newPlayers;
    }

    public String toString(){
        return "Hello";
    }

    public void listNSFPlayers(){

    }
    public void addPlayer(Player player){

    }
}
