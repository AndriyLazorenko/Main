package ArtCode.Lessons.lesson8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Master on 16-May-15.
 */
public class AnyToFile {

    private String classe;
    private String path;

    public void save (Object o, String path){

        Class savedTypeTemp = o.getClass();
        this.path = path;

        Field [] fieldsArr = savedTypeTemp.getDeclaredFields();
//        Constructor [] constructorsArr = savedTypeTemp.getDeclaredConstructors();
//        Method [] methods = savedTypeTemp.getDeclaredMethods();

        classe = o.getClass().toString();

        //Names of Fields
        String [] fieldNames = new String[fieldsArr.length];
        for (int i = 0; i <fieldNames.length ; i++) {
            try {
                fieldNames[i]= fieldsArr[i].getName()+"="+fieldsArr[i].get(fieldsArr[i].getName());
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            System.out.println(fieldNames[i]);
        }

//        //Names of Methods
//        String [] methodNames = new String[methods.length];
//        for (int i = 0; i<methodNames.length;i++){
//            methodNames[i] = methods[i].getName();
//        }

        //To outputArray
        List<String> outputArray = new LinkedList<>();
        outputArray.add(classe);
        for(String s:fieldNames){
            outputArray.add(s);
        }
//        for(String s:methodNames){
//            outputArray.add(s);
//        }

        //To file
        File file = new File(path);
        for (String s:outputArray) {
            try {
                FileWriter fw = new FileWriter(file,true);
                fw.append(s+"\n");
                fw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
