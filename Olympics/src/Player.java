import java.util.List;

public class Player {
    private String name;

    private List<NSF> NSFs;


    public Player(String name){
        name = this.name;
    }
    public String getName(){
        return name;
    }

    public void setName(String newName){
        name = newName;
    }
    public List<NSF> getNSFs(){
        return NSFs;
    }

    public void setNSFs(List<NSF> newNSFs){
        NSFs = newNSFs;
    }

    public String toString(){
        return"hello";

    }

    public void listPlayerNSFs(){

    }

    public void addNSF(NSF nsf){

    }
}
