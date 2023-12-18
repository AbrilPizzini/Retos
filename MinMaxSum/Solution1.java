package MinMaxSum;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Solution1 {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here

        int sum = 0;
        int min = Integer.MAX_VALUE; // Se inicializa la variable min con el Maximo Valor de Enteros para que sea
                                     // siempre menor
        int max = Integer.MIN_VALUE; // Se inicializa la variable max con el Minimo Valor de Enteros para que sea
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

        int minSum = sum - max; // La suma mínima excluye el número máximo
        int maxSum = sum - min; // La suma máxima excluye el número mínimo

        System.out.println(minSum + " " + maxSum);

    }

}
