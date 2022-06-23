import java.util.HashMap;
import java.util.stream.Collectors;

public class Task05_DNAReplace {
    public static void main(String[] args) {
        System.out.println(makeComplement("ATTGC"));
        System.out.println(makeComplementWithMap("ATTGC"));
    }



    public static String makeComplement(String dna) {
        //Your code
        StringBuilder result = new StringBuilder(dna);
        for(int i=0; i<dna.length();i++) {
            if (dna.charAt(i) == 'A') result.setCharAt(i, 'T');
            if (dna.charAt(i) == 'T') result.setCharAt(i, 'A');
            if (dna.charAt(i) == 'C') result.setCharAt(i, 'G');
            if (dna.charAt(i) == 'G') result.setCharAt(i, 'C');
        }
            dna = result.toString();
        return dna;
    }

    public static String makeComplementWithMap(String dna) {
        HashMap<Character, Character> dnaMap = new HashMap<>(4);
        dnaMap.put('A', 'T');
        dnaMap.put('T', 'A');
        dnaMap.put('C', 'G');
        dnaMap.put('G', 'C');
        return dna.chars().mapToObj(c -> String.valueOf(dnaMap.get((char)c))).collect(Collectors.joining());

    }
    public static String makeComplementWithJacal(String dna) {

        return dna.replace('T','X').replace('A','T').replace('X','A').replace('C','X').replace('G','C').replace('X','G');

    }


}
/*
   input-->output
"ATTGC" --> "TAACG"
"GTAT" --> "CATA"
*/