import java.util.List;

public class NOC {
    private String name;
    private List<NSF> NSFs;

     NOC(String name, List<NSF> NSFs){
        name = this.name;
        NSFs = this.NSFs;
    }
     String getName(){
        return name;
    }
     void setName(String newName){
        name = newName;
    }

    List<NSF> getNSFs() {
        return NSFs;
    }

     void setNSFs(List<NSF> newNSFs){
        NSFs = newNSFs;
    }
     int countNSFs(){
        return 0;
    }
     int countPlayersInNSFs(){
        return 0;
    }
}
