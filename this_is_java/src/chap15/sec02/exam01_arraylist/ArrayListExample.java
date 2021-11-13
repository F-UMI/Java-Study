package chap15.sec02.exam01_arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();

        list.add("JAVA");
        list.add("JDBC");
        list.add("Servlet/JSP");
        list.add(2, "DATABASE");
        list.add("iBATIS");

        int size = list.size();
        System.out.println("size = " + size);
        System.out.println();

        String skill = list.get(2);
        System.out.println("2:" + skill);
        System.out.println();

        for (int i = 0; i < list.size(); i++){
            String s = list.get(i);
            System.out.println(i +":" +"s = " + s);

        }
        System.out.println();
        list.remove(2);
        list.remove(2);
        list.remove("iBATIS");
        for (int i = 0; i < list.size(); i++){
            String s = list.get(i);
            System.out.println(i +":" +"s = " + s);

        }

    }
}
