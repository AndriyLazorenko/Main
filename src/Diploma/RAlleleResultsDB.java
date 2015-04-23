package Diploma;


import java.io.*;

/**
 * Created by Lazorenko on 22.04.2015.
 */
public class RAlleleResultsDB extends RAllele {

    @Override
    public void toFile() throws IOException {

        //Строчка кода ниже не работает. Понять почему.

        setFileName(getFileName().replace("\\\\*.txt","\\\\R_Allele_Results_Database.txt"));
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
        String eraseChoice = null;
        try {
            eraseChoice = br.readLine();
            if (eraseChoice.equals("Y")||eraseChoice.equals("y")){
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
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
