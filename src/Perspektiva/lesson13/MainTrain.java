package Perspektiva.lesson13;

import java.io.*;
import java.util.*;

/**
 * Created by Master on 24-Feb-15.
 */
public class MainTrain {
    public static void main(String[] args) throws FileNotFoundException {
        int []a = {12,34,5234,63,329,94};
        List <String> b = new ArrayList<String>();
        b.add("your bunny wrote");
        b.add("3.14dec");
        FileInputStream fis = new FileInputStream("C:\\Users\\Master\\IdeaProjects\\New\\src\\Perspektiva.lesson13\\New.txt");
        Train train = new Train(a,"family name","surname",b,fis);

    }
    public static void writeTrain (Train train) {

        /*FileOutputStream fos = new FileOutputStream("C:\\Users\\Master\\IdeaProjects\\New\\src\\Perspektiva.lesson13\\train.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(train);
        System.out.println("Successful");
        ObjectInputStream ois = new ObjectInputStream();*/
        //ДЗ - разобрать где ошибка, поймать трай кетчем, реализовать сериализацию.
    }
}
