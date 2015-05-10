package ArtCode.hometask4.Scanner;

import java.io.Reader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Master on 08-May-15.
 */
public class Scammer implements Iterator<String>{

    Iterator iter = new Iterator();
    String inputString;
    Reader inputReader;
    String delimiter = " ";

    public String[] getStrArr() {
        return strArr;
    }

    public void setStrArr(String[] strArr) {
        this.strArr = strArr;
    }

    private String[] strArr;
    int counter =0;

    public Scammer (String str){
        this.inputString=str;
        setStrArr(str.split(delimiter));
    }
    public Scammer (Reader rd){
        this.inputReader = rd;

    }


    public String next() {
        String delimiter = " ";
        iter.iteratorNext(inputString, delimiter);
        String forRet = inputString.substring(iter.getLowerBorder(), iter.getUpperBorder()).trim();
        return forRet;

    }
    public String experiment(String delimiter){
        if (getStrArr()[counter].equals(delimiter)||getStrArr()[counter].equals("")) {
            counter++;
            return null;
        }
        else {
            System.out.println(strArr[counter]);
            counter++;
            return getStrArr()[counter];
        }
    }
    public boolean expHasNext (){
        if (counter<strArr.length) return true;
        else {
            counter =0;
            return false;
        }
    }


    public int nextInt(){
//        Pattern delimiter = Pattern.compile("^ [0-9]$");
//        Matcher m = delimiter.matcher(inputString);
//
//        iter.iteratorNext(inputString, delimiter);
//        int forRet = Integer.parseInt(inputString.substring(iter.getLowerBorder(),iter.getUpperBorder()).trim());
//        return forRet;
        return 0;
    }
    public String nextLine(){

    return null;
    }
    public boolean hasNext(){
        String delimiter = " ";
        return iter.iteratorHasNext(inputString,delimiter);
    }
    public boolean hasNextInt(){

    return false;
    }
    public void useDelimiter(String s){

    }
    public void close(){

    }

    class Iterator{

        private int lowerBorder=0;
        private int upperBorder=0;

        public int getLowerBorder() {
            return lowerBorder;
        }

        public void setLowerBorder(int lowerBorder) {
            this.lowerBorder = lowerBorder;
        }

        public int getUpperBorder() {
            return upperBorder;
        }

        public void setUpperBorder(int upperBorder) {
            this.upperBorder = upperBorder;
        }
        public boolean iteratorHasNext (String str, String delimiter){
            boolean hasNext = str.substring(getLowerBorder()).contains(delimiter);
            return hasNext;
        }
        public void iteratorNext(String str, String delimiter){
            if (iteratorHasNext(str,delimiter)) {
                if ((str.charAt(0)==" ".charAt(0))) {
                    setLowerBorder(str.indexOf(delimiter, getLowerBorder())+1);
                    setUpperBorder(str.indexOf(" ", getUpperBorder()+1)+1);
                }
                else {
                    setLowerBorder(str.indexOf(delimiter, getLowerBorder())+1);
                    setUpperBorder(str.indexOf(" ", getUpperBorder()+1)+1);
                }
            }
            else {
                System.out.println("String doesn't contain delimiter");
            }
        }
    }
}
