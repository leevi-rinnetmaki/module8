import java.util.ArrayList;
import java.util.Arrays;

public class LambdaListThingy {
    static int sum=0;
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,5,8,20,15,3,12));
        System.out.println(list);

        list.removeIf(x -> x % 2 == 0);
        System.out.println(list);

        list.replaceAll(n -> n % 2 != 0 ? n * 2 : n);
        System.out.println(list);

        list.forEach(x -> sum += x);
        System.out.println(sum);
    }
}
