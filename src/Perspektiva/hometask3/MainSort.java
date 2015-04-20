package Perspektiva.hometask3;

/**
 * creatMass(int n);- метод создания
 [12:07:02] Шевчук Олег: sortMass(int[] arr);-сортировка массива
 [12:07:25] Шевчук Олег: printMass(int[] arr);- вывод массива
 [12:07:40] Шевчук Олег: класс MyMassiv
 */
public class MainSort {
    public static void main(String[] args) {
        //Код, исполняющий пузырек
        int[] arr= Puzyrjok.createMass(10);
        Puzyrjok.printMass(arr);
        Puzyrjok.sortMass(arr);
        Puzyrjok.printMass(arr);
        //Код, исполняющий выбором
        int[] arr2= Wybor.createMass(10);
        Wybor.printMass(arr2);
        Wybor.sortMass(arr2);
        Wybor.printMass(arr2);
        //Код, исполняющий вставками
        int[] arr3= Wstawka.createMass(10);
        Wstawka.printMass(arr3);
        Wstawka.sortMass(arr3);
        Wstawka.printMass(arr3);
        //Код, исполняющий Шейкериал
        int[] arr4= Shaker.createMass(10);
        Shaker.printMass(arr4);
        Shaker.sortMass(arr4);
        Shaker.printMass(arr4);
    }

}
