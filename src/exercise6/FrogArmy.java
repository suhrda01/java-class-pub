package exercise6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class FrogArmy
 * @author yasiro01
 */
public class FrogArmy {
    private ArrayList<Frog> frogList = new ArrayList();
    
    public FrogArmy(String filename) throws FileNotFoundException{
        File inputFile = new File(filename);
        Scanner lineContent = new Scanner(inputFile);
        while (lineContent.hasNextLine()) {
            String line = lineContent.nextLine();
            String[] lineSplit = line.split(",");
            if ("Frog".equals(lineSplit[2])) {
                Frog newFrog = new Frog(lineSplit[0], Integer.parseInt(lineSplit[1]));
                frogList.add(newFrog);
            }
            
        }
    }
    
    public int size() {
        return frogList.size();
    }
    
    public Frog getChief() {
        Frog chief = new Frog("test", 0);
        for (Frog frog : frogList) {
            if (frog.getAge() > chief.getAge()) {
                chief = frog;
            }
        }
        return chief;
    }
}
