package warm_up.letters.warm_up.socks;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int pileSize, List<Integer> socksPile) {
        // Write your code here
        List<Integer> foundSocks = new ArrayList<>();
        int pairs = 0;

        for (int i = 0; i < pileSize; i++) {
            int currentSock = socksPile.get(i);

            if (foundSocks.contains(currentSock)) {
                foundSocks.remove(Integer.valueOf(currentSock));
                pairs++;
            } else {
                foundSocks.add(currentSock);
            }
        }

        return pairs;
    }

}

public class Solution {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());

        List<Integer> ar = Stream.of(scanner.nextLine().replaceAll("\\s+$", "")
                        .split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.sockMerchant(n, ar);

        System.out.println(result);
    }
}
