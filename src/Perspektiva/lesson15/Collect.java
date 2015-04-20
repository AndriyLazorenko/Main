package Perspektiva.lesson15;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/**
 * Created by Master on 03-Mar-15.
 */
public class Collect<E> implements Iterable<E>{
    private ArrayList<E> list = new ArrayList<E>();
    @Override
    public Iterator<E> iterator() {

        return new Iterator<E>() {
            private int a;
            private int size = list.size();

            @Override
            public boolean hasNext() {
                if (list.size()!= size){throw new ConcurrentModificationException();
                }
                return size != a;
            }

            @Override
            public E next() {
                if (list.size() != size) {
                    throw new ConcurrentModificationException();
                } else return list.get(a++);
            }
        };}
    public void add (int a, E e1){
        list.add(a,e1);
    }
    public void add (E e1){
        list.add(e1);
    }
    public void set (int a, E e1){
        list.set(a,e1);
    }
    public boolean remove (E e1){
        return list.remove(e1);
    }
    public boolean contains (E e1){
        return list.contains(e1);
    }
    /*public void addAll (Iterable<E> collection){
        list.addAll(collection);
    }*/
    //Тренироваться с переписыванием коллекции, как указано сверху
    public void addAll (Collection<E> collect){
        list.addAll(collect);
    }


}
