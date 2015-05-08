package ArtCode.hometask4.Scanner;

import java.io.Reader;
import java.util.Iterator;

/**
 * Created by Master on 08-May-15.
 */
public class Scammer implements Iterator<String>{
    Iterator iter = new Iterator();
    String inputString;
    Reader inputReader;
    public Scammer (String str){
        this.inputString=str;
    }
    public Scammer (Reader rd){
        this.inputReader = rd;
    }

    public String next(){
        String delimiter = " ";
        int counterEnd=iter.iteratorNext(inputString,delimiter);
        String forRet = inputString.substring(
        return forRet;
    }

    public int nextInt(){

    return 0;
    }
    public String nextLine(){

    return null;
    }
    public boolean hasNext(){

    return false;
    }
    public boolean hasNextInt(){

    return false;
    }
    public void useDelimiter(String s){

    }
    public void close(){

    }
    class Iterator{
        int iteratorPosition = 0;
        public int iteratorNext(String str, String delimiter){
            return iteratorPosition = str.indexOf(delimiter,iteratorPosition);
        }
    }
}
