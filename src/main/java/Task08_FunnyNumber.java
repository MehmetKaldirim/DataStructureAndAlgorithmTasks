public class Task08_FunnyNumber {


    public static void main(String[] args) {
        int a = 695;
        int b = 2;
        //System.out.println(digPow(a,b));
        System.out.println(pigDow(a,b));
    }

    public static long pigDow (int n , int p){
       int count =0;
       double result = 0;
       int power =1;
        while(n/power >= 1){
            power *=10;
            count ++;
        }
        int m = n;
        while(count > 0  ){
            power /=10;
            result += Math.pow(n/power,(p));
            n = n % power;
            count--;
            p++;
        }
       return result % m == 0 ? m : -1  ;
    }



        public static long digPowString(int n, int p) {
            String intString = String.valueOf(n);
            long sum = 0;
            for (int i = 0; i < intString.length(); ++i, ++p)
                sum += Math.pow(Character.getNumericValue(intString.charAt(i)), p);
            return (sum % n == 0) ? sum / n : -1;
        }



}


/*Some numbers have funny properties. For example: //codewar


89 --> 8¹ + 9² = 89 * 1

695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2

46288 --> 4³ + 6⁴+ 2⁵ + 8⁶ + 8⁷ = 2360688 = 46288 * 51

Given a positive integer n written as abcd... (a, b, c, d... being digits) and a positive integer p

we want to find a positive integer k, if it exists, such that the sum of the digits of n taken to the successive powers of p is equal to k * n.
In other words:*/