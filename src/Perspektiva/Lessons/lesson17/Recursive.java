package Perspektiva.Lessons.lesson17;

import java.io.File;
import java.util.Arrays;

/**
 * Created by Master on 17-Mar-15.
 */
public class Recursive {
    File fileOfControl = new File ("G:\\Programming");
    public void recursive (File f){
        if (f.getAbsoluteFile().equals(fileOfControl.getAbsoluteFile())) {
            String[] str = f.list();
            System.out.println(Arrays.toString(str));
        }
        else {
            String[] str = f.list();
            System.out.println(Arrays.toString(str));
            f=f.getParentFile();
            recursive(f);
        }
        System.out.println("Thanks for using the code");
    }
    String p = " ";
    public void recursiveForce (File f, int a){
        File[] arr =f.listFiles();
        String[] str = f.list();
        int aNew = a;
        for (int i=0;i<arr.length;i++){
            if (arr[i].isDirectory()){
                for(int j=0;j<aNew;j++){
                    System.out.print(" ");
                }
                System.out.println(str[i]);
                recursiveForce(arr[i],aNew+1);
            }
            else {
                for(int j=0;j<aNew;j++){
                    System.out.print(" ");
                }
                System.out.println(str[i]);
            }
        }
        //Homework - красивое приведение
    }
}
