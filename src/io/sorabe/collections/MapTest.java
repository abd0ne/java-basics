package io.sorabe.collections;

import java.util.*;

public class MapTest {
    public static void main(String[] args) {
        // HashMap : sans ordre
        // Key: Value
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Abdon", 36);
        map.put("Sandy", 32);
        map.forEach((k,v)-> System.out.println(k + "'s age is "+v)); // BiConsummer is a functionnal interface, it takes 2 arguments and returns nothing

    }
}

