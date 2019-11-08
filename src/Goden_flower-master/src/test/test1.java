package test;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.SortedSet;
import java.util.TreeSet;

public class test1 {
    public static void main(String[] args) {
        TreeSet ts = new TreeSet();
        ts.add(45);
        ts.add(87);
        ts.add(97);
        ts.add(88);
        ts.add(92);
        ts.add(83);
        ts.add(60);
        Iterator iterator =ts.iterator();
        SortedSet<Integer>ss1=ts.headSet(60);
        SortedSet<Integer>ss2=ts.tailSet(60);
        System.out.println(Arrays.toString(ss1.toArray()));
        System.out.println(Arrays.toString(ss2.toArray()));
        int array[] = {5,54,45,};
        System.out.println(Arrays.toString(array));
    }
}
