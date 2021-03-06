# Java - les bases 

C'est un "repository" qui contient différents "packages".  
Chaque "package" correspond une fonctionnalité de Java.

## Modules
    java-basics
        |--- autoboxing : Autoboxing (types primitifs > wrappers)
       
        |--- innerClasses : La classe interne est déclarée à l'intérieur d'une autre classe.
            Elle peut donc accéder aux membres de la classe contenante.

        |--- abstracts : Classe non instratiable, utile pour l'héritage

        |--- interfaces : Interface est une classe abstraite dont toutes les méthodes sont abstraites
            et dont tous les attributs sont constants
       
        |--- enum : Enum est une série de données constantes ayant un type sûr
       
        |--- statics :
            - static est utilisable pour des variables, méthodes, classes internes ou blocs de code.
            - static est utilisé pour créer des variables/ méthodes de classe. 
              Ces variables/méthodes n'appartiennent pas à une instance particulière de la classe.
        
        |---- trywithresources : try-with-resources permet de gérer proprement 
            la fermeture des ressources de manière simple et efficace
                try ( /* 1 - Création des ressources */ ) {
                    // 2 - Utilisation des ressources
                }
        
        |--- files:
            - BufferedWriter permet d'écrire dans un fichier
            - BufferedReader permet de lire un fichier

        |--- generics : 
            - Generics sont de classes qui sont typés au moment de la compilation.
            Autrement dit, ce sont des classes qui utilisent des typages en paramètres.
  
        |--- collections : 
            |--- ArrayList<E>
            |--- LinkedList<E>
            |--- CopyOnWriteArrayList<E>
            |--- Vector<E>
