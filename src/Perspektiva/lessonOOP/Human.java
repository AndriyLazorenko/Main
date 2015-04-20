package Perspektiva.lessonOOP;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Master on 25-Mar-15.
 */
public class Human {
    public Human (String s, boolean bool,String dob){
        this.setFio(s);
        this.setInTown(bool);
        this.setDateOfBirth(dob);
    }
    private String fio;
    private String dateOfBirth;
    private static Date d;
    private boolean isInTown;
    private int age;
    private int health = 100;
    public void convertion () {
        String str = this.dateOfBirth;
        String []strSplt = str.split("\\.");
        int day = Integer.parseInt(strSplt[0]);
        int month = Integer.parseInt(strSplt[1]);
        int year = Integer.parseInt(strSplt[2]);
        Date d = new Date();
        String s = "dd.MM.yyyy год HH:mm:ss";
        SimpleDateFormat e = new SimpleDateFormat(s, Locale.getDefault());
        System.out.println(e.format(d));
        String yr = "yyyy";
        String mth = "MM";
        String dy = "dd";
        SimpleDateFormat yea = new SimpleDateFormat(yr, Locale.getDefault());
        SimpleDateFormat moth = new SimpleDateFormat(mth, Locale.getDefault());
        SimpleDateFormat dyy = new SimpleDateFormat(dy, Locale.getDefault());
        if (Integer.parseInt(moth.format(d))>month&&Integer.parseInt(dyy.format(d))>day) {
            this.setAge(Integer.parseInt(yea.format(d)) - year);
            System.out.println("Age is "+this.getAge());
        }
        else {
            this.setAge(Integer.parseInt(yea.format(d)) - year-1);
            System.out.println("Age is "+this.getAge());
        }
    }

    public static Date getD() {
        return d;
    }

    public static void setD(Date d) {
        Human.d = d;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public boolean isInTown() {
        return isInTown;
    }

    public void setInTown(boolean isInTown) {
        this.isInTown = isInTown;
    }

    public static void pzdrv (Human human){
        System.out.println("I wish you a happy birthday! May all your dreams come true, enjoy your life, "+ human.getFio());
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
