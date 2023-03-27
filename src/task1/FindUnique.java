package task1;

import java.util.ArrayList;
import java.util.List;

public class FindUnique {
    public static void main(String[] args) {
        List<Integer> listDate = new ArrayList<>();
        listDate.add(11);
        listDate.add(22);
        listDate.add(22);
        listDate.add(10);
        listDate.add(3);
        listDate.add(3);
        listDate.add(4);
        listDate.add(4);
        listDate.add(8);
        listDate.add(4);
        listDate.add(5);

        List<Integer> result = findUnique(listDate);

        for (Integer integer : result) {
            System.out.println(integer);
        }
    }

    public static List<Integer> findUnique (List<Integer> listDate) {
        List<Integer> resultList = new ArrayList<>();

        for (Integer integer : listDate) {
            if (!resultList.contains(integer)) {
                resultList.add(integer);
            }
        }

        return resultList;
    }
}
