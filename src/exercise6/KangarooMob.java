package exercise6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Class KangarooMob
 * @author yasiro01
 */
public class KangarooMob {
    private HashSet<Kangaroo> kangarooSet = new HashSet();
    
    public KangarooMob(String filename) throws FileNotFoundException{
        File inputFile = new File(filename);
        Scanner lineContent = new Scanner(inputFile);
        while (lineContent.hasNextLine()) {
            String line = lineContent.nextLine();
            String[] lineSplit = line.split(",");
            if ("Kangaroo".equals(lineSplit[2])) {
                Kangaroo newKangaroo = new Kangaroo(lineSplit[0], Integer.parseInt(lineSplit[1]));
                kangarooSet.add(newKangaroo);
            }
            
        }
    }
    
    public int size() {
        return kangarooSet.size();
    }
    
    public Kangaroo getChief() {
        Kangaroo chief = new Kangaroo("test", 0);
        for (Kangaroo kangaroo : kangarooSet) {
            if (kangaroo.getAge() > chief.getAge()) {
                chief = kangaroo;
            }
        }
        return chief;
    }
}
