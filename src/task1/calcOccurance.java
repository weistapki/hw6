package task1;

import java.util.ArrayList;
import java.util.List;

public class calcOccurance {
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

        calcOccurance(fruits);
    }

    public static void calcOccurance(List<String> fruList) {
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

                System.out.println(fruList.get(i) + ": " + count);
            }
        }
    }
}
