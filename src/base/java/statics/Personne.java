package base.java.statics;

public class Personne {
    // variable d'instance
    private String nom;
    // variable static : variable de classe
    private static int nombreTotalPersonne;

    public Personne(String nom) {
        this.nom = nom;
        nombreTotalPersonne++;
    }

    // méthode de classe
    public static int getNombreTotalPersonne() {
        return nombreTotalPersonne;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
