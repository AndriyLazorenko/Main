package ArtCode.hometask2.Hashmap;

import java.util.HashMap;

/**
 * Created by Lazorenko on 23.04.2015.
 */
public class TestMyHashmap {
    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<>();
        map.put(120, "ababab");
        map.put(120, "abababa");
        System.out.println(map.keySet().isEmpty());
        //System.out.println(map.size());
        //System.out.println(map.isEmpty());
        //System.out.println(map.get(120));
    }
}

