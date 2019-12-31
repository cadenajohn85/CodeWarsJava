//Greed is a dice game played with five six-sided dice. Your mission, should you choose to accept it, is to score a throw
//according to these rules. You will always be given an array with five six-sided dice values.
//        Three 1's => 1000 points
//        Three 6's =>  600 points
//        Three 5's =>  500 points
//        Three 4's =>  400 points
//        Three 3's =>  300 points
//        Three 2's =>  200 points
//        One   1   =>  100 points
//        One   5   =>   50 point
//A single die can only be counted once in each roll. For example, a "5" can only count as part of a triplet
//(contributing to the 500 points) or as a single 50 points, but not both in the same roll.

public class GreedIsGood {
    // Original Solution
//    public static int greedy(int[] dice){
//        int[] counts = new int[6];
//        for (int i = 0; i < dice.length; i++) {
//            for (int j = 1; j <= 6; j++) {
//                if (dice[i] == j) {
//                    counts[j-1] += 1;
//                }
//            }
//        }
//        int score = 0;
//        if (counts[0] >= 3) {
//            score += 1000;
//            counts[0] -= 3;
//        }
//        for (int k = 1; k < counts.length; k++) {
//            if (counts[k] >= 3) {
//                score += (k + 1) * 100;
//                counts[k] -= 3;
//            }
//        }
//        score += counts[0] * 100 + counts[4] * 50;
//        return score;
//    }

    // Refactor based on community submissions

    public static int greedy(int[] dice) {
        int counts[] = new int[7];
        for (int die : dice) counts[die]++;
        return counts[1]/3*1000 + counts[1]%3*100 + counts[2]/3*200 + counts[3]/3*300 + counts[4]/3*400 +
                counts[5]/3*500 + counts[5]%3*50 + counts[6]/3*600;
    }

    public static void main(String[] args) {
        System.out.println(greedy(new int[]{2,4,4,5,4}));
    }

}
