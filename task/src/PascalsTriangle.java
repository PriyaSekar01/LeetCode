import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows <= 0) {
            return triangle;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currentRow = new ArrayList<>();

            currentRow.add(1);
            for (int j = 1; j < i; j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            currentRow.add(1);
           triangle.add(currentRow);
        }
        return triangle;
    }

    public static void main(String[] args) {
        PascalsTriangle solution = new PascalsTriangle();

        int numRows1 = 5;
        List<List<Integer>> result1 = solution.generate(numRows1);
        System.out.println("Output for numRows = " + numRows1 + ": " + result1);

        int numRows2 = 1;
        List<List<Integer>> result2 = solution.generate(numRows2);
        System.out.println("Output for numRows = " + numRows2 + ": " + result2);
    }
}

