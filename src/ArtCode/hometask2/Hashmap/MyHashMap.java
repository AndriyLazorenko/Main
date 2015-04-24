package ArtCode.hometask2.Hashmap;

import java.util.*;

/**
 * Created by Lazorenko on 23.04.2015.
 */
public class MyHashMap <K,V> implements Map<K,V> {
    private Entry[] table;
    private double loadFactor = 0.75;
    private int capacity = 10;
    private int size = 0;

    public MyHashMap() {
        table = (Entry[])new Object[capacity];
    }

    @Override
    public int size() {
        return table.length;
    }

    //После реализации итератора
    @Override
    public boolean isEmpty() {
        return false;
    }

    //После реализации итератора
    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    //После реализации итератора
    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    //После реализации итератора
    @Override
    public V get(Object key) {
        return null;
    }

    @Override
    public V put(K key, V value) {
        int hash = key.hashCode();
        int position = hash % capacity;

        if(table[position] == null){
            table[position] = new Entry(key,value);

        } else {
            Entry iter = table[position];
            while (iter.next != null){
                if(iter.key.equals(key)){
                    V forRet = iter.value;
                    iter.value = value;
                    return forRet;
                }
                iter = iter.next;
            }
            iter.next = new Entry(key,value);
        }

        return null;
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public void putAll(Map<? extends K, ? extends V> m) {

    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {

        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set entrySet() {
        return null;
    }

    private class Entry extends Object{

        K key;
        V value;
        Entry next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }



}
