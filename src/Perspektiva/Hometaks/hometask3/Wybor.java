package Perspektiva.Hometaks.hometask3;

/**
 * Created by Master on 25-Feb-15.
 */
public class Wybor extends Puzyrjok {

    //Конструкторы и дополнительные элементы, заданные Олегом

    private int [] mas;
    public Wybor(int input, boolean check) {
        if(check) {
            mas = createMass(input);
        }
    else mas = new int[input];}
    public Wybor(int input){
        mas = new int [input];
    }
    public void change (int indexOfElement, int newValueOfElement) {
        mas[indexOfElement] = newValueOfElement;
    }
    public void change (int[] mas){
        this.mas = mas;
    }

    //Конец дополнительных элементов

    public static void sortMass (int[]a) {
        // Реализована сортировка выбором. Выбором минимального элемента и помещением его слева.
        for (int i = 0; i<a.length-1;i++){
            for (int j=a.length-1;j>i;j--) {
                if (a[i] > a[j]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
        }

    }
}


