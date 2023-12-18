package LonelyInteger;

import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Solution1 {

    /*
     * Complete the 'lonelyinteger' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int lonelyinteger(List<Integer> a) {

        // se mapea cada número (mediante su identidad) a su aparición en la lista
        Map<Integer, Long> frequencyMap = a.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return frequencyMap.entrySet().stream()
                .filter(entry -> entry.getValue() == 1) // filtra el elemento que tiene frecuencia 1
                .map(Map.Entry::getKey)
                .findFirst().get();

    }

}