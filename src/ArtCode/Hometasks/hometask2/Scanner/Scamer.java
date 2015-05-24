package ArtCode.Hometasks.hometask2.Scanner;

import java.io.Reader;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;

/**
 * Created by Master on 09-May-15.
 */
public class Scamer {

    //Реализовать все то же для ридера. Подумать.

    String inputString;
    Reader inputReader;
    public static String spaceDelimiter = " ";
    String lineDelimiter = "\\n";
    String delimiter = spaceDelimiter;

    String[] getStrArr() {
        return strArr;
    }

    void setStrArr(String[] strArr) {
        this.strArr = strArr;
    }

    private String[] strArr;
    private String[] lineArr;

    public String[] getLineArr() {
        return lineArr;
    }

    public void setLineArr(String[] lineArr) {
        this.lineArr = lineArr;
    }

    int counter = 0;
    int lineCounter = 0;

    public Scamer(String str) {
        this.inputString = str;
        setStrArr(str.split(delimiter));
        setLineArr(str.split(lineDelimiter));
    }

    public Scamer(Reader rd) {
        this.inputReader = rd;
        this.inputString = inputReader.toString();
        setStrArr(inputString.split(delimiter));
        setLineArr(inputString.split(lineDelimiter));
    }

    public String next() {
        if (isClosed()){
            throw new NoSuchElementException();
        } else {
            while (getStrArr()[counter].equals(delimiter) || getStrArr()[counter].equals("")) {
                counter++;
            }
            System.out.println(strArr[counter].trim());
            return getStrArr()[counter++].trim();
        }
    }

    public boolean hasNext() {
        if (isClosed()){
            throw new NoSuchElementException();
        } else {
            if (counter < strArr.length) return true;
            else {
                counter = 0;
                return false;
            }
        }
    }

    public int nextInt() {
        if (isClosed()){
            throw new NoSuchElementException();
        } else {
            try {
                while (getStrArr()[counter].equals(delimiter) || getStrArr()[counter].equals("") || !isInteger(getStrArr()[counter])) {
                    counter++;
                }
                System.out.println(strArr[counter].trim());
                return Integer.parseInt(getStrArr()[counter++].trim());
            } catch (ArrayIndexOutOfBoundsException arr) {
                throw new InputMismatchException();
            }
        }
    }

    public boolean hasNextInt() {
        if (isClosed()){
            throw new NoSuchElementException();
        } else {
            int localCounter = counter;
            if (counter < strArr.length) {
                while (localCounter < getStrArr().length && !isInteger(getStrArr()[localCounter])) {
                    localCounter++;
                }
                if (localCounter == getStrArr().length) return false;
                else return true;
            } else {
                counter = 0;
                return false;
            }
        }
    }

    public boolean isInteger(String s) {
        if (isClosed()){
            throw new NoSuchElementException();
        } else {
            try {
                Integer.parseInt(s);
            } catch (NumberFormatException e) {
                return false;
            } catch (NullPointerException e) {
                return false;
            }
            // only got here if we didn't return false
            return true;
        }
    }

    public String nextLine() {
        if (isClosed()){
            throw new NoSuchElementException();
        } else {
            try {
                System.out.println(getLineArr()[lineCounter].trim());
                return getLineArr()[lineCounter++].trim();
            } catch (ArrayIndexOutOfBoundsException e) {
                System.err.println("No more lines left");
                return null;
            }
        }
    }

    public void useDelimiter(String s) {
        if (isClosed()){
            throw new NoSuchElementException();
        }
        else {
            this.delimiter = s;
            setStrArr(inputString.split(delimiter));
        }
    }

    public void setDefaultDelimiter (){
        if (isClosed()){
            throw new NoSuchElementException();
        }
        else {
            this.delimiter = lineDelimiter;
            setStrArr(inputString.split(delimiter));
        }
    }


    private boolean closed = false;

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public void close() {
        System.out.println("The scanner is closed. FSB is on the way to investigate");
        setClosed(true);
    }

}

