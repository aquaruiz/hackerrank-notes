package warm_up.letters.warm_up.hiker;

import java.util.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here

        char up = 'U';
        char down = 'D';
        int seaLevel = 0;
        int currentState = 0;
        int valleyCount = 0;

        char[] pathArr = path.toCharArray();

        for (int i = 0; i < steps; i++) {
            char step = pathArr[i];

            if (step == up){
                currentState++;
            } else if (step == down) {
                currentState--;
            }

            if (currentState == seaLevel) {
                if (step == up) {
                    valleyCount++;
                }
            }
        }

        return valleyCount;
    }

}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int steps = Integer.parseInt(scanner.nextLine().trim());

        String path = scanner.nextLine();

        int result = Result.countingValleys(steps, path);

        System.out.println(result);
    }
}
