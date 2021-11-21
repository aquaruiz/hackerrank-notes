package warm_up.letters.warm_up.letters;

import java.util.*;

import static java.util.stream.Collectors.joining;

class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static long repeatedString(String s, long n) {
        // Write your code here
        char a = 'a';
        s = s.toLowerCase(Locale.ROOT);
        int strLen = s.length();

        if (strLen == 1 && s.charAt(0) == a) {
            return n;
        }

        long aCount = 0;
        for (int i = 0; i < (strLen < n ? strLen : n); i++) {
            if (s.charAt(i) == a) {
                aCount++;
            }
        }

        if (strLen >= n || aCount == 0) {
            return aCount;
        }

        long nTimes = n / strLen;
        if (nTimes > 0) {
            aCount *= nTimes;
        }

        long nReminder = n % strLen;
        for (int i = 0; i < nReminder; i++) {
            if (s.charAt(i) == a) {
                aCount++;
            }
        }

        return aCount;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();

        long n = Long.parseLong(scanner.nextLine().trim());

        long result = Result.repeatedString(s, n);

        System.out.println(result);
    }
}
