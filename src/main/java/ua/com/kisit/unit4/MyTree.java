package ua.com.kisit.unit4;

import java.util.Comparator;
import java.util.TreeSet;

public class MyTree {

    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>(Comparator.naturalOrder());
        treeSet.add(7);
        treeSet.add(6);
        treeSet.add(3);
        treeSet.add(4);
        treeSet.add(5);
        treeSet.add(2);

        TreeSet<Integer> treeSet2 = new TreeSet<>(Comparator.reverseOrder());
        treeSet2.add(8);
        treeSet2.add(9);
        treeSet2.add(3);
        treeSet2.add(4);
        treeSet2.add(5);
        treeSet2.add(1);

        System.out.println(treeSet);
        System.out.println(treeSet2);

        // відм
        TreeSet<Integer> treeSet3 = new TreeSet<>(treeSet2);
        treeSet3.removeAll(treeSet);
        System.out.println(treeSet3);

        // спільна область
        TreeSet<Integer> treeSet4 = new TreeSet<>(treeSet2);
        treeSet4.retainAll(treeSet);
        System.out.println(treeSet4);




    }


}
