package Perspektiva.lesson1;

/**
 * Created by Master on 13-Jan-15.
 */
public class Picture {
    public String Сharacter;
    public void drawL (){
        for (int i=0;i<9;i+=1) {
            if (i<5) {
                for (int a=0;a<i;a+=1){
                    System.out.print(" ");
                }
                System.out.println(Сharacter);
            }
            if (i>4) {
                for (int j=0;j<8-i;j+=1) {
                    System.out.print(" ");
                }
                System.out.print(Сharacter);
                for (int b=0;b<2*(i-4)-1;b+=1) {
                    System.out.print(" ");
                }
                System.out.println(Сharacter);
            }
        }
    }
    public void dravt(){
        for (int i=0;i<9;i+=1){
            if (i<2){
                System.out.print(Сharacter);
                for (int a=0;a<7;a+=1) {
                    System.out.print(" ");
                }
                System.out.println(Сharacter);
            }
            if (i>1) {
                if (i<5) {
                    System.out.print(Сharacter);
                    for (int a = 0; a < 3; a += 1) {
                        System.out.print(" ");
                    }
                    System.out.print(Сharacter);
                    for (int a = 0; a < 3; a += 1) {
                        System.out.print(" ");
                    }
                    System.out.println(Сharacter);
                }
                if (i>4) {
                    for (int a = 0; a < 4; a += 1) {
                        System.out.print(" ");
                    }
                    System.out.println(Сharacter);
                }
            }
        }

    }
}
