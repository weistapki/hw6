package task1;

import java.util.ArrayList;
import java.util.List;

public class findUnique {
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

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }

    public static List<Integer> findUnique (List<Integer> myListInt) {
        List<Integer> resultList = new ArrayList<>();

        for (int i = 0; i < myListInt.size(); i++) {
            if(!resultList.contains(myListInt.get(i))) {
                resultList.add(myListInt.get(i));
            }
        }

        return resultList;
    }
}
