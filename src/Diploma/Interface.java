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
            }
//        if (allele.equals("R")){
//            r.process();
//        }
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
