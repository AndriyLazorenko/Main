package Diploma;

import java.util.Set;

/**
 * Created by Master on 04-May-15.
 */
public class After extends Both implements SearchMethod {

    @Override
    public Set<String> compute(String variationAllele, Set<String> parsedFile) {
        for (String s : parsedFile) {
            if (s.contains(variationAllele+"\tAA")) {
                setAaAfter(getAaAfter() + 1);
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
        getOutputSet().add("Total strings of genetic code analysed = " + getI());

        return getOutputSet();
    }

}
