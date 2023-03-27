package task1;

import java.util.ArrayList;
import java.util.List;

public class CountOccurance {
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

        System.out.println(countOccurance(fruits, "lemon"));
    }

    public static int countOccurance(List<String> fruits, String name) {
        int amount = 0;

        for (String fruit : fruits) {
            if (fruit.contains(name)) {
                amount++;
            }
        }

        return amount;
    }
}
