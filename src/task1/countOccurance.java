package task1;

import java.util.ArrayList;
import java.util.List;

public class countOccurance {
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

        System.out.println(countOccurance(fruits, "lemon"));
    }

    public static int countOccurance(List<String> fruits, String str) {
        int amount = 0;

        for (int i = 0; i < fruits.size(); i++) {
            if (fruits.get(i).contains(str)) {
                amount++;
            }
        }

        return amount;
    }
}
