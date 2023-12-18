package DiagonalDifference;

import java.util.List;

public class Solution1 {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int primaryDiagSum = 0;
        int secondaryDiagSum = 0;
        int n = arr.size();

        // Calcular la suma de la diagonal primaria y secundaria
        for (int i = 0; i < n; i++) {
            primaryDiagSum += arr.get(i).get(i);
            secondaryDiagSum += arr.get(i).get(n - i - 1);
        }

        // Calcular la diferencia absoluta entre las sumas de las diagonales
        return Math.abs(primaryDiagSum - secondaryDiagSum);
    }

    /*
     * La matriz se números enteros en este caso esta conformada por una lista que
     * contiene listas de enteros.
     * La lista arr por ejemplo podría contener:
     * 
     * List<List<Integer>> arr = new ArrayList<>();
     * arr.add(Arrays.asList(11, 2, 4));
     * arr.add(Arrays.asList(4, 5, 6));
     * arr.add(Arrays.asList(10, 8, -12));
     * 
     * lo que quedaría conformado como
     * { 11 2 4
     * 4 5 6
     * 10 8 -12}
     * 
     * la forma de resolver la diferencia absoluta es restando la suma de 11 + 5 +
     * -12 y 4 + 5 + 10.
     * Esto lo haremos recorriendo los elementos que se encuentran en las
     * coordenadas get(x).get(x), en la primera iteración
     * sera 0 -0 , en la segunda 1 - 1 y en la tercera 2 - 2. La diagonal secundaria
     * tiene coordenadas get(x).get(tamaño - x - 1)
     * en la primera iteración 0 - 2, en la segunda 1 - 1 y en la tercera 2 - 0
     * 
     * 
     */
}
