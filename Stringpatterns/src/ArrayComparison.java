import java.util.ArrayList;
import java.util.List;

public class ArrayComparison {
    public static void main(String[] args) {
        List<Integer> array1 = new ArrayList<>(3);
        array1.add(1);
        array1.add(2);
        array1.add(3);
        List<Integer> array2 = new ArrayList<>(3);

        array2.add(1);
        array2.add(7);
        array2.add(3);

        String result = compareArrays(array1, array2);
        System.out.println(result);
    }

    public static String compareArrays(List<Integer> array1, List<Integer> array2) {
        if (array1.size() != array2.size()) {
            return "Shanmugapriya, the arrays are not the same size.";
        }

        for (int i = 0; i < array1.size(); i++) {
            if (!array1.get(i).equals(array2.get(i))) {
                return "Shanmugapriya, the arrays have different values.";
            }
        }

        return "Shanmugapriya, the arrays have the same values.";
    }
}

