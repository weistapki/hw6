package task1;

import java.util.ArrayList;
import java.util.List;

public class CalcOccurance {
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
        List<String> value = new ArrayList<>();

        for (int i = 0; i < fruits.size(); i++) {
            if(!value.contains(fruits.get(i))) {
                value.add(fruits.get(i));
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
