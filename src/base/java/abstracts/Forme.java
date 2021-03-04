package base.java.abstracts;

abstract public class Forme {
    abstract public double aire();
    abstract protected String show();
    /*
    On peut ajouter de constructeur dans une classe abstract
     */
    public Forme() {
        System.out.println("Abstract init ...");
    }
    /*
    On peut ajouter de methode avec contenu dans une classe abstract
     */
    public String toto(){
        return "Je suis toto";
    }
}
