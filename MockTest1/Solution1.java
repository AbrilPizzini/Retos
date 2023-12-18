package MockTest1;

import java.util.Collections;
import java.util.List;

public class Solution1 {

    public static int findMedian(List<Integer> arr) {

        Collections.sort(arr); // Ordena el array de enteros

        int size = arr.size();
        if (size % 2 != 0) {
            // Si el tamaño del array es impar, la mediana es el elemento central
            return arr.get(size / 2);
        } else {
            // Si el tamaño del array es par, la mediana es el promedio de los dos elementos
            // centrales
            int mid1 = arr.get(size / 2 - 1);
            int mid2 = arr.get(size / 2);
            return (mid1 + mid2) / 2;
        }

    }
}
