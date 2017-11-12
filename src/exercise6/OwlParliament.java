package exercise6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Class OwlParliament
 * @author yasiro01
 */
public class OwlParliament {
    private HashSet<Owl> owlSet = new HashSet();
    
    public OwlParliament(String filename) throws FileNotFoundException{
        File inputFile = new File(filename);
        Scanner lineContent = new Scanner(inputFile);
        while (lineContent.hasNextLine()) {
            String line = lineContent.nextLine();
            String[] lineSplit = line.split(",");
            if ("Owl".equals(lineSplit[2])) {
                Owl newOwl = new Owl(lineSplit[0], Integer.parseInt(lineSplit[1]));
                owlSet.add(newOwl);
            }
            
        }
    }
    
    public int size() {
        return owlSet.size();
    }
    
    public Owl getChief() {
        Owl chief = new Owl("test", 0);
        for (Owl owl : owlSet) {
            if (owl.getAge() > chief.getAge()) {
                chief = owl;
            }
        }
        return chief;
    }
}
