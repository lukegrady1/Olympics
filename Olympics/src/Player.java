import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

public class Player {
    @Getter @Setter
    private String name;
    @Getter @Setter
    private List<NSF> NSFs;


    public Player(String name){
        this.name = name;
        this.NSFs = new ArrayList<NSF>();
    }

    public void listPlayerNSFs() {
        System.out.println();
        System.out.printf("%s:", name);
        Boolean first = true;
        for (NSF nsf : NSFs) {
            if (first) {
                System.out.printf(" %s", nsf.getName());
                first = false;
            } else {
                System.out.printf(", %s", nsf.getName());
            }
        }
        System.out.println();
    }

    public void addNSF(NSF nsf){
        if(!NSFs.contains(nsf)){
            NSFs.add(nsf);
        }
        if(!nsf.getPlayers().contains(this)){
            nsf.addPlayer(this);
        }
    }
    @Override
    public String toString(){
        return name;
    }
}
