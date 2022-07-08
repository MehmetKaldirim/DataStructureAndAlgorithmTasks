import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task12_TwoSum {
    public static void main(String[] args) {
        int[] myarray1 = {-1, 5, 10, 20, 28, 3};
        int[] myarray2 = {26, 134, 135, 15, 17,11};

        System.out.println(Arrays.toString(twoSum2(myarray1, 9)));
        System.out.println(Arrays.toString(twoSum1(myarray2, 32)));
    }

    private static int[] twoSum1(int[] array, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i =0; i<array.length;i++){
            int potentialMatch  = target-array[i];
            if(map.containsKey(potentialMatch)) return new int[] {i, map.get(potentialMatch)};
            else map.put(array[i],i);

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