package secao17.wildcard1;

import java.util.Arrays;
import java.util.List;

public class Aula181 {
    public static void main(String[] args) {
        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        System.out.println();

        List<String> myStrings = Arrays.asList("Maria", "Alex", "Bob");
        printList(myStrings);
    }

    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.println(obj);
        }
    }
}
