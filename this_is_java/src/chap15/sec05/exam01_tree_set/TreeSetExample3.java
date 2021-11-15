package chap15.sec05.exam01_tree_set;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
    public static void main(String[] args) {
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("apple");
        treeSet.add("forever");
        treeSet.add("description");
        treeSet.add("ever");
        treeSet.add("zoo");
        treeSet.add("base");
        treeSet.add("guess");
        treeSet.add("cherry");

        System.out.println("c-f 사이의 값");
        NavigableSet<String> rangeSet = treeSet.subSet("c", true, "f", true);
        for (String s : rangeSet){
            System.out.println(s);
        }
    }
}
