package MinMaxSum;

import java.util.*;

class Solution1 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        long sum = 0;
        long min = Long.MAX_VALUE; // Se inicializa la variable min con el Maximo Valor de Enteros para que sea
                                   // siempre menor
        long max = Long.MIN_VALUE; // Se inicializa la variable max con el Minimo Valor de Enteros para que sea
                                   // siempre mayor

        for (Integer num : arr) {

            // El num en iteración se suma a la variable suma
            sum += num;

            // Decide si num es mayor al maximo numero, si es asi, se asigna num a max
            if (num > max) {
                max = num;
            }

            // Decide si num es menor al minimo, si es asi, se asigna num a min
            if (num < min) {
                min = num;
            }

        }

        long minSum = sum - max; // La suma mínima excluye el número máximo
        long maxSum = sum - min; // La suma máxima excluye el número mínimo

        System.out.println(minSum + " " + maxSum);

    }

}
