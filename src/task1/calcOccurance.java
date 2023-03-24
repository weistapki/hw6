package task1;

import java.util.ArrayList;
import java.util.List;

public class calcOccurance {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
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

        calcOccurance(fruits);
    }

    public static void calcOccurance(List<String> fruits) {
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

                System.out.println(fruits.get(i) + ": " + count);
            }
        }
    }
}
