package Diploma;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RAllele extends Allele {

    private int tt = 0;
    private int ta = 0;
    private int ct = 0;
    private int ca = 0;
    private int totalSNP=0;
    private Set<String> outputSet = new LinkedHashSet<>();
    private double ttFreq;
    private double taFreq;
    private double ctFreq;
    private double caFreq;
    private double totalFreq;
    private Set<String> aggegatedResults = new LinkedHashSet<>();

    //Main processing algorithm

    public Set<String> processR () {
        for (String s : getSet()) {
            if (s.contains("A/G\tTT")) {
                tt++;
            } else if (s.contains("A/G\tTA")) {
                ta++;
            } else if (s.contains("A/G\tCT")) {
                ct++;
            } else if (s.contains("A/G\tCA")) {
                ca++;
            }
            setI(getI() + 1);
        }
        totalSNP = tt + ta + ct + ca;
        ttFreq = (double) tt/getI();
        taFreq = (double) ta/getI();
        caFreq = (double) ca/getI();
        ctFreq = (double) ct/getI();
        totalFreq = (double) totalSNP/getI();

        //Creating an output queue

        outputSet.add("Total number of A/G TT = " + tt);
        outputSet.add("Total number of A/G TA = " + ta);
        outputSet.add("Total number of A/G CT = " + ct);
        outputSet.add("Total number of A/G CA = " + ca);
        outputSet.add("Total SNP's in R allele = " + totalSNP);
        outputSet.add("Total strings of genetic code analyzed = " + getI());
        outputSet.add("Frequency of A/G TT total occurrence  = " + ttFreq);
        outputSet.add("Frequency of A/G TA total occurrence  = " + taFreq);
        outputSet.add("Frequency of A/G CT total occurrence  = " + ctFreq);
        outputSet.add("Frequency of A/G CA total occurrence  = " + caFreq);
        outputSet.add("Frequency of SNP's in R total occurrence  = " + totalFreq);
        return outputSet;
    }

    //Printing the queue

    public void print () {
        for (String s : outputSet) {
            System.out.println(s);
        }
    }
        //Writing the result in file

    public void toFile() throws IOException {
        File file = new File(getFileName());
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        for (String s:outputSet) {
            fw.write(s+"\n");
        }
        fw.close();
    }

//    public void resultsAggregator() {
//        Iterator iter =outputSet.iterator();
//        while (iter.hasNext()){
//            String s = iter.toString();
//            iter.next();
//        }
//
//    }
}
