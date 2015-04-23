package ArtCode.Lessons.lesson2;

import java.util.*;

/**
 * Created by Master on 19-Apr-15.
 */
public class TestIterHashmap {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(145, "Ivan");
        map.put(22, "Oleg");
        map.put(111, "Anton");
        map.put(56, "Serhii");
        map.put(98, "Nick");
        Set<Integer> set = map.keySet();
        Iterator<Integer> iter = set.iterator();
        while (iter.hasNext()) {
            Integer k = iter.next();
            System.out.println("Key = " + k + "; Value = " + map.get(k));
        }
        //for (Integer k:set){
        //}
    }
}
