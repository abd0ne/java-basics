package base.java.statics;
/*
 - static est utilisable pour des variables, méthodes, classes internes ou blocs de code.
 - static est utilisé pour les variables/ méthodes de classe.
   Ces variables/méthodes n'appartiennent pas à une instance particulière de la classe.
 - pas besoin d'instance pour accéder aux variables/méthodes statics
 */
public class Main {
    public static void main(String[] args) {
        // créer instances
        new Personne("A");
        new Personne("B");
        // appel méthode static
        System.out.println(Personne.getNombreTotalPersonne());
    }
}
