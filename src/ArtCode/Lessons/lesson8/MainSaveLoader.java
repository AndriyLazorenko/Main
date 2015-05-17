package ArtCode.Lessons.lesson8;

/**
 * Created by Master on 16-May-15.
 */
public class MainSaveLoader {
    public static void main(String[] args) {
        AnyToFile a = new AnyToFile();
        TestClass t = new TestClass();
        a.save(t ,"G://ClassSave.txt");
    }
}
