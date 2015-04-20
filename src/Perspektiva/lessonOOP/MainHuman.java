package Perspektiva.lessonOOP;

/**
 * Created by Master on 25-Mar-15.
 */
public class MainHuman {
    public static void main(String[] args) {
        Human h1 = new Human("Lazorenko Andriy Yuriyovich", true, "16.11.1990");
        Human h2 = new Human ("Voronkova Yelyzaveta Sergeevna", false,"23.08.1993");
        Human h3 = new Human ("Koshel Sergei Alexandrovich", true,"23.12.1993");
        Human h4 = new Human ("Korogodov Edward", false,"13.09.1990");
        h1.convertion();
        h2.convertion();
        h1.pzdrv(h2);
        h2.pzdrv(h1);
        Marriage m1 = new Marriage(h1,h2);
        m1.fight();
        Marriage m2 = new Marriage(h2,h3);
        m1.fight();
        Marriage m3 = new Marriage(h3,h4);
        m1.fight();
        Marriage m4 = new Marriage(h4,h1);
        m1.fight();
        Megafight mega = new Megafight(m1,m2,m3,m4);
        mega.fight();
    }
}
