package MinMaxSum;

import java.util.*;

class Solution2 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        // convierte la lista en un flujo de elementos, mapea cada elemento del flujo a
        // su representación como un entero primitivo, calcula la suma de todos los
        // elementos del flujo

        long sum = arr.stream().mapToLong(Long::valueOf).sum();

        // Encontrando el mínimo y el máximo

        long max = arr.stream()
                .mapToLong(Long::valueOf)
                .max()
                .orElse(0);

        long min = arr.stream()
                .mapToLong(Long::valueOf)
                .min()
                .orElse(0);

        long minSum = sum - max; // La suma mínima excluye el máximo
        long maxSum = sum - min; // La suma máxima excluye el mínimo

        System.out.println(minSum + " " + maxSum);

    }

}
