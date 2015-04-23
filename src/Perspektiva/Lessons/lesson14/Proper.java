package Perspektiva.Lessons.lesson14;

import java.io.*;
import java.util.Properties;

/**
 * Created by Master on 26-Feb-15.
 */
public class Proper {
    public static void main(String[] args) throws IOException {
        //Импортировать свойства автомобиля в отдельный файлик
        Properties prop = new Properties();
        Car c = new Car (1293, 3139, "fuckoff");
        FileOutputStream fos = new FileOutputStream("C:\\Users\\Master\\IdeaProjects\\New\\src\\Perspektiva.Lessons.lesson14\\prop.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c);
        //check for correctness - incorrect. Finish as a hometask.
        prop.load(new FileReader("C:\\Users\\Master\\IdeaProjects\\New\\src\\Perspektiva.Lessons.lesson14\\prop.txt"));
        String year = prop.getProperty("year");
        System.out.println(year);
    }
}
