import java.util.*;

public class Task15_CheckIsThereDuplicateValue {

    public static void main(String[] args) {
        Integer arr[] = {1,7,2,3,4,1};

        System.out.println(brutalSolution(arr));
        System.out.println(containsDuplicateOptimalTime(arr));
        System.out.println(containsDuplicateSorting(arr));

    }
    public static boolean brutalSolution(Integer[] nums) {


        for (int i = 0; i < nums.length-1 ; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] ==nums[j] ){
                    return true;
                }
            }

        }
        return false;
    }

        public static boolean containsDuplicateOptimalTime(Integer[] nums) {
            Set<Integer> unique = new HashSet<>();
            for (int i = 0; i < nums.length ; i++) {
                if(unique.contains(nums[i])){
                    return true;
                } else {
                    unique.add(nums[i]);
                }

            }
            return false;
        }

    public static boolean containsDuplicateSorting(Integer[] nums) {
        List<Integer> listNums = Arrays.asList(nums);
        Collections.sort(listNums);
        for (int i = 0; i < nums.length-1 ; i++) {
            if(listNums.get(i) ==listNums.get(i+1) ){
                return true;
            }
        }
        return false;
    }

}
/*Given an integer array nums, return true if any value appears at least twice in the array, and return
false if every element is distinct.*/