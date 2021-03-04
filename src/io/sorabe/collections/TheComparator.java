package io.sorabe.collections;

import java.util.Comparator;

class TheComparator implements Comparator<String> {
    public int compare(String str1, String str2) {
        String first_Str;
        String second_Str;
        first_Str = str1;
        second_Str = str2;
        return second_Str.compareTo(first_Str);
    }
}
