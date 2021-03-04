package io.sorabe.autoboxing;
/*
Autoboxing : conversion des types primitifs vers types wrappers
Unboxing : wrappers > primitifs

Primitive Type | Wrapper Class
boolean             Boolean
byte                Byte
char                Character
float               Float
int                 Integer
long                Long
short               Short
double              Double
 */
public class Main {
    public static void main(String[] args) {
        Integer integer = new Integer(2); // pas necessaire d'instancer la class Integer
        Integer integer1 = 2;
        System.out.println(integer + integer1);
    }
}
