package Diploma;

import java.util.Set;

/**
 * Created by Master on 04-May-15.
 */
public class Before extends Both implements SearchMethod {

    @Override
    public Set<String> compute(String variationAllele, Set<String> parsedFile) {
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

        setTotalSNP(getAaBefore() + getAgBefore() + getTaBefore() + getTgBefore());
        setTotalFreq((double) getTotalSNP() / getI());

        //Creating an output set

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

        getOutputSet().add("Total AA,AG,TA,TG before "+variationAllele+" = " + getTotalSNP());
        getOutputSet().add("Frequency of AA,AG,TA,TG before "+variationAllele+" = " + getTotalFreq());
        getOutputSet().add("Total strings of genetic code analysed = " + getI());

        return getOutputSet();
    }

}
