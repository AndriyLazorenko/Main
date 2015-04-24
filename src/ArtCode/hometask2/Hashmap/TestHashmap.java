package ArtCode.hometask2.Hashmap;

import java.util.HashMap;

/**
 * Created by Master on 24-Apr-15.
 */
public class TestHashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(120, "ababab");
        map.put(120, "abababa");
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map.get(120));
    }
}
