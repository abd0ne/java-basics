# Java - les bases 

C'est un "repository" qui contient différents "packages".  
Chaque "package" correspond une fonctionnalité de Java.

## Modules
    java-basics
       |--- abstracts : Classe non instratiable, utile pour l'héritage
       
       |--- autoboxing : Autoboxing (types primitifs > wrappers)
       
       |--- interfaces : Interface est une classe abstraite dont toutes les méthodes sont abstraites
            et dont tous les attributs sont constants
       
       |--- enum : Enum est une série de données constantes ayant un type sûr
       
       |--- statics :
            - static est utilisable pour des variables, méthodes, classes internes ou blocs de code.
            - static est utilisé pour créer des variables/ méthodes de classe. 
              Ces variables/méthodes n'appartiennent pas à une instance particulière de la classe.
       
       |--- generics : 
            - Generics sont de classes qui sont typés au moment de la compilation.
            Autrement dit, ce sont des classes qui utilisent des typages en paramètres.
  
       |--- collections : 
            |--- ArrayList<E>
            |--- LinkedList<E>
            |--- CopyOnWriteArrayList<E>
            |--- Vector<E>
