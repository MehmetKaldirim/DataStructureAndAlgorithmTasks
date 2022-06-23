public class Task06_OddPrymid {
    public static void main(String[] args) {
        System.out.println(rowSumOddNumbers(5));
    }


    public static int rowSumOddNumbers(int n) {
        return (int) Math.pow(n, 3);
    }
}
/*Code war
             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)
1 -->  1
2 --> 3 + 5 = 8
*/