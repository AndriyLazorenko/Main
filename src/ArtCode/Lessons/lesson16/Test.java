package ArtCode.Lessons.lesson16;

/**
 * Created by andriylazorenko on 13.06.15.
 */
public class Test {
    public static void main(String[] args) {
        DependencyInjector dependencyInjector = new DependencyInjectorImpl();
        ClientLogic cl = new ClientLogic();
        dependencyInjector.doInjection(cl);
    }
}
