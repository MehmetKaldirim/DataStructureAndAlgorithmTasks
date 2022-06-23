public class Task07_SquareNumber {
    public static void main(String[] args) {
        int num = 27;
        System.out.println("Is the number perfect square " + isSquare(num));
        System.out.println(Math.sqrt(num)-Math.floor(Math.sqrt(num)));
        System.out.println(Math.sqrt(num));
        System.out.println(Math.floor(Math.sqrt(num)));

    }

    public static boolean isSquare(int n) {

        return Math.sqrt(n) % 1 ==0;
        //return Math.sqrt(n)-Math.floor(Math.sqrt(n))
    }

}

//perfect square codewar