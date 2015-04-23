package Perspektiva.Lessons.lesson14;

/**
 * Created by Master on 26-Feb-15.
 */
public class Car
/*implements Comparable<Car>*/ {
    int year;
    String colour;
    int price;
    public Car (int a, int b, String c) {
        this.year = a;
        this.price = b;
        this.colour = c;
    }

    @Override
    public String toString() {
        return "Car{" +
                "year=" + year +
                ", colour='" + colour + '\'' +
                ", price=" + price +
                '}';
    }
/*
    @Override
    public int compareTo(Car o) {
        return price - o.price;
    }*/

}
