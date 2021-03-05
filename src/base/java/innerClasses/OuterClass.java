package base.java.innerClasses;
/*
Fichiers compilés
OuterClass.class contient la classe OuterClass uniquement
OuterClass$StaticNestedClass.class contient la classe StaticNestedClass
OuterClass$InnerClass.class contient la classe InnerClass
 */
public class OuterClass {
    private int counter = 0; // on ne peut accéder dans une classe static
    private static String name = "Ray";
    private static int age = 20;
    // Une classe interne static ne peux accéder qu'aux membres statics de sa classe contenante(OuterClass).
    static class StaticNestedClass {
        static void hello() {
            System.out.printf("My name is %s and I am %d years old \n", name,age);
        }
    }
    // Une classe interne non statique peut accéder aux membres statiques de la classe
    // ainsi qu'aux membres de l'objet qui l'a créée
    class InnerClass {
        public InnerClass() {
            counter++;
        }
        public void hello() {
            System.out.println("InnerClass counter " + OuterClass.this.counter);
        }
    }
}
