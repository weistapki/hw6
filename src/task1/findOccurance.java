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

    public static List<StructureData> findOccurance(List<String> fruits) {
        List<StructureData> result = new ArrayList<>();
        List<String> bufferList = new ArrayList<>();

        for (int i = 0; i < fruits.size(); i++) {
            if(!bufferList.contains(fruits.get(i))) {
                bufferList.add(fruits.get(i));
                int count = 0;

                for (String fruit : fruits) {
                    if (fruits.get(i).equals(fruit)) {
                        count++;
                    }
                }

                result.add(new StructureData(fruits.get(i), count));
            }
        }

        return result;
    }
}
