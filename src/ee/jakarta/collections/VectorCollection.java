package ee.jakarta.collections;

import java.util.Vector;

/*
Vector implements List and extends Stack
Semblable à ArrayList mais synchronisé
met à jour avec set en precisant l'index
 */
public class VectorCollection {
    public static void main(String[] args) {
        Vector<String> vectors = new Vector<>();
        vectors.add("Java");
        vectors.add("Python");
        vectors.add("PHP");
        vectors.set(2,"Go"); // ça écrase la valeur en index 2
        System.out.println(vectors);
    }
}
