import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task12_TwoSum {
    public static void main(String[] args) {
        int[] myarray1 = {10, 5, 7, 20, 28, -1};
        int[] myarray2 = {26, 134, 135, 15, 17,11};

        System.out.println(Arrays.toString(twoSum2(myarray1, 9)));
        System.out.println(Arrays.toString(twoSum1(myarray2, 32)));

        System.out.println(Arrays.toString(twoSum(myarray1, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> prevMap = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int indexNum = nums[i];
            int potantialMatch = target - indexNum;

            if (prevMap.containsKey(nums[i])) {
                return new int[] { prevMap.get(indexNum), i };
            }

            prevMap.put(potantialMatch, i);
        }

        return new int[] {};
    }

    private static int[] twoSum1(int[] nums, int target) {
        HashMap<Integer,Integer> potMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int potantialMatch = target-nums[i];
            if(potMap.containsKey(potantialMatch)){
                return new int[] {i,potMap.get(potantialMatch)};

            }
            else potMap.put(nums[i],i);
        }
        return new int[]{};
        }


    public static int[] twoSum2(int[] array, int target) {
        //Create HashMap
        Map<Integer, Integer> map = new HashMap<>();

        //Iterate over the array.
        // If a potential match exists return that indices else put the array value and index to map
        for (int i = 0; i < array.length; i++) {
            int potentialMatch = target - array[i];
            if (map.containsKey(potentialMatch)) return new int[]{i, map.get(potentialMatch)};
            else map.put(array[i], i);
        }
        return new int[]{};

    }




}

