package Diploma;

/**
 * Created by Master on 27-Apr-15.
 */
public class VariousTests {
    public static void main(String[] args) {
        String variationAllele = "ablabla";
        int AaAfter = 56;
//        String fileName = "G:\\GoogleDrive\\Genetics\\Diploma\\R\\R_0.05-0.5_2315015\\R_0.05-0.07_260139.txt";
//        fileName=fileName.substring(0,fileName.lastIndexOf("\\"))+"\\R_Allele_Results_Database.txt";
//        System.out.println(fileName);
        String s = "Total number of AA phrases After "+variationAllele+" = " + AaAfter;
        System.out.println(Integer.parseInt(s.substring(s.lastIndexOf(" ")+1)));
    }
}
