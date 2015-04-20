package Perspektiva.hometask6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Master on 22-Mar-15.
 */
public class Phone {

    public void setAccount(double account) {
        this.account = account;
    }

    public double getAccount() {
        return account;
    }

    private double account;

    public Phone(double account) {
        this.account = account;
    }

    public String call(String phoneNumber) {
        if (this.validityCheck(phoneNumber) == true) {
            Date d = new Date();
            d.getTime();
            String s = "dd.MM.yyyy HH:mm:ss";
            SimpleDateFormat e = new SimpleDateFormat(s, Locale.getDefault());
            System.out.println(e.format(d));
            this.setAccount(this.getAccount()-0.1);
            return e.format(d);
        } else {
            System.out.println("MOTHERFUCKER!!! WRONG PHONE NUMBER!!!");
            return null;
        }
    }

    public boolean validityCheck(String phoneNumber) {
        Pattern pattern;
        Matcher matcher;
        String phoneNumberPattern = "^0[1-9]\\d\\d\\d\\d\\d\\d\\d\\d$";
        pattern = Pattern.compile(phoneNumberPattern);
        matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public String sms(String phoneNumber) {
        if (this.validityCheck(phoneNumber) == true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("Insert your message");
                String sms = br.readLine();
                System.out.println("Your message has been sent");
                this.setAccount(this.getAccount()-0.05);
                return sms;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Motherfucker!!! Wrong number!!!");
            return null;
        }
        return null;
    }

    public double topup(String phoneNumber) {
        if (this.validityCheck(phoneNumber) == true) {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.println("Insert the amount of topup in hrn");
                double amountOfTopup = Float.parseFloat(br.readLine());
                System.out.println("Your topup has been successful");
                this.setAccount(this.getAccount()+amountOfTopup);
                return amountOfTopup;
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Motherfucker!!! Wrong number!!!");
            return 0;
        }
        return 0;
    }
}
