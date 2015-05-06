package Diploma;

import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Master on 04-May-15.
 */
public abstract class ResultsDB {

    ParsingDBBehaviour parsingDBBehaviour;
    Set<String> outputSet = new LinkedHashSet<>();

    public Set<String> getOutputSet() {
        return outputSet;
    }

    public void setOutputSet(Set<String> outputSet) {
        this.outputSet = outputSet;
    }

    private String fileName;

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
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

    //Refactor erase method

    public void erase() {
        System.out.println("Do you want to erase all results? Y/N");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String eraseChoice;
        try {
            eraseChoice = br.readLine();
            if (eraseChoice.equals("Y")||eraseChoice.equals("y")){
                setOutputSet(new LinkedHashSet<String>());
                parsingDBBehaviour.erase();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void print() {
        for (String s : getOutputSet()) {
            System.out.println(s);
        }
    }

    public void clearSet(){
        setOutputSet(new LinkedHashSet<String>());
    }

}
