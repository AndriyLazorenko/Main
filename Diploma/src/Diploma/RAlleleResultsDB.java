package Diploma;


import java.io.*;
import java.util.LinkedHashSet;

/**
 * Created by Lazorenko on 22.04.2015.
 */
public class RAlleleResultsDB extends RAllele {

    public void regularize(){
        getOutputSet().add("Total number of A/G TT = " + getTt());
        getOutputSet().add("Total number of A/G TA = " + getTa());
        getOutputSet().add("Total number of A/G CT = " + getCt());
        getOutputSet().add("Total number of A/G CA = " + getCa());
        getOutputSet().add("Total SNP's in R allele = " + getTotalSNP());
        getOutputSet().add("Total strings of genetic code analysed = " + getI());

        setTtFreq((double) getTt() / getI());
        setTaFreq((double) getTa() / getI());
        setCaFreq((double) getCa() / getI());
        setCtFreq((double) getCt() / getI());
        setTotalFreq((double) getTotalSNP() / getI());

        getOutputSet().add("Frequency of A/G TT total occurrence  = " + getTtFreq());
        getOutputSet().add("Frequency of A/G TA total occurrence  = " + getTaFreq());
        getOutputSet().add("Frequency of A/G CT total occurrence  = " + getCtFreq());
        getOutputSet().add("Frequency of A/G CA total occurrence  = " + getCaFreq());
        getOutputSet().add("Frequency of SNP's in R total occurrence  = " + getTotalFreq());
    }

    public void toFile(String fileName) throws IOException {

        setFileName(fileName);
        setFileName(getFileName().substring(0,getFileName().lastIndexOf("\\"))+"\\R_Allele_Results_Database.txt");
        File file = new File(getFileName());
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        for (String s : getOutputSet()) {
            fw.write(s + "\n");
        }
        fw.close();
    }
    @Override
    public void erase() {
        System.out.println("Do you want to erase all results? Y/N");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eraseChoice;
        try {
            eraseChoice = br.readLine();
            if (eraseChoice.equals("Y")||eraseChoice.equals("y")){
                setI(0);
                setTotalSNP(0);
                setCt(0);
                setCa(0);
                setTa(0);
                setTt(0);
                setOutputSet(new LinkedHashSet<String>());
                setSet(new LinkedHashSet<String>());
                setCaFreq(0);
                setCtFreq(0);
                setTaFreq(0);
                setTtFreq(0);
                setTotalFreq(0);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void clearSet(){
        setOutputSet(new LinkedHashSet<String>());
    }
}
