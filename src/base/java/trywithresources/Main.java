package base.java.trywithresources;
/*
Automatic Resource Management
Syntaxe ajoutée à partir de Java SE 7.0
try-with-resources permet de gérer proprement la fermeture des ressources de manière simple et efficace.
Pour créer une ressource, il faut implémenter ICloseable
 */
public class Main {
    public static void main(String[] args) {
        try(MyResource rs = new MyResource()) {
            System.out.println("No problem");
        } catch (MyException e){
            e.printStackTrace();
        }
    }
}
