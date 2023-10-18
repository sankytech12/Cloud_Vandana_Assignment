import java.util.HashSet;
import java.util.Set;

public class Pangram {

    public static void main(String[] args) {
        String s="thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(s));
    }

    static boolean checkIfPangram(String sentence) {
        Set<Character> alphabetSet = new HashSet<>();
        for (int i = 'a'; i <= 'z'; i++) {
            alphabetSet.add((char) i);
        }
        for (int i = 0; i < sentence.length(); i++) {
            alphabetSet.remove(sentence.charAt(i));
            if (alphabetSet.isEmpty())
                return true;
        }
        return false;
    }

}

/*
 Time complexity: 0(length of sentence)
 Space complexity: 0(1)
 */

