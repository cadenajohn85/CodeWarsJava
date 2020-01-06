import java.util.Arrays;

public class HighestScoringWord {

    public static String high(String s) {
        String[] words = s.split(" ");
        String output = "";
        char[] letters;
        int score = 0, max = 0;
        for (String word : words) {
            letters = word.toCharArray();
            for (char letter : letters) {
                score += (int) letter - 96;
            }
            if (score > max) {
                max = score;
                output = word;
            }
            score = 0;
        }
        return output;
    }

    public static void main(String[] args) {
        System.out.println(high("take me to semynak"));
        System.out.println(high("what time are we climbing up to the volcano"));
    }

}
