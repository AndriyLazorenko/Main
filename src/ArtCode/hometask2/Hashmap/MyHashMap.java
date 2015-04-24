package ArtCode.hometask2.Hashmap;

import java.util.*;

/**
 * Created by Lazorenko on 23.04.2015.
 */
public class MyHashMap <K,V> implements Map<K,V> {
    private Entry<K,V>[] table;
    private double loadFactor = 0.75;
    private static final int initialCapacity = 15;
    private int currentCapacity = initialCapacity;
    private int size = 0;

    public MyHashMap() {
        this.table = new Entry[currentCapacity];
    }

    @Override
    public int size() {
        Iterator iter = keySet().iterator();
        while(iter.hasNext()){
            size = size++;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        if (keySet().isEmpty()){
            return true;
        }
        else return false;
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
        keySet().add(key);
        values().add(value);
        //entrySet().add(key,value);

        int hash = key.hashCode();
        int position = hash % currentCapacity;

        if(table[position] == null){
            table[position] = new Entry(key,value);

        } else {
            Entry iter = table[position];
            while (iter.next != null){
                if(iter.key.equals(key)){
                    V forRet = (V)iter.value;
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
        Set<K> keyS = new LinkedHashSet<>();
        return keyS;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set entrySet() {
        return null;
    }

    private class Entry<K,V>{

        K key;
        V value;
        Entry next;

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

    }



}
