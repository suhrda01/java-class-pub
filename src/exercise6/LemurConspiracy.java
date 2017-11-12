package exercise6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Class LemurConspiracy
 * @author yasiro01
 */
public class LemurConspiracy {
    private HashSet<Lemur> lemurSet = new HashSet();
    
    public LemurConspiracy(String filename) throws FileNotFoundException{
        File inputFile = new File(filename);
        Scanner lineContent = new Scanner(inputFile);
        while (lineContent.hasNextLine()) {
            String line = lineContent.nextLine();
            String[] lineSplit = line.split(",");
            if ("Lemur".equals(lineSplit[2])) {
                Lemur newLemur = new Lemur(lineSplit[0], Integer.parseInt(lineSplit[1]));
                lemurSet.add(newLemur);
            }
            
        }
    }
    
    public int size() {
        return lemurSet.size();
    }
    
    public Lemur getChief() {
        Lemur chief = new Lemur("test", 0);
        for (Lemur lemur : lemurSet) {
            if (lemur.getAge() > chief.getAge()) {
                chief = lemur;
            }
        }
        return chief;
    }
}
