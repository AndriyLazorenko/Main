package ArtCode.hometask2.Hashmap;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Master on 24-Apr-15.
 */
public class TestHashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(120, "ababab");
        map.put(120, "abababa");
        map.put(60, "a");
        System.out.println(map.isEmpty());
        System.out.println(map.size());
        for(Object o:map.entrySet())
            System.out.println(o);
        for(Object o:map.keySet())
            System.out.println(o);
        for(Object o:map.values())
            System.out.println(o);
        System.out.println(map.get(120));
        System.out.println(map.get(60));
        //System.out.println(map.get(120));
    }
}
