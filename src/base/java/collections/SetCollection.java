package base.java.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 Set n'autorise pas les doublons
 Element unique
 Autorise au max un null
 Ne maintient pas l'ordre sauf LinkedHashSet
 */
public class SetCollection {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("-------------------");
        System.out.println("HashSet<E>");
        System.out.println("-------------------");
        Set<String> sets = new HashSet<>();
        sets.add("D");
        sets.add("X");
        sets.add("1");
        sets.add("A");
        sets.forEach(System.out::println);
        System.out.println();
        System.out.println("-------------------");
        System.out.println("Treeset<E>");
        System.out.println("-------------------");
        //Treeset
        //Implemenetation de SortedSet Interface
        // ordre naturel avec Comparator
        TreeSet<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("1");
        treeSet.add("C");
        treeSet.add("D");
        System.out.println(treeSet);
        // Avec Comparator externe
        TreeSet<String> treeSet1 = new TreeSet<>(new TheComparator());
        treeSet1.add("G");
        treeSet1.add("A");
        treeSet1.add("E");
        treeSet1.add("K");
        treeSet1.add("S");
        treeSet1.add("4");
        System.out.println("The elements sorted in descending"+ " order: ");
        for (String element : treeSet1)
            System.out.print(element + " ");
    }
}
