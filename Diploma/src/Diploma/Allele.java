package Diploma;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Allele {

    private String fileName;
    private int i = 0;
    private String line = null;
    private Set<String> set = new LinkedHashSet<>();
    private Set<String> outputSet = new LinkedHashSet<>();
    private int totalSNP = 0;
    private double totalFreq;

    //Parsing filereader into LinkedHashSet

    public void process(FileReader fr, String oldFileName) throws IOException {
        BufferedReader br = new BufferedReader(fr);
        setLine(br.readLine());
        while (getLine() != null) {
            getSet().add(getLine());
            setLine(br.readLine());
        }
        fr.close();

        //Receiving filename from old file

        setFileName(oldFileName.replace(".txt", "_RESULTS.txt"));
    }

    public abstract void erase ();

    public abstract Set<String> processR();

    //Writing the result in file

    public void toFile() throws IOException {
        File file = new File(getFileName());
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        for (String s : getOutputSet()) {
            fw.write(s + "\n");
        }
        fw.close();
    }

    //Printing the set

    public void print() {
        for (String s : getOutputSet()) {
            System.out.println(s);
        }
    }

    public int getTotalSNP() {
        return totalSNP;
    }

    public void setTotalSNP(int totalSNP) {
        this.totalSNP = totalSNP;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public Set<String> getSet() {
        return set;
    }

    public double getTotalFreq() {
        return totalFreq;
    }

    public void setTotalFreq(double totalFreq) {
        this.totalFreq = totalFreq;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    public Set<String> getOutputSet() {
        return outputSet;
    }

    public void setOutputSet(Set<String> outputSet) {
        this.outputSet = outputSet;
    }
}