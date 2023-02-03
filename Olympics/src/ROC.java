import java.util.List;
public class ROC {

    private String name;
    private List<NOC> NOCs;

    private ROC(String name, List<NOC> NOCs){
        name = this.name;
        NOCs = this.NOCs;
    }
     String getName(){
        return name;
    }
     void setName(String newName){
        name = newName;

    }
     List<NOC> getNOCs(){
        return NOCs;
    }
     void setNOCs(List<NOC> newNOCs){
        NOCs = newNOCs;
    }
     int countNSFs(){
        return 0;
    }
     int countPlayersInNOCNSFs(){
        return 0;
    }
}