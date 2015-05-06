package Diploma;

import java.util.Set;

/**
 * Created by Master on 05-May-15.
 */
public class ParseAfter extends Both implements ParsingDBBehaviour {

    @Override
    public void addToDB(Set<String> alleleProcessingResult) {
        for (String s:alleleProcessingResult){

            if (s.contains("number of AA")) {
                setAaAfter(getAaAfter() + Integer.parseInt(s.substring(s.lastIndexOf(" ")+1)));
            } else if (s.contains("number of AC")) {
                setAcAfter(getAcAfter() + Integer.parseInt(s.substring(s.lastIndexOf(" ")+1)));
            } else if (s.contains("number of AG")) {
                setAgAfter(getAgAfter() + Integer.parseInt(s.substring(s.lastIndexOf(" ")+1)));
            } else if (s.contains("number of AT")) {
                setAtAfter(getAtAfter() + Integer.parseInt(s.substring(s.lastIndexOf(" ")+1)));
            } else if (s.contains("number of CA")) {
                setCaAfter(getCaAfter() + Integer.parseInt(s.substring(s.lastIndexOf(" ")+1)));
            } else if (s.contains("number of CC")) {
                setCcAfter(getCcAfter() + Integer.parseInt(s.substring(s.lastIndexOf(" ")+1)));
            } else if (s.contains("number of CG")) {
                setCgAfter(getCgAfter() + Integer.parseInt(s.substring(s.lastIndexOf(" ")+1)));
            } else if (s.contains("number of CT")) {
                setCtAfter(getCtAfter() + Integer.parseInt(s.substring(s.lastIndexOf(" ")+1)));
            } else if (s.contains("number of GA")) {
                setGaAfter(getGaAfter() + Integer.parseInt(s.substring(s.lastIndexOf(" ")+1)));
            } else if (s.contains("number of GC")) {
                setGcAfter(getGcAfter() + Integer.parseInt(s.substring(s.lastIndexOf(" ")+1)));
            } else if (s.contains("number of GG")) {
                setGgAfter(getGgAfter() + Integer.parseInt(s.substring(s.lastIndexOf(" ")+1)));
            } else if (s.contains("number of GT")) {
                setGtAfter(getGtAfter() + Integer.parseInt(s.substring(s.lastIndexOf(" ")+1)));
            } else if (s.contains("number of TA")) {
                setTaAfter(getTaAfter() + Integer.parseInt(s.substring(s.lastIndexOf(" ")+1)));
            } else if (s.contains("number of TC")) {
                setTcAfter(getTcAfter() + Integer.parseInt(s.substring(s.lastIndexOf(" ")+1)));
            } else if (s.contains("number of TG")) {
                setTgAfter(getTgAfter() + Integer.parseInt(s.substring(s.lastIndexOf(" ")+1)));
            } else if (s.contains("number of TT")) {
                setTtAfter(getTtAfter() + Integer.parseInt(s.substring(s.lastIndexOf(" ")+1)));
            } else if (s.contains("Total strings of genetic code")) {
                setI(getI() + Integer.parseInt(s.substring(s.lastIndexOf(" ")+1)));
            }
        }
    }

    @Override
    public void compute() {

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

    }

    @Override
    public Set<String> creatingOutputSet(String variationAllele) {

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
