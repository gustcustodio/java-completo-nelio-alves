package secao17.set;

import java.util.HashSet;
import java.util.Set;

public class Aula184a {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("TV");
        set.add("Notebook");
        set.add("Tablet");

        System.out.println(set.contains("Notebook"));

        for (String s : set) {
            System.out.println(s);
        }
    }
}
