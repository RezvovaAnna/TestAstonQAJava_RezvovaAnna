import java.util.ArrayList;
import java.util.Arrays;

public class EvenNumbers {
    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.print("Задан массив:");
        ArrayList<Integer> res = new ArrayList<>();
        System.out.println(Arrays.toString(data));
        for (int datum : data) {
            if (datum % 2 == 0) {
                res.add(datum);
            }
        }
        System.out.println("Четные числа: " + res);
    }

    }

