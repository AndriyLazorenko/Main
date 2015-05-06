package Diploma;

import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Master on 04-May-15.
 */
public class Both implements SearchMethod {

    //Getters & Setters for all the variables

    public Set<String> getOutputSet() {
        return outputSet;
    }

    public void setOutputSet(Set<String> outputSet) {
        this.outputSet = outputSet;
    }

    public double getTotalFreq() {
        return totalFreq;
    }

    public void setTotalFreq(double totalFreq) {
        this.totalFreq = totalFreq;
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

    public int getTtAfter() {
        return ttAfter;
    }

    public void setTtAfter(int ttAfter) {
        this.ttAfter = ttAfter;
    }

    public int getTaAfter() {
        return taAfter;
    }

    public void setTaAfter(int taAfter) {
        this.taAfter = taAfter;
    }

    public int getTcAfter() {
        return tcAfter;
    }

    public void setTcAfter(int tcAfter) {
        this.tcAfter = tcAfter;
    }

    public int getTgAfter() {
        return tgAfter;
    }

    public void setTgAfter(int tgAfter) {
        this.tgAfter = tgAfter;
    }

    public int getCtAfter() {
        return ctAfter;
    }

    public void setCtAfter(int ctAfter) {
        this.ctAfter = ctAfter;
    }

    public int getCaAfter() {
        return caAfter;
    }

    public void setCaAfter(int caAfter) {
        this.caAfter = caAfter;
    }

    public int getCgAfter() {
        return cgAfter;
    }

    public void setCgAfter(int cgAfter) {
        this.cgAfter = cgAfter;
    }

    public int getCcAfter() {
        return ccAfter;
    }

    public void setCcAfter(int ccAfter) {
        this.ccAfter = ccAfter;
    }

    public int getAaAfter() {
        return aaAfter;
    }

    public void setAaAfter(int aaAfter) {
        this.aaAfter = aaAfter;
    }

    public int getAtAfter() {
        return atAfter;
    }

    public void setAtAfter(int atAfter) {
        this.atAfter = atAfter;
    }

    public int getAcAfter() {
        return acAfter;
    }

    public void setAcAfter(int acAfter) {
        this.acAfter = acAfter;
    }

    public int getAgAfter() {
        return agAfter;
    }

    public void setAgAfter(int agAfter) {
        this.agAfter = agAfter;
    }

    public int getGaAfter() {
        return gaAfter;
    }

    public void setGaAfter(int gaAfter) {
        this.gaAfter = gaAfter;
    }

    public int getGgAfter() {
        return ggAfter;
    }

    public void setGgAfter(int ggAfter) {
        this.ggAfter = ggAfter;
    }

    public int getGcAfter() {
        return gcAfter;
    }

    public void setGcAfter(int gcAfter) {
        this.gcAfter = gcAfter;
    }

    public int getGtAfter() {
        return gtAfter;
    }

    public void setGtAfter(int gtAfter) {
        this.gtAfter = gtAfter;
    }

    public int getTtBefore() {
        return ttBefore;
    }

    public void setTtBefore(int ttBefore) {
        this.ttBefore = ttBefore;
    }

    public int getTaBefore() {
        return taBefore;
    }

    public void setTaBefore(int taBefore) {
        this.taBefore = taBefore;
    }

    public int getTcBefore() {
        return tcBefore;
    }

    public void setTcBefore(int tcBefore) {
        this.tcBefore = tcBefore;
    }

    public int getTgBefore() {
        return tgBefore;
    }

    public void setTgBefore(int tgBefore) {
        this.tgBefore = tgBefore;
    }

    public int getCtBefore() {
        return ctBefore;
    }

    public void setCtBefore(int ctBefore) {
        this.ctBefore = ctBefore;
    }

    public int getCaBefore() {
        return caBefore;
    }

    public void setCaBefore(int caBefore) {
        this.caBefore = caBefore;
    }

    public int getCgBefore() {
        return cgBefore;
    }

    public void setCgBefore(int cgBefore) {
        this.cgBefore = cgBefore;
    }

    public int getCcBefore() {
        return ccBefore;
    }

    public void setCcBefore(int ccBefore) {
        this.ccBefore = ccBefore;
    }

    public int getAaBefore() {
        return aaBefore;
    }

    public void setAaBefore(int aaBefore) {
        this.aaBefore = aaBefore;
    }

    public int getAtBefore() {
        return atBefore;
    }

    public void setAtBefore(int atBefore) {
        this.atBefore = atBefore;
    }

    public int getAcBefore() {
        return acBefore;
    }

    public void setAcBefore(int acBefore) {
        this.acBefore = acBefore;
    }

    public int getAgBefore() {
        return agBefore;
    }

    public void setAgBefore(int agBefore) {
        this.agBefore = agBefore;
    }

    public int getGaBefore() {
        return gaBefore;
    }

    public void setGaBefore(int gaBefore) {
        this.gaBefore = gaBefore;
    }

    public int getGgBefore() {
        return ggBefore;
    }

    public void setGgBefore(int ggBefore) {
        this.ggBefore = ggBefore;
    }

    public int getGcBefore() {
        return gcBefore;
    }

    public void setGcBefore(int gcBefore) {
        this.gcBefore = gcBefore;
    }

    public int getGtBefore() {
        return gtBefore;
    }

    public void setGtBefore(int gtBefore) {
        this.gtBefore = gtBefore;
    }

    public double getTtFreqAfter() {
        return ttFreqAfter;
    }

    public void setTtFreqAfter(double ttFreqAfter) {
        this.ttFreqAfter = ttFreqAfter;
    }

    public double getTaFreqAfter() {
        return taFreqAfter;
    }

    public void setTaFreqAfter(double taFreqAfter) {
        this.taFreqAfter = taFreqAfter;
    }

    public double getTcFreqAfter() {
        return tcFreqAfter;
    }

    public void setTcFreqAfter(double tcFreqAfter) {
        this.tcFreqAfter = tcFreqAfter;
    }

    public double getTgFreqAfter() {
        return tgFreqAfter;
    }

    public void setTgFreqAfter(double tgFreqAfter) {
        this.tgFreqAfter = tgFreqAfter;
    }

    public double getCtFreqAfter() {
        return ctFreqAfter;
    }

    public void setCtFreqAfter(double ctFreqAfter) {
        this.ctFreqAfter = ctFreqAfter;
    }

    public double getCaFreqAfter() {
        return caFreqAfter;
    }

    public void setCaFreqAfter(double caFreqAfter) {
        this.caFreqAfter = caFreqAfter;
    }

    public double getCcFreqAfter() {
        return ccFreqAfter;
    }

    public void setCcFreqAfter(double ccFreqAfter) {
        this.ccFreqAfter = ccFreqAfter;
    }

    public double getCgFreqAfter() {
        return cgFreqAfter;
    }

    public void setCgFreqAfter(double cgFreqAfter) {
        this.cgFreqAfter = cgFreqAfter;
    }

    public double getAaFreqAfter() {
        return aaFreqAfter;
    }

    public void setAaFreqAfter(double aaFreqAfter) {
        this.aaFreqAfter = aaFreqAfter;
    }

    public double getAcFreqAfter() {
        return acFreqAfter;
    }

    public void setAcFreqAfter(double acFreqAfter) {
        this.acFreqAfter = acFreqAfter;
    }

    public double getAgFreqAfter() {
        return agFreqAfter;
    }

    public void setAgFreqAfter(double agFreqAfter) {
        this.agFreqAfter = agFreqAfter;
    }

    public double getAtFreqAfter() {
        return atFreqAfter;
    }

    public void setAtFreqAfter(double atFreqAfter) {
        this.atFreqAfter = atFreqAfter;
    }

    public double getGaFreqAfter() {
        return gaFreqAfter;
    }

    public void setGaFreqAfter(double gaFreqAfter) {
        this.gaFreqAfter = gaFreqAfter;
    }

    public double getGcFreqAfter() {
        return gcFreqAfter;
    }

    public void setGcFreqAfter(double gcFreqAfter) {
        this.gcFreqAfter = gcFreqAfter;
    }

    public double getGgFreqAfter() {
        return ggFreqAfter;
    }

    public void setGgFreqAfter(double ggFreqAfter) {
        this.ggFreqAfter = ggFreqAfter;
    }

    public double getGtFreqAfter() {
        return gtFreqAfter;
    }

    public void setGtFreqAfter(double gtFreqAfter) {
        this.gtFreqAfter = gtFreqAfter;
    }

    public double getTtFreqBefore() {
        return ttFreqBefore;
    }

    public void setTtFreqBefore(double ttFreqBefore) {
        this.ttFreqBefore = ttFreqBefore;
    }

    public double getTaFreqBefore() {
        return taFreqBefore;
    }

    public void setTaFreqBefore(double taFreqBefore) {
        this.taFreqBefore = taFreqBefore;
    }

    public double getTcFreqBefore() {
        return tcFreqBefore;
    }

    public void setTcFreqBefore(double tcFreqBefore) {
        this.tcFreqBefore = tcFreqBefore;
    }

    public double getTgFreqBefore() {
        return tgFreqBefore;
    }

    public void setTgFreqBefore(double tgFreqBefore) {
        this.tgFreqBefore = tgFreqBefore;
    }

    public double getCtFreqBefore() {
        return ctFreqBefore;
    }

    public void setCtFreqBefore(double ctFreqBefore) {
        this.ctFreqBefore = ctFreqBefore;
    }

    public double getCaFreqBefore() {
        return caFreqBefore;
    }

    public void setCaFreqBefore(double caFreqBefore) {
        this.caFreqBefore = caFreqBefore;
    }

    public double getCcFreqBefore() {
        return ccFreqBefore;
    }

    public void setCcFreqBefore(double ccFreqBefore) {
        this.ccFreqBefore = ccFreqBefore;
    }

    public double getCgFreqBefore() {
        return cgFreqBefore;
    }

    public void setCgFreqBefore(double cgFreqBefore) {
        this.cgFreqBefore = cgFreqBefore;
    }

    public double getAaFreqBefore() {
        return aaFreqBefore;
    }

    public void setAaFreqBefore(double aaFreqBefore) {
        this.aaFreqBefore = aaFreqBefore;
    }

    public double getAcFreqBefore() {
        return acFreqBefore;
    }

    public void setAcFreqBefore(double acFreqBefore) {
        this.acFreqBefore = acFreqBefore;
    }

    public double getAgFreqBefore() {
        return agFreqBefore;
    }

    public void setAgFreqBefore(double agFreqBefore) {
        this.agFreqBefore = agFreqBefore;
    }

    public double getAtFreqBefore() {
        return atFreqBefore;
    }

    public void setAtFreqBefore(double atFreqBefore) {
        this.atFreqBefore = atFreqBefore;
    }

    public double getGaFreqBefore() {
        return gaFreqBefore;
    }

    public void setGaFreqBefore(double gaFreqBefore) {
        this.gaFreqBefore = gaFreqBefore;
    }

    public double getGcFreqBefore() {
        return gcFreqBefore;
    }

    public void setGcFreqBefore(double gcFreqBefore) {
        this.gcFreqBefore = gcFreqBefore;
    }

    public double getGgFreqBefore() {
        return ggFreqBefore;
    }

    public void setGgFreqBefore(double ggFreqBefore) {
        this.ggFreqBefore = ggFreqBefore;
    }

    public double getGtFreqBefore() {
        return gtFreqBefore;
    }

    public void setGtFreqBefore(double gtFreqBefore) {
        this.gtFreqBefore = gtFreqBefore;
    }

    //Declarations of phrases, used AFTER variation allele

    private int ttAfter = 0;
    private int taAfter = 0;
    private int tcAfter = 0;
    private int tgAfter = 0;
    private int ctAfter = 0;
    private int caAfter = 0;
    private int cgAfter = 0;
    private int ccAfter = 0;
    private int aaAfter = 0;
    private int atAfter = 0;
    private int acAfter = 0;
    private int agAfter = 0;
    private int gaAfter = 0;
    private int ggAfter = 0;
    private int gcAfter = 0;
    private int gtAfter = 0;

    //Declaration of phrases used BEFORE variation allele

    private int ttBefore = 0;
    private int taBefore = 0;
    private int tcBefore = 0;
    private int tgBefore = 0;
    private int ctBefore = 0;
    private int caBefore = 0;
    private int cgBefore = 0;
    private int ccBefore = 0;
    private int aaBefore = 0;
    private int atBefore = 0;
    private int acBefore = 0;
    private int agBefore = 0;
    private int gaBefore = 0;
    private int ggBefore = 0;
    private int gcBefore = 0;
    private int gtBefore = 0;

    //Declarations of frequencies of occurrence of phrases used AFTER variation Allele

    private double ttFreqAfter;
    private double taFreqAfter;
    private double tcFreqAfter;
    private double tgFreqAfter;
    private double ctFreqAfter;
    private double caFreqAfter;
    private double ccFreqAfter;
    private double cgFreqAfter;
    private double aaFreqAfter;
    private double acFreqAfter;
    private double agFreqAfter;
    private double atFreqAfter;
    private double gaFreqAfter;
    private double gcFreqAfter;
    private double ggFreqAfter;
    private double gtFreqAfter;

    //Declarations of frequencies of occurrence of phrases used BEFORE variation Allele

    private double ttFreqBefore;
    private double taFreqBefore;
    private double tcFreqBefore;
    private double tgFreqBefore;
    private double ctFreqBefore;
    private double caFreqBefore;
    private double ccFreqBefore;
    private double cgFreqBefore;
    private double aaFreqBefore;
    private double acFreqBefore;
    private double agFreqBefore;
    private double atFreqBefore;
    private double gaFreqBefore;
    private double gcFreqBefore;
    private double ggFreqBefore;
    private double gtFreqBefore;

    //Declarations of other variables

    private int i = 0;
    private int totalSNP = 0;
    private double totalFreq;
    private double totalFreqBefore;
    private Set<String> outputSet = new LinkedHashSet<>();
    private int totalSNPBefore;

    public int getTotalSNPBefore() {
        return totalSNPBefore;
    }

    public void setTotalSNPBefore(int totalSNPBefore) {
        this.totalSNPBefore = totalSNPBefore;
    }

    public double getTotalFreqBefore() {
        return totalFreqBefore;
    }

    public void setTotalFreqBefore(double totalFreqBefore) {
        this.totalFreqBefore = totalFreqBefore;
    }

    @Override
    public Set<String> compute(String variationAllele, Set<String> parsedFile) {

        //Before part

        for (String s : parsedFile) {
            if (s.contains("AA\t"+variationAllele)) {
                setAaBefore(getAaBefore()+1);
            } else if (s.contains("AC\t"+variationAllele)) {
                setAcBefore(getAcBefore() + 1);
            } else if (s.contains("AG\t"+variationAllele)) {
                setAgBefore(getAgBefore() + 1);
            } else if (s.contains("AT\t"+variationAllele)) {
                setAtBefore(getAtBefore() + 1);
            } else if (s.contains("CA\t"+variationAllele)) {
                setCaBefore(getCaBefore() + 1);
            } else if (s.contains("CC\t"+variationAllele)) {
                setCcBefore(getCcBefore() + 1);
            } else if (s.contains("CG\t"+variationAllele)) {
                setCgBefore(getCgBefore() + 1);
            } else if (s.contains("CT\t"+variationAllele)) {
                setCtBefore(getCtBefore() + 1);
            } else if (s.contains("GA\t"+variationAllele)) {
                setGaBefore(getGaBefore() + 1);
            } else if (s.contains("GC\t"+variationAllele)) {
                setGcBefore(getGcBefore() + 1);
            } else if (s.contains("GG\t"+variationAllele)) {
                setGgBefore(getGgBefore() + 1);
            } else if (s.contains("GT\t"+variationAllele)) {
                setGtBefore(getGtBefore() + 1);
            } else if (s.contains("TA\t"+variationAllele)) {
                setTaBefore(getTaBefore() + 1);
            } else if (s.contains("TC\t"+variationAllele)) {
                setTcBefore(getTcBefore() + 1);
            } else if (s.contains("TG\t"+variationAllele)) {
                setTgBefore(getTgBefore() + 1);
            } else if (s.contains("TT\t"+variationAllele)) {
                setTtBefore(getTtBefore() + 1);
            }
            setI(getI() + 1);
        }

        setAaFreqBefore((double)getAaBefore() / getI());
        setAcFreqBefore((double) getAcBefore() / getI());
        setAgFreqBefore((double) getAgBefore() / getI());
        setAtFreqBefore((double) getAtBefore() / getI());
        setCaFreqBefore((double) getCaBefore() / getI());
        setCcFreqBefore((double) getCcBefore() / getI());
        setCgFreqBefore((double) getCgBefore() / getI());
        setCtFreqBefore((double) getCtBefore() / getI());
        setGaFreqBefore((double) getGaBefore() / getI());
        setGcFreqBefore((double) getGcBefore() / getI());
        setGgFreqBefore((double) getGgBefore() / getI());
        setGtFreqBefore((double) getGtBefore() / getI());
        setTaFreqBefore((double) getTaBefore() / getI());
        setTcFreqBefore((double) getTcBefore() / getI());
        setTgFreqBefore((double) getTgBefore() / getI());
        setTtFreqBefore((double) getTtBefore() / getI());

        setTotalSNPBefore(getAaBefore() + getAgBefore() + getTaBefore() + getTgBefore());
        setTotalFreqBefore((double) getTotalSNP() / getI());

        //After part

        for (String s : parsedFile) {
            if (s.contains(variationAllele+"\tAA")) {
                setAaAfter(getAaAfter()+1);
            } else if (s.contains(variationAllele+"\tAC")) {
                setAcAfter(getAcAfter() + 1);
            } else if (s.contains(variationAllele+"\tAG")) {
                setAgAfter(getAgAfter() + 1);
            } else if (s.contains(variationAllele+"\tAT")) {
                setAtAfter(getAtAfter() + 1);
            } else if (s.contains(variationAllele+"\tCA")) {
                setCaAfter(getCaAfter() + 1);
            } else if (s.contains(variationAllele+"\tCC")) {
                setCcAfter(getCcAfter() + 1);
            } else if (s.contains(variationAllele+"\tCG")) {
                setCgAfter(getCgAfter() + 1);
            } else if (s.contains(variationAllele+"\tCT")) {
                setCtAfter(getCtAfter() + 1);
            } else if (s.contains(variationAllele+"\tGA")) {
                setGaAfter(getGaAfter() + 1);
            } else if (s.contains(variationAllele+"\tGC")) {
                setGcAfter(getGcAfter() + 1);
            } else if (s.contains(variationAllele+"\tGG")) {
                setGgAfter(getGgAfter() + 1);
            } else if (s.contains(variationAllele+"\tGT")) {
                setGtAfter(getGtAfter() + 1);
            } else if (s.contains(variationAllele+"\tTA")) {
                setTaAfter(getTaAfter() + 1);
            } else if (s.contains(variationAllele+"\tTC")) {
                setTcAfter(getTcAfter() + 1);
            } else if (s.contains(variationAllele+"\tTG")) {
                setTgAfter(getTgAfter() + 1);
            } else if (s.contains(variationAllele+"\tTT")) {
                setTtAfter(getTtAfter() + 1);
            }
            setI(getI() + 1);
        }

        setAaFreqAfter((double) getAaAfter() / getI());
        setAcFreqAfter((double) getAcAfter() / getI());
        setAgFreqAfter((double) getAgAfter() / getI());
        setAtFreqAfter((double) getAtAfter() / getI());
        setCaFreqAfter((double) getCaAfter() / getI());
        setCcFreqAfter((double) getCcAfter() / getI());
        setCgFreqAfter((double) getCgAfter() / getI());
        setCtFreqAfter((double) getCtAfter() / getI());
        setGaFreqAfter((double) getGaAfter() / getI());
        setGcFreqAfter((double) getGcAfter() / getI());
        setGgFreqAfter((double) getGgAfter() / getI());
        setGtFreqAfter((double) getGtAfter() / getI());
        setTaFreqAfter((double) getTaAfter() / getI());
        setTcFreqAfter((double) getTcAfter() / getI());
        setTgFreqAfter((double) getTgAfter() / getI());
        setTtFreqAfter((double) getTtAfter() / getI());

        setTotalSNP(getTtAfter() + getTaAfter() + getCtAfter() + getCaAfter());
        setTotalFreq((double) getTotalSNP() / getI());

        //Creating an output set

        getOutputSet().add("Total number of AA phrases After "+variationAllele+" = " + getAaAfter());
        getOutputSet().add("Total number of AC phrases After "+variationAllele+" = " + getAcAfter());
        getOutputSet().add("Total number of AG phrases After "+variationAllele+" = " + getAgAfter());
        getOutputSet().add("Total number of AT phrases After "+variationAllele+" = " + getAtAfter());
        getOutputSet().add("Total number of CA phrases After "+variationAllele+" = " + getCaAfter());
        getOutputSet().add("Total number of CC phrases After "+variationAllele+" = " + getCcAfter());
        getOutputSet().add("Total number of CG phrases After "+variationAllele+" = " + getCgAfter());
        getOutputSet().add("Total number of CT phrases After "+variationAllele+" = " + getCtAfter());
        getOutputSet().add("Total number of GA phrases After "+variationAllele+" = " + getGaAfter());
        getOutputSet().add("Total number of GC phrases After "+variationAllele+" = " + getGcAfter());
        getOutputSet().add("Total number of GG phrases After "+variationAllele+" = " + getGgAfter());
        getOutputSet().add("Total number of GT phrases After "+variationAllele+" = " + getGtAfter());
        getOutputSet().add("Total number of TA phrases After "+variationAllele+" = " + getTaAfter());
        getOutputSet().add("Total number of TC phrases After "+variationAllele+" = " + getTcAfter());
        getOutputSet().add("Total number of TG phrases After "+variationAllele+" = " + getTgAfter());
        getOutputSet().add("Total number of TT phrases After "+variationAllele+" = " + getTtAfter());


        getOutputSet().add("Frequency of AA phrase total occurrence After "+variationAllele+" = " + getAaFreqAfter());
        getOutputSet().add("Frequency of AC phrase total occurrence After "+variationAllele+" = " + getAcFreqAfter());
        getOutputSet().add("Frequency of AG phrase total occurrence After "+variationAllele+" = " + getAgFreqAfter());
        getOutputSet().add("Frequency of AT phrase total occurrence After "+variationAllele+" = " + getAtFreqAfter());
        getOutputSet().add("Frequency of CA phrase total occurrence After "+variationAllele+" = " + getCaFreqAfter());
        getOutputSet().add("Frequency of CC phrase total occurrence After "+variationAllele+" = " + getCcFreqAfter());
        getOutputSet().add("Frequency of CG phrase total occurrence After "+variationAllele+" = " + getCgFreqAfter());
        getOutputSet().add("Frequency of CT phrase total occurrence After "+variationAllele+" = " + getCtFreqAfter());
        getOutputSet().add("Frequency of GA phrase total occurrence After "+variationAllele+" = " + getGaFreqAfter());
        getOutputSet().add("Frequency of GC phrase total occurrence After "+variationAllele+" = " + getGcFreqAfter());
        getOutputSet().add("Frequency of GG phrase total occurrence After "+variationAllele+" = " + getGgFreqAfter());
        getOutputSet().add("Frequency of GT phrase total occurrence After "+variationAllele+" = " + getGtFreqAfter());
        getOutputSet().add("Frequency of TA phrase total occurrence After "+variationAllele+" = " + getTaFreqAfter());
        getOutputSet().add("Frequency of TC phrase total occurrence After "+variationAllele+" = " + getTcFreqAfter());
        getOutputSet().add("Frequency of TG phrase total occurrence After "+variationAllele+" = " + getTgFreqAfter());
        getOutputSet().add("Frequency of TT phrase total occurrence After "+variationAllele+" = " + getTtFreqAfter());

        getOutputSet().add("Total TT,TA,CT,CA After "+variationAllele+" = " + getTotalSNP());
        getOutputSet().add("Frequency of TT,TA,CT,CA After "+variationAllele+" = " + getTotalFreq());

        getOutputSet().add("Total number of AA phrases before "+variationAllele+" = " + getAaBefore());
        getOutputSet().add("Total number of AC phrases before "+variationAllele+" = " + getAcBefore());
        getOutputSet().add("Total number of AG phrases before "+variationAllele+" = " + getAgBefore());
        getOutputSet().add("Total number of AT phrases before "+variationAllele+" = " + getAtBefore());
        getOutputSet().add("Total number of CA phrases before "+variationAllele+" = " + getCaBefore());
        getOutputSet().add("Total number of CC phrases before "+variationAllele+" = " + getCcBefore());
        getOutputSet().add("Total number of CG phrases before "+variationAllele+" = " + getCgBefore());
        getOutputSet().add("Total number of CT phrases before "+variationAllele+" = " + getCtBefore());
        getOutputSet().add("Total number of GA phrases before "+variationAllele+" = " + getGaBefore());
        getOutputSet().add("Total number of GC phrases before "+variationAllele+" = " + getGcBefore());
        getOutputSet().add("Total number of GG phrases before "+variationAllele+" = " + getGgBefore());
        getOutputSet().add("Total number of GT phrases before "+variationAllele+" = " + getGtBefore());
        getOutputSet().add("Total number of TA phrases before "+variationAllele+" = " + getTaBefore());
        getOutputSet().add("Total number of TC phrases before "+variationAllele+" = " + getTcBefore());
        getOutputSet().add("Total number of TG phrases before "+variationAllele+" = " + getTgBefore());
        getOutputSet().add("Total number of TT phrases before "+variationAllele+" = " + getTtBefore());

        getOutputSet().add("Frequency of AA phrase total occurrence before "+variationAllele+" = " + getAaFreqBefore());
        getOutputSet().add("Frequency of AC phrase total occurrence before "+variationAllele+" = " + getAcFreqBefore());
        getOutputSet().add("Frequency of AG phrase total occurrence before "+variationAllele+" = " + getAgFreqBefore());
        getOutputSet().add("Frequency of AT phrase total occurrence before "+variationAllele+" = " + getAtFreqBefore());
        getOutputSet().add("Frequency of CA phrase total occurrence before "+variationAllele+" = " + getCaFreqBefore());
        getOutputSet().add("Frequency of CC phrase total occurrence before "+variationAllele+" = " + getCcFreqBefore());
        getOutputSet().add("Frequency of CG phrase total occurrence before "+variationAllele+" = " + getCgFreqBefore());
        getOutputSet().add("Frequency of CT phrase total occurrence before "+variationAllele+" = " + getCtFreqBefore());
        getOutputSet().add("Frequency of GA phrase total occurrence before "+variationAllele+" = " + getGaFreqBefore());
        getOutputSet().add("Frequency of GC phrase total occurrence before "+variationAllele+" = " + getGcFreqBefore());
        getOutputSet().add("Frequency of GG phrase total occurrence before "+variationAllele+" = " + getGgFreqBefore());
        getOutputSet().add("Frequency of GT phrase total occurrence before "+variationAllele+" = " + getGtFreqBefore());
        getOutputSet().add("Frequency of TA phrase total occurrence before "+variationAllele+" = " + getTaFreqBefore());
        getOutputSet().add("Frequency of TC phrase total occurrence before "+variationAllele+" = " + getTcFreqBefore());
        getOutputSet().add("Frequency of TG phrase total occurrence before "+variationAllele+" = " + getTgFreqBefore());
        getOutputSet().add("Frequency of TT phrase total occurrence before "+variationAllele+" = " + getTtFreqBefore());

        getOutputSet().add("Total AA,AG,TA,TG before "+variationAllele+" = " + getTotalSNPBefore());
        getOutputSet().add("Frequency of AA,AG,TA,TG before "+variationAllele+" = " + getTotalFreqBefore());

        getOutputSet().add("Total strings of genetic code analysed = " + getI());

        return getOutputSet();
    }

    @Override
    public void erase() {
        setAaAfter(0);
        setAcAfter(0);
        setAgAfter(0);
        setAtAfter(0);
        setCaAfter(0);
        setCcAfter(0);
        setCgAfter(0);
        setCtAfter(0);
        setGaAfter(0);
        setGcAfter(0);
        setGgAfter(0);
        setGtAfter(0);
        setTaAfter(0);
        setTcAfter(0);
        setTgAfter(0);
        setTtAfter(0);

        setAaBefore(0);
        setAcBefore(0);
        setAgBefore(0);
        setAtBefore(0);
        setCaBefore(0);
        setCcBefore(0);
        setCgBefore(0);
        setCtBefore(0);
        setGaBefore(0);
        setGcBefore(0);
        setGgBefore(0);
        setGtBefore(0);
        setTaBefore(0);
        setTcBefore(0);
        setTgBefore(0);
        setTtBefore(0);

        setAaFreqAfter(0);
        setAcFreqAfter(0);
        setAgFreqAfter(0);
        setAtFreqAfter(0);
        setCaFreqAfter(0);
        setCcFreqAfter(0);
        setCgFreqAfter(0);
        setCtFreqAfter(0);
        setGaFreqAfter(0);
        setGcFreqAfter(0);
        setGgFreqAfter(0);
        setGtFreqAfter(0);
        setTaFreqAfter(0);
        setTcFreqAfter(0);
        setTgFreqAfter(0);
        setTtFreqAfter(0);

        setAaFreqBefore(0);
        setAcFreqBefore(0);
        setAgFreqBefore(0);
        setAtFreqBefore(0);
        setCaFreqBefore(0);
        setCcFreqBefore(0);
        setCgFreqBefore(0);
        setCtFreqBefore(0);
        setGaFreqBefore(0);
        setGcFreqBefore(0);
        setGgFreqBefore(0);
        setGtFreqBefore(0);
        setTaFreqBefore(0);
        setTcFreqBefore(0);
        setTgFreqBefore(0);
        setTtFreqBefore(0);

        setI(0);
        setTotalFreq(0);
        setTotalSNP(0);
        setOutputSet(new LinkedHashSet<String>());

    }
}
