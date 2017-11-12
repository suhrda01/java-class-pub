package exercise6;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Class CrowMurder
 * @author yasiro01
 */
public class CrowMurder {
    private ArrayList<Crow> crowList = new ArrayList();
    
    public CrowMurder(String filename) throws FileNotFoundException{
        File inputFile = new File(filename);
        Scanner lineContent = new Scanner(inputFile);
        while (lineContent.hasNextLine()) {
            String line = lineContent.nextLine();
            String[] lineSplit = line.split(",");
            if ("Crow".equals(lineSplit[2])) {
                Crow newCrow = new Crow(lineSplit[0], Integer.parseInt(lineSplit[1]));
                crowList.add(newCrow);
            }
            
        }
    }
    
    public int size() {
        return crowList.size();
    }
    
    public Crow getChief() {
        Crow chief = new Crow("test", 0);
        for (Crow crow : crowList) {
            if (crow.getAge() > chief.getAge()) {
                chief = crow;
            }
        }
        return chief;
    }
}
