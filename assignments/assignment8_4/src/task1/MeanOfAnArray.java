package task1;

import java.util.ArrayList;
import java.util.Arrays;

public class MeanOfAnArray {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(2.0, 5.2, 8.9, 12.12, 15.5, 365.0));
        //ArrayList<Double> list = new ArrayList<>(Arrays.asList(2.0, 3.0, 4.0));

        System.out.println(list.stream().mapToDouble(Double::doubleValue).average().getAsDouble());
    }
}
