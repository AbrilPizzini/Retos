package DiagonalDifference;

import java.util.List;
import java.util.stream.IntStream;

public class Solution2 {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int size = arr.size();

        // Suma de la diagonal principal
        int primaryDiagSum = IntStream.range(0, size)
                .map(i -> arr.get(i).get(i))
                .sum();

        // Suma de la diagonal secundaria
        int secondaryDiagSum = IntStream.range(0, size)
                .map(i -> arr.get(i).get(size - i - 1))
                .sum();

        // Diferencia absoluta entre las sumas de las diagonales
        return Math.abs(primaryDiagSum - secondaryDiagSum);
    }
}
