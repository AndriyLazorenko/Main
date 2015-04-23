package Diploma;


import java.io.*;
import java.util.Set;
import java.util.TreeSet;
public class Interface {
    FileInput fileInput = new FileInput();
    AlleleValidation av = new AlleleValidation();
//    AAllele a = new AAllele();
//    BAllele b = new BAllele();
//    CAllele c = new CAllele();
//    DAllele d = new DAllele();
//    GAllele g = new GAllele();
//    GermlineAllele germ = new GermlineAllele();
//    HAllele h = new HAllele();
//    KAllele k = new KAllele();
//    MAllele m = new MAllele();
//    NAllele n = new NAllele();
    RAllele r = new RAllele();
    RAlleleResultsDB rDB = new RAlleleResultsDB();
//    SAllele s = new SAllele();
//    SomaticAllele soma = new SomaticAllele();
//    TAllele t = new TAllele();
//    VAllele v = new VAllele();
//    WAllele w = new WAllele();
//    YAllele y = new YAllele();
    private String allele;
    private FileReader fileReader;
    private String oldFileName;
    private Set <String> set = new TreeSet<>();
    private String goOn;
    private boolean carryOn = true;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void consoleMenu () throws IOException {
        while (carryOn) {

            //Inputing file path + verification

            fileReader = fileInput.input();
            oldFileName = fileInput.getAdjustedFileLocation();

            // Asking for Variation Allele + verification

            allele = av.ask();

            //Processing specific Allele depending on input

            if (allele.equals("R")) {
                r.process(fileReader, oldFileName);
                set = r.processR();
                r.print();
                r.toFile();
                r.erase();
                //Adding to database upon choice

                System.out.println("Do you want to add these results to overall R-allele results database? Y/N");
                String choice = br.readLine();
                if (choice.equals("Y") || choice.equals("y")) {
                    rDB.setTt(rDB.getTt() + r.getTt());
                    rDB.setTa(rDB.getTa() + r.getTa());
                    rDB.setCa(rDB.getCa() + r.getCa());
                    rDB.setCt(rDB.getCt() + r.getCt());
                    rDB.setTotalSNP(rDB.getTotalSNP() + r.getTotalSNP());
                }
                choice=null;

                //Working with database upon choice

                System.out.println("Do you want to work with database? Y/N");
                String choiceWork = br.readLine();
                if (choiceWork.equals("Y") || choiceWork.equals("y")) {

                    //Writing database to file upon choice

                    System.out.println("Do you want to write database to file? Y/N");
                    String choiceWrite = br.readLine();
                    if (choiceWrite.equals("Y") || choiceWrite.equals("y")) {
                        rDB.toFile();
                    }
                    choiceWrite=null;

                    //Erasing database upon choice

                    System.out.println("Do you want to ERASE ENTIRE DATABASE? Y/N");
                    String choiceErase = br.readLine();
                    if (choiceErase.equals("Y") || choiceErase.equals("y")) {
                        rDB.erase();
                    }
                    choiceErase=null;
                }
                choiceWork=null;
            }

            //Offer to continue work

            System.out.println("Do you want to continue? Y/N");
            goOn = br.readLine();
            if (goOn.equals("Y")||goOn.equals("y")){
                carryOn = true;
            }
            else {
                carryOn = false;
            }
        }
    }
}
