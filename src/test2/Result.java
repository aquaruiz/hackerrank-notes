package test2;

import java.util.List;
import java.util.Locale;

public class Result {
	/*
	 * Complete the 'findNumber' function below.
	 *
	 * The function is expected to return a STRING.
	 * The function accepts following parameters:
	 *  1. INTEGER_ARRAY arr
	 *  2. INTEGER k
	 */

	public static String findNumber(List<Integer> arr, int k) {
		return arr.contains(k) ?
		"YES" :
		"NO";
	}
}
