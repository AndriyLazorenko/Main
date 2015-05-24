package ArtCode.Hometasks.hometask1.Hashmap;


/**
 * Created by Lazorenko on 23.04.2015.
 */
public class TestMyHashmap {
    public static void main(String[] args) {
        MyHashMap<Integer, String> map = new MyHashMap<>();
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
        //System.out.println(map.isEmpty());
        //System.out.println(map.get(120));
    }
}

