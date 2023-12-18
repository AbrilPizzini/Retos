package MinMaxSum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Arrays.asList(1, 48, 84, 87);// Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
                                                         // "").split(" "))
        // .map(Integer::parseInt)
        // .collect(Collectors.toList());

        Solution1.miniMaxSum(arr);
        Solution2.miniMaxSum(arr);

        bufferedReader.close();
    }

}
