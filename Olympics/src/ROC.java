import lombok.Getter;
import lombok.Setter;

import java.util.List;
public class ROC {

    @Getter @Setter
    private String name;
    @Getter @Setter
    private List<NOC> NOCs;

    ROC(String name, List<NOC> NOCs){
        this.name = name;
        this.NOCs = NOCs;
    }

     int countNSFs(){
        int count = 0;
        for (NOC noc : NOCs) {
    count = count + noc.countNSFs();
         }
         return count;
    }
     int countPlayersInNOCNSFs(){
        int count = 0;
        for(NOC noc : NOCs){
            count = count + noc.countPlayersInNSFs();
        }
        return count;
    }
}