package io.sorabe.collections;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

/*
   Interface) Iterable
               ^
   Interface) Collection
               ^
   Interface) List
             implements
 Vector, Arraylist, LinkedList, CopyOnWriteArrayList

 */
public class ListTest {
    public static void main(String[] args) {
        System.out.println("-------------------");
        System.out.println("Iterator");
        System.out.println("-------------------");
        /*
            Parcourir avec Iterator
            Iterator parcourt Arraylist en gardand l'ordre
         */
        String[] vowels = {"a", "e", "o", "i", "u"};
        Iterable<String> list = Arrays.asList(vowels);
        System.out.println(list);
        System.out.println();
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println();
        System.out.println("-------------------");
        System.out.println("ArrayList<E>");
        System.out.println("-------------------");
        /*
        ArrayList
        - garde l'ordre d'insertion
        - accépte le doublon
        - preferable si on fait plus de get()
        - non thread-safe
         */
        ArrayList<String> tab = new ArrayList<>();
        tab.add("A");
        tab.add("BB");
        tab.add("C");
        tab.add("D");
        tab.add("1");
        tab.add(1, "F");
        tab.set(1, "BBB");
        tab.forEach(System.out::println);
        System.out.println(tab.get(4));

        System.out.println();
        System.out.println("-------------------");
        System.out.println("LinkedList<E>");
        System.out.println("-------------------");
        /*
        LinkedList
        - LinkedList utile pour inserer un element au milieu de la list
        - maintient les pointeurs sur les elements
        - preferable si on fait plus de put
         */
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");
        linkedList.add(1, "D");
        linkedList.forEach(System.out::println);

        System.out.println();
        System.out.println("-------------------");
        System.out.println("CopyOnWriteArrayList<E>");
        System.out.println("-------------------");
        /*
        Class CopyOnWriteArrayList<E>
        - Thread-safe (cette classe est conçue pour fonctionner en multi-thread, les données sont synchronisés)
         */
        CopyOnWriteArrayList<Integer> numbers = new CopyOnWriteArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.forEach(System.out::println);

        System.out.println();
        System.out.println("-------------------");
        System.out.println("Vector<E>");
        System.out.println("-------------------");
        /*
        Vector
        - Thread-safe
         */
        Vector<String> strings = new Vector<>();
        strings.add("Java");
        strings.add("Go");
        strings.add("PHP");
        strings.add("Python");
        strings.forEach(System.out::println);
    }
}
