package base.java.enums;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        for (Volume volume : Volume.values()) {
            System.out.println(volume);
        }
        System.out.println();
        // Stream Java 8
        Arrays.stream(Volume.values()).forEach(System.out::println);
    }
}
