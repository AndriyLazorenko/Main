package ArtCode.Lessons.lesson8.Reflection;

import ArtCode.Lessons.lesson8.Save;

import java.util.Date;

/**
 * Created by Master on 22-May-15.
 */
public class Man {
    private int age;
    @Save(name = "імя")
    public String name;
    private Date date;

    public Man() {
    }

    public Man(int age, String name, Date date) {
        this.age = age;
        this.name = name;
        this.date = date;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Man{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
