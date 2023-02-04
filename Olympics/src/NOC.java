import lombok.Getter;
import lombok.Setter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class NOC {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private List<NSF> NSFs;

     NOC(String name, ArrayList<NSF> NSFs){
        this.name = name;
        this.NSFs = NSFs;
    }

     int countNSFs(){
        return NSFs.size();
    }
     int countPlayersInNSFs() {
         int count = 0;
         for(NSF nsf: NSFs) {
             count = count + nsf.getPlayers().size();
         }
         return count;
    }
}
