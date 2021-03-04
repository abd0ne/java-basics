package base.java.collections;

import java.util.*;

/*
   (Interface)  Map
               ^
 (implements) HashMap, HashTable

 Map stocke les éléments sous forme de paire clé/valeur.
 Map n'autorise pas les clés en double. Par contre il autorise les valeurs en double
 */
public class MapCollection {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("-------------------");
        System.out.println("HashMap<K,V>");
        System.out.println("-------------------");
        /*
        HashMap
         - non synchronisé, il il faut utiliser Map map = Collections.synchronizedMap pour le rendre synchronisé
         - non thread-safe
         - autorise une clé null et plusieurs valeurs null
         - rapide
         */
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Java", 1);
        hashMap.put("Python", 2);
        hashMap.put("PHP", 3);
        hashMap.put("Go", 4);
        hashMap.forEach((k,v)-> System.out.println(k + "'s range is "+v));
        System.out.println();
        System.out.println("-------------------");
        System.out.println("Hashtable<K,V>");
        System.out.println("-------------------");
        /*
        Hashtable
         - synchronisé et ne peut pas être désynchronisé
         - thread-safe
         - n'autorise aucune clé ou valeur null
         - lent
         */
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(1, "Java");
        hashtable.put(2, "Python");
        hashtable.put(3, "PHP");
        hashtable.put(4, "Go");
        hashtable.forEach((k,v)-> System.out.println(v + " langage's range is " +k ));

    }
}

