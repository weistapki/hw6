package task1;

import java.util.ArrayList;

public class Converter {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        ArrayList<Integer> convertNumbers = toList(nums);
        System.out.println(convertNumbers);
    }

    public static ArrayList<Integer> toList(int[] nums) {
        ArrayList<Integer> listResult = new ArrayList<>();

        for (int num : nums) {
            listResult.add(num);
        }

        return listResult;
    }
}
