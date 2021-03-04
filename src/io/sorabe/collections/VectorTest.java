package io.sorabe.collections;

import java.util.Vector;

/*
Vector implements List and extends Stack
Semblable à ArrayList mais synchronisé
met à jour avec set en precisant l'index
 */
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> vectors = new Vector<>();
        vectors.add("Abdon");
        vectors.add("Sandy");
        vectors.add("Mama");
        vectors.set(1,"Nicaise");
        System.out.println(vectors);
    }
}
