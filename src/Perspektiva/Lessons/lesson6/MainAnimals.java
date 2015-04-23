package Perspektiva.Lessons.lesson6;

import java.io.IOException;

/**
 * Created by Master on 29-Jan-15.
 */
public class MainAnimals {
    public static void main (String [] args) throws IOException {
        Cat cat = new Cat("Pussy cat");
        Goose goose = new Goose("Donald duck");
        cat.pat(goose);
        goose.pat(cat);
    }
}
