package Diploma;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class Interface {
    FileInput fileInput = new FileInput();
    FolderInput folder = new FolderInput();
    AlleleValidation av = new AlleleValidation();
    RAlleleResultsDB rDB = new RAlleleResultsDB();
    private String allele;
    private FileReader fileReader;
    private String oldFileName;
    private Set <String> set = new LinkedHashSet<>();
    private String goOn;
    private boolean carryOn = true;
    private String allFolder;
    private String folderLocation;
    private Map<String,FileReader> folderFiles;
    private int counterOfFilesProcessed=0;

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void consoleMenu () throws IOException {
        while (carryOn) {

            //Construction of new objects of allele classes

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
            //    SAllele s = new SAllele();
            //    SomaticAllele soma = new SomaticAllele();
            //    TAllele t = new TAllele();
            //    VAllele v = new VAllele();
            //    WAllele w = new WAllele();
            //    YAllele y = new YAllele();

            //Algorithm for processing entire folder

            System.out.println("Do you want to process ENTIRE folder? Y/N");
            allFolder = br.readLine();
            if (allFolder.equals("y") || allFolder.equals("Y")) {

                //Asking for folder location with a simple verification

                folderLocation = folder.inputFolder();

                // Asking for Variation Allele + verification

                allele = av.ask();

                //Processing specific Allele depending on input

                if (allele.equals("R")) {
                    folderFiles = folder.input(folderLocation);
                    for (String s:folderFiles.keySet()){
                        r.process(folderFiles.get(s), s);
                        set = r.processR();
                        rDB.setTt(rDB.getTt() + r.getTt());
                        rDB.setTa(rDB.getTa() + r.getTa());
                        rDB.setCa(rDB.getCa() + r.getCa());
                        rDB.setCt(rDB.getCt() + r.getCt());
                        rDB.setTotalSNP(rDB.getTotalSNP() + r.getTotalSNP());
                        rDB.setI(rDB.getI() + r.getI());
                        counterOfFilesProcessed++;
                        r.erase();
                        set.clear();
                    }
                    System.out.println(counterOfFilesProcessed+" files processed from folder");
                    counterOfFilesProcessed=0;
                    //Working with database upon choice

                    System.out.println("Do you want to work with database? Y/N");
                    String choiceWork = br.readLine();
                    if (choiceWork.equals("Y") || choiceWork.equals("y")) {

                        //Writing database to file upon choice

                        System.out.println("Do you want to write database to file? Y/N");
                        String choiceWrite = br.readLine();
                        if (choiceWrite.equals("Y") || choiceWrite.equals("y")) {
                            rDB.regularize();
                            rDB.toFile(folderLocation+"\\\\\\\\"+"smth.txt");
                            rDB.clearSet();
                        }

                        //Printing database upon choice

                        System.out.println("Do you want to print database? Y/N");
                        String choicePrint = br.readLine();
                        if (choicePrint.equals("Y") || choicePrint.equals("y")) {
                            rDB.regularize();
                            rDB.print();
                            rDB.clearSet();
                        }

                        //Erasing database upon choice

                        System.out.println("Do you want to ERASE ENTIRE DATABASE? Y/N");
                        String choiceErase = br.readLine();
                        if (choiceErase.equals("Y") || choiceErase.equals("y")) {
                            rDB.erase();
                        }
                    }
                }
            }
            else {

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

                    //Adding to database upon choice

                    System.out.println("Do you want to add these results to overall R-allele results database? Y/N");
                    String choice = br.readLine();
                    if (choice.equals("Y") || choice.equals("y")) {
                        rDB.setTt(rDB.getTt() + r.getTt());
                        rDB.setTa(rDB.getTa() + r.getTa());
                        rDB.setCa(rDB.getCa() + r.getCa());
                        rDB.setCt(rDB.getCt() + r.getCt());
                        rDB.setTotalSNP(rDB.getTotalSNP() + r.getTotalSNP());
                        rDB.setI(rDB.getI() + r.getI());
                    }

                    //Working with database upon choice

                    System.out.println("Do you want to work with database? Y/N");
                    String choiceWork = br.readLine();
                    if (choiceWork.equals("Y") || choiceWork.equals("y")) {

                        //Writing database to file upon choice

                        System.out.println("Do you want to write database to file? Y/N");
                        String choiceWrite = br.readLine();
                        if (choiceWrite.equals("Y") || choiceWrite.equals("y")) {
                            rDB.regularize();
                            rDB.toFile(oldFileName);
                            rDB.clearSet();
                        }

                        //Printing database upon choice

                        System.out.println("Do you want to print database? Y/N");
                        String choicePrint = br.readLine();
                        if (choicePrint.equals("Y") || choicePrint.equals("y")) {
                            rDB.regularize();
                            rDB.print();
                            rDB.clearSet();
                        }

                        //Erasing database upon choice

                        System.out.println("Do you want to ERASE ENTIRE DATABASE? Y/N");
                        String choiceErase = br.readLine();
                        if (choiceErase.equals("Y") || choiceErase.equals("y")) {
                            rDB.erase();
                        }
                    }
                }

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
