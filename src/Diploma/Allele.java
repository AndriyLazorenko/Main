package Diploma;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

public abstract class Allele {

    private String fileName;
    private int i = 0;
    private String line = null;
    private Set <String> set = new LinkedHashSet<>();

    //Counting overall number of strings in assigned queue

    public void process (FileReader fr, String oldFileName) throws IOException {
        BufferedReader br = new BufferedReader(fr);
        setLine(br.readLine());
        while (getLine()!=null) {
            getSet().add(getLine());
            setLine(br.readLine());
        }

        //Receiving filename from old file

        setFileName(oldFileName.replace(".txt","_RESULTS.txt"));
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

    public void setSet(Set<String> set) {
        this.set = set;
    }
}
