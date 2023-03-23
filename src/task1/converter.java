package task1;

import java.util.ArrayList;
import java.util.List;

public class converter {
    public static void main(String[] args) {
        List resultList = toList(new int[]{1,2,3,4,5});

        for (Object integer : resultList) {
            System.out.println(integer);
        }
    }

    public static List toList(int[] intArray) {
        List<Integer> listResult = new ArrayList<>();

        for (int j : intArray) {
            listResult.add(j);
        }

        return listResult;
    }
}
