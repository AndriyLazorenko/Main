package Perspektiva.lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Master on 16-Jan-15.
 */
public class Area {
    public boolean fit () throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Length");
        int length = Integer.parseInt(br.readLine());
        System.out.println("Width");
        int width = Integer.parseInt(br.readLine());
        int l=200;int w=100;
        return (length*width<l*w);
}
}
