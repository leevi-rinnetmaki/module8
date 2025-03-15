package task2;

import java.util.ArrayList;
import java.util.Arrays;

public class FilterEvenDoubleSum {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list);

        list.removeIf(x -> x % 2 == 0);
        System.out.println(list);

        list.replaceAll(x -> 2 * x);
        System.out.println(list);

        //list.stream().mapToInt(Integer::intValue).average().getAsint();
        System.out.println(list.stream().mapToInt(Integer::intValue).sum());
    }
}
