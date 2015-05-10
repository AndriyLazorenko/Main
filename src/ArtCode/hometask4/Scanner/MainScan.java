package ArtCode.hometask4.Scanner;

import java.io.*;

/**
 * Created by Lazorenko on 07.05.2015.
 */
public class MainScan {
    public static void main(String[] args) {
//        InputStream in = ;
//        Reader rd = new InputStreamReader(in);
//        Scamer sm = new Scamer(rd);
//        while (sm.hasNext()) {
//            sm.next();
//        }
//        while (sm.hasNextInt()){
//            sm.nextInt();
//        }
        Scamer sc = new Scamer(" ababa lolo ku-ku 98765 sdlcm 312 mxmzodk ui ui avciou coo-coo 12 Motherfucker ");
//        System.out.println(sc.nextInt());
//        while (sc.hasNext()) {
//            System.out.println(sc.next());
//        }
        while (sc.hasNext()) {
            sc.next();
        }
        while (sc.hasNextInt()){
            sc.nextInt();
        }

        Scamer scm = new Scamer("sdasda\n asdklasdk");
        scm.nextLine();
        scm.nextLine();
        scm.nextLine();
        scm.nextLine();

        scm.useDelimiter("da");
        while (scm.hasNext()) {
            scm.next();
        }
        scm.setDefaultDelimiter();
        while (scm.hasNext()) {
            scm.next();
        }
        scm.close();
//        while (scm.hasNext()) {
//            scm.next();
//        }
//        scm.nextInt();
//        scm.hasNextInt();
//        scm.nextLine();
        }
//        System.out.println(sc.next());
//        System.out.println(sc.next());
//        System.out.println(sc.nextInt());
    }
