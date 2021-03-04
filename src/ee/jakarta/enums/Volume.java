package ee.jakarta.enums;
/*
Enum
Enum est une série de données constantes ayant un type sûr
Enum peut avoir des constructeurs et méthodes
 */
public enum Volume {
    LOW(10),MEDIUM(50),HIGH(100);
    private int value;

    // Toujours privé car aucune nouvelle instance ne peut être créée
    Volume(int value) {
        this.value = value;
    }

    // permet d'afficher les valeurs
    public String toString(){
        return String.valueOf(value);
    }
}
