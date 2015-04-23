package Perspektiva.Hometaks.hometask3;

/**
 * Created by Master on 25-Feb-15.
 */
public abstract class Puzyrjok {
    public static int [] createMass (int numberOfElements) {
        int [] mas = new int[numberOfElements];
        for (int i = 0; i<mas.length; i++)
            mas[i] = (int) (Math.random() * 100);
        return mas;
    }
    public static void printMass (int [] a) {
        for (int i = 0; i<a.length-1; i++){
            System.out.print(a[i] + ", ");
    }
        System.out.println(a[a.length-1]);
    }
    public static void sortMass (int[]a) {
        //Реализована сортировка пузырьком. Сравниваются два соседних элемента, меньший всплывает налево.
        for (int j =0; j<a.length-1;j++) {
            for (int i = 0; i < a.length - 1-j; i++) {
                if (a[i] > a[i + 1]) {
                    a[i] = a[i] + a[i + 1];
                    a[i + 1] = a[i] - a[i + 1];
                    a[i] = a[i] - a[i + 1];
                }
            }
        }

    }

}
