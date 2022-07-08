import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Task13_MultiplicativePersistence {


    public static void main(String[] args) {
        Random random = new Random();
        // generate random number from 0 to 3
        int num = random.nextInt(Integer.MAX_VALUE);


        System.out.println( "number is " + num + " and solution "+ persistence1(num) + " = " + persistence2(num) + " = " + persistence3(num));
    }

    public static long persistence1(long n) {
        List<Integer> digits = String.valueOf(n).chars().map(Character::getNumericValue).boxed()
                .collect(Collectors.toList());

        if (digits.size() <= 1) return 0;
        int i = 0;
        int newNum = 1;
        while (i < digits.size()) {
            newNum *= digits.get(i);
            i++;
        }

        return persistence1(newNum) + 1;
    }
    public static int persistence2(long n) {
        long m = 1, r = n;

        if (r / 10 == 0) {
            return 0;
        }
        for(r = n; r!= 0; r /=10){
            m *= r % 10;
        }
        //System.out.println(m);
        return persistence2(m) + 1;
    }
    public static int persistence3(long n) {
        if (n < 10) return 0;
        Integer num = String.valueOf(n).chars().map(Character::getNumericValue).boxed()
                .reduce(1, (a, b) -> a * b);
        return persistence3(num) + 1;
    }
}
