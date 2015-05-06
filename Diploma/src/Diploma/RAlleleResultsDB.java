package Diploma;


import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Lazorenko on 22.04.2015.
 */
public class RAlleleResultsDB extends ResultsDB {

    public RAlleleResultsDB() {
        parsingDBBehaviour = new ParseAfter();
    }
    
}
