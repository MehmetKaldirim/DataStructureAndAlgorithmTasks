public class Task14_SortString {
    public static void main(String[] args) {
        String str = "4of Fo1r pe6ople g3ood th5e the2";

        System.out.println(sortString(str));
    }

    private static String sortString(String str) {
        String[] strArray = str.split(" ");
        int num = 0;
        String temp = "";
        for (int i = 0; i < strArray.length; i++) {


            for (int j = 0; j < strArray[i].length(); j++) {
                int ch = strArray[i].charAt(j);
                if ((ch >= '0' && ch <= '9') && num > ch) { //if the character is between '0' to '9' then it's digit
                    num = ch;
                }


            }


        }
        return null;
    }
}