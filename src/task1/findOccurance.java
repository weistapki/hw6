package task1;

import java.util.ArrayList;
import java.util.List;

public class findOccurance {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("lemon");
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("apple");

        System.out.println(findOccurance(fruits));
    }

    public static List<StructureData> findOccurance(List<String> fruList) {
        List<StructureData> result = new ArrayList<>();
        List<String> bufferList = new ArrayList<>();

        for (int i = 0; i < fruList.size(); i++) {
            if(!bufferList.contains(fruList.get(i))) {
                bufferList.add(fruList.get(i));
                int count = 0;

                for (int j = 0; j < fruList.size(); j++) {
                    if(fruList.get(i).equals(fruList.get(j))) {
                        count++;
                    }
                }

                result.add(new StructureData(fruList.get(i), count));
            }
        }

        return result;
    }
}
