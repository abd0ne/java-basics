package base.java.collections;

import java.util.Comparator;

class TheComparator implements Comparator<String> {
    public int compare(String str1, String str2) {
        return str1.compareTo(str2);
    }
}
