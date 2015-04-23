package Diploma;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

public class RAllele extends Allele {

    private int tt = 0;
    private int ta = 0;
    private int ct = 0;
    private int ca = 0;
    private int totalSNP = 0;
    private Set<String> outputSet = new LinkedHashSet<>();
    private double ttFreq;
    private double taFreq;
    private double ctFreq;
    private double caFreq;
    private double totalFreq;

    //Main processing algorithm

    public Set<String> processR() {
        for (String s : getSet()) {
            if (s.contains("A/G\tTT")) {
                setTt(getTt() + 1);
            } else if (s.contains("A/G\tTA")) {
                setTa(getTa() + 1);
            } else if (s.contains("A/G\tCT")) {
                setCt(getCt() + 1);
            } else if (s.contains("A/G\tCA")) {
                setCa(getCa() + 1);
            }
            setI(getI() + 1);
        }
        setTotalSNP(getTt() + getTa() + getCt() + getCa());
        setTtFreq((double) getTt() / getI());
        setTaFreq((double) getTa() / getI());
        setCaFreq((double) getCa() / getI());
        setCtFreq((double) getCt() / getI());
        setTotalFreq((double) getTotalSNP() / getI());

        //Creating an output queue

        getOutputSet().add("Total number of A/G TT = " + getTt());
        getOutputSet().add("Total number of A/G TA = " + getTa());
        getOutputSet().add("Total number of A/G CT = " + getCt());
        getOutputSet().add("Total number of A/G CA = " + getCa());
        getOutputSet().add("Total SNP's in R allele = " + getTotalSNP());
        getOutputSet().add("Total strings of genetic code analyzed = " + getI());
        getOutputSet().add("Frequency of A/G TT total occurrence  = " + getTtFreq());
        getOutputSet().add("Frequency of A/G TA total occurrence  = " + getTaFreq());
        getOutputSet().add("Frequency of A/G CT total occurrence  = " + getCtFreq());
        getOutputSet().add("Frequency of A/G CA total occurrence  = " + getCaFreq());
        getOutputSet().add("Frequency of SNP's in R total occurrence  = " + getTotalFreq());
        return getOutputSet();
    }

    //Printing the queue

    public void print() {
        for (String s : getOutputSet()) {
            System.out.println(s);
        }
    }
    //Writing the result in file

    public void toFile() throws IOException {
        File file = new File(getFileName());
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        for (String s : getOutputSet()) {
            fw.write(s + "\n");
        }
        fw.close();
    }

    public void erase() {
        setI(0);
        setTotalSNP(0);
        setCt(0);
        setCa(0);
        setTa(0);
        setTt(0);
        setOutputSet(null);
        setSet(null);
        setCaFreq(0);
        setCtFreq(0);
        setTaFreq(0);
        setTtFreq(0);
        setTotalFreq(0);
    }

    public int getTt() {
        return tt;
    }

    public void setTt(int tt) {
        this.tt = tt;
    }

    public int getTa() {
        return ta;
    }

    public void setTa(int ta) {
        this.ta = ta;
    }

    public int getCt() {
        return ct;
    }

    public void setCt(int ct) {
        this.ct = ct;
    }

    public int getCa() {
        return ca;
    }

    public void setCa(int ca) {
        this.ca = ca;
    }

    public int getTotalSNP() {
        return totalSNP;
    }

    public void setTotalSNP(int totalSNP) {
        this.totalSNP = totalSNP;
    }

    public Set<String> getOutputSet() {
        return outputSet;
    }

    public void setOutputSet(Set<String> outputSet) {
        this.outputSet = outputSet;
    }

    public double getTtFreq() {
        return ttFreq;
    }

    public void setTtFreq(double ttFreq) {
        this.ttFreq = ttFreq;
    }

    public double getTaFreq() {
        return taFreq;
    }

    public void setTaFreq(double taFreq) {
        this.taFreq = taFreq;
    }

    public double getCtFreq() {
        return ctFreq;
    }

    public void setCtFreq(double ctFreq) {
        this.ctFreq = ctFreq;
    }

    public double getCaFreq() {
        return caFreq;
    }

    public void setCaFreq(double caFreq) {
        this.caFreq = caFreq;
    }

    public double getTotalFreq() {
        return totalFreq;
    }

    public void setTotalFreq(double totalFreq) {
        this.totalFreq = totalFreq;
    }
}


