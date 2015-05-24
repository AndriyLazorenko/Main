package ArtCode.Hometasks.hometask1.BinarySearch;

import java.io.IOException;

public class MainBinarySearch {

    public static void main(String[] args) throws IOException {
        //Class declarations
        RecurMas recurMas = new RecurMas();
        RecurOut recurOut = new RecurOut();
        Gold gold = new Gold();
        Search search = new Search();
        //Creation of new random array of given size via recursion
        recurMas.numberGetter();
        recurMas.arraySetup();
        int[]array = recurMas.recarray(0);
        //Printing array via recursion
        recurOut.recursion(array, 0);
        //Sorting array via quicksort
        gold.golden(array,0,array.length-1);
        //Printing sorted array
        recurOut.recursion(array,0);
        //Searching for given element in sorted array
        search.askForNumber();
        System.out.println("Number "+search.getSearched()+" is located on "+search.searchForGivenNumber(array,0,array.length-1)+" position in array");
    }
}
