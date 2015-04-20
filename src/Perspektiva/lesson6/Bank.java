package Perspektiva.lesson6;

/**
 * Created by Master on 29-Jan-15.
 */
public class Bank {
    String name;
    String country;
    double account;
    int countOfEmployees;
    public Bank (String a){
        this.name = a;
    }
    public Bank (int a){
        countOfEmployees=a;
    }
    public Bank (double b){
        account=b;
    }
    public Bank (int a, double b){
        this(a);
        account=b;
    }
    public Bank (int a,String b){
        this.countOfEmployees=a;
        this.name=b;
    }
    public Bank (int a,String b, String c){
        this.countOfEmployees=a;
        this.name=b;
        this.country=c;
    }
    public Bank (int a,String b, double c){
        this.countOfEmployees=a;
        this.name=b;
        this.account=c;
    }
    public Bank (int a,String b, String c, double d){
        this.countOfEmployees=a;
        this.name=b;
        this.country=c;
        this.account=d;
    }
}
