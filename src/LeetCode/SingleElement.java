package LeetCode;

import java.util.HashMap;
import java.util.Map;

public class SingleElement {
    public static void singleNumber(int[] nums) {

        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int num : nums) {
            if (hashMap.containsKey(num)) {
                hashMap.put(num, hashMap.get(num) + 1);
            } else {
                hashMap.put(num, 1);
            }
        }
        int targetValue = 0;
        for (Map.Entry<Integer, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue() == 1) {
                targetValue = entry.getKey();
                // If you want only the first match, break here
                break;
            }
        }

        System.out.println(targetValue);
    }

    public static void main(String[] args) {
        singleNumber(new int[]{4, 1, 2, 1, 2});
    }
}
