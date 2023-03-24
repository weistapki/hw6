package task1;

import java.util.ArrayList;
import java.util.List;

public class converter {
    public static void main(String[] args) {
        int[] num = {1,2,3,4,5};
        List<Integer> convertNumbers = toList(num);
        System.out.println(convertNumbers);
    }

    public static ArrayList toList(int[] intArray) {
        ArrayList<Integer> listResult = new ArrayList<>();

        for (int num : intArray) {
            listResult.add(num);
        }

        return listResult;
    }
}
