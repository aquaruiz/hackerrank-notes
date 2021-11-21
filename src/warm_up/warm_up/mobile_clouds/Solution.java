package warm_up.letters.warm_up.mobile_clouds;

import java.util.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'jumpingOnClouds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY c as parameter.
     */

    public static int jumpingOnClouds(List<Integer> c) {
        // Write your code here

        int safe = 0;
        int avoid = 1;
        int jumps = 0;
        int currentJump = 0;
        int maxJump = 2;

        for (int i = 0; i < c.size(); i++) {
            int currentCloud = c.get(i);
            if (currentCloud == safe) {
                currentJump++;

                if (currentJump == maxJump) {
                    currentJump = 0;
                    jumps++;
                }
            } else if (currentCloud == avoid) {
              if (currentJump < maxJump) {
                  currentJump = 0;
                  jumps++;
              }
            }
        }

        return jumps;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine().trim());

        List<Integer> c = Stream.of(scanner.nextLine().replaceAll("\\s+$", "")
                .split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        int result = Result.jumpingOnClouds(c);

        System.out.println(result);
    }
}
