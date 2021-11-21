package test1;

import java.util.ArrayList;
import java.util.List;

public class Result {
	/*
	 * Complete the 'oddNumbers' function below.
	 *
	 * The function is expected to return an INTEGER_ARRAY.
	 * The function accepts following parameters:
	 *  1. INTEGER l
	 *  2. INTEGER r
	 */

	public static List<Integer> oddNumbers(int l, int r) {
		List<Integer> result = new ArrayList<>();
		if (l == r) {
			if (l % 2 == 1) result.add(l);
			return result;
		}
		if (l % 2 == 0) l++;
		for (int i = l; i <=r ; i += 2) {
			result.add(i);
		}
		return result;
	}
}
