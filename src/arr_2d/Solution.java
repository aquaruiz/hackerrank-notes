package arr_2d;
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

class Result {

    /*
     * Complete the 'hourglassSum' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int hourglassSum(List<List<Integer>> arr) {
        // Write your code here
        List<Integer> results = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.get(i).size(); j++) {
                results.add(calcHourglass(i,j, arr));
            }
        }

        return Collections.max(results);
    }

    private static Integer calcHourglass(int i, int j, List<List<Integer>> arr) {
        if (i > arr.size() - 3 || j > arr.size() - 3) {
            return Integer.MIN_VALUE;
        }

        return arr.get(i).get(j) + arr.get(i).get(j+1) + arr.get(i).get(j+2)
                + arr.get(i+1).get(j+1)
                + arr.get(i+2).get(j) + arr.get(i+2).get(j+1) + arr.get(i+2).get(j+2);
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, 6).forEach(i -> {
                arr.add(
                    Stream.of(scanner.nextLine().trim()
                                    .replaceAll("\\s+$", "")
                                    .split(" "))
                            .map(Integer::parseInt)
                            .collect(toList())
            );
        });

        int result = Result.hourglassSum(arr);

        System.out.println(result);
    }
}
