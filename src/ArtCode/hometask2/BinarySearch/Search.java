package ArtCode.hometask2.BinarySearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Search {

    private int searched;

    private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void askForNumber() throws IOException {
        System.out.println("Insert a number to search for");
        setSearched(Integer.parseInt(getBr().readLine()));
    }

    public int searchForGivenNumber(int[]where, int low, int high){
        int midpoint = (high+low)/2;
        if(where[midpoint]> getSearched()){
            return searchForGivenNumber(where,low,midpoint-1);
        }
        else if (where[midpoint]< getSearched()){
            return searchForGivenNumber(where,midpoint+1,high);
        }
        else {
            return midpoint;
        }
    }

    public int getSearched() {
        return searched;
    }

    public void setSearched(int searched) {
        this.searched = searched;
    }

    public BufferedReader getBr() {
        return br;
    }

    public void setBr(BufferedReader br) {
        this.br = br;
    }
}
