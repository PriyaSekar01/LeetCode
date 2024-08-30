import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RelativeRanks {

    public static String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            indexMap.put(score[i], i);
        }
        Arrays.sort(score);
        for (int i = 0; i < n / 2; i++) {
            int temp = score[i];
            score[i] = score[n - i - 1];
            score[n - i - 1] = temp;
        }
        for (int i = 0; i < n; i++) {
            int originalIndex = indexMap.get(score[i]);
            if (i == 0) {
                result[originalIndex] = "Gold Medal";
            } else if (i == 1) {
                result[originalIndex] = "Silver Medal";
            } else if (i == 2) {
                result[originalIndex] = "Bronze Medal";
            } else {
                result[originalIndex] = String.valueOf(i + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] scores = {10, 3, 8, 9, 4};
        String[] ranks = findRelativeRanks(scores);
        System.out.println(Arrays.toString(ranks));
    }
}
