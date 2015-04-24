package ArtCode.hometask2.Hashmap;

/**
 * Created by Lazorenko on 23.04.2015.
 */
public class TestMyHashmap {
    public static void main(String[] args) {
        MyHashMap <Integer,String> map = new MyHashMap<>();
        map.put(120,"ababab");
        System.out.println(map.get(120));
    }
}
