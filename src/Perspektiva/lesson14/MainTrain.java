package Perspektiva.lesson14;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Master on 26-Feb-15.
 */
public class MainTrain {
    public static void main(String[] args) throws FileNotFoundException {
        int []a = {12,34,5234,63,329,94};
        List <String> b = new ArrayList<String>();
        b.add("your bunny wrote");
        b.add("3.14dec");
        FileInputStream fis = new FileInputStream("C:\\Users\\Master\\IdeaProjects\\New\\src\\Perspektiva.lesson13\\New.txt");
        Train train = new Train(a,"family name","surname",b,fis);
        //try catch Filenotfounexception, IOexception

    }
    public static Train readTrain() throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\Master\\IdeaProjects\\New\\src\\Perspektiva.lesson14\\train.txt"));
                Train tr = (Train) ois.readObject();
        return tr;
    }
    public static void writeTrain (Train tr) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\Master\\IdeaProjects\\New\\src\\Perspektiva.lesson14\\train.txt"));
        oos.writeObject(tr);
    }
    //проработать поезд и экстерналайзы/интерналайзы












    /*FileOutputStream fos = new FileOutputStream("C:\\Users\\Master\\IdeaProjects\\New\\src\\Perspektiva.lesson13\\train.txt");
    ObjectOutputStream oos = new ObjectOutputStream(fos);
    oos.writeObject(train);
    System.out.println("Successful");
    ObjectInputStream ois = new ObjectInputStream();*/
}

