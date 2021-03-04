package io.sorabe.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
    public static void main(String[] args) {
        // Non doublon
        // ne maintient pas l'ordre
        Set<String> sets = new HashSet<>();
        sets.add("D");
        sets.add("X");
        sets.add("1");
        sets.add("A");
        sets.forEach(System.out::println);
        //Treeset
        //Implemenetation of SortedSet Interface
        // natural ordering or Comparator
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("1");
        treeSet.add("C");
        treeSet.add("D");
        System.out.println(treeSet);
        // With Comparator
        TreeSet<String> treeSet1 = new TreeSet<>(new TheComparator());
        treeSet1.add("G");
        treeSet1.add("A");
        treeSet1.add("E");
        treeSet1.add("K");
        treeSet1.add("S");
        treeSet1.add("4");
        System.out.println("Set before using the comparator: "+ treeSet1);

        System.out.println("The elements sorted in descending"+ " order: ");
        for (String element : treeSet1)
            System.out.print(element + " ");
    }
}
