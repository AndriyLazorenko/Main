package Perspektiva.lesson13;

import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Master on 24-Feb-15.
 */
public class Train {
    private int [] number;
    private String fio;
    private String dest;
    private List <String> list;
    private InputStream is;

    public Train(int[] number, String fio, String dest, List<String> list, InputStream is) {
        this.number = number;
        this.fio = fio;
        this.dest = dest;
        this.list = list;
        this.is = is;
    }

    public int[] getNumber() {
        return number;
    }

    public void setNumber(int[] number) {
        this.number = number;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public InputStream getIs() {
        return is;
    }

    public void setIs(InputStream is) {
        this.is = is;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Train train = (Train) o;

        if (!dest.equals(train.dest)) return false;
        if (!fio.equals(train.fio)) return false;
        if (!is.equals(train.is)) return false;
        if (!list.equals(train.list)) return false;
        if (!Arrays.equals(number, train.number)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = Arrays.hashCode(number);
        result = 31 * result + fio.hashCode();
        result = 31 * result + dest.hashCode();
        result = 31 * result + list.hashCode();
        result = 31 * result + is.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Train{" +
                "number=" + Arrays.toString(number) +
                ", fio='" + fio + '\'' +
                ", dest='" + dest + '\'' +
                ", list=" + list +
                ", is=" + is +
                '}';
    }


}
