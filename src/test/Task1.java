package test;

import java.util.ArrayList;
import java.util.List;

public class Task1 implements Runnable {
	List<Integer> oddNumbers = new ArrayList<>();

	private int first;
	private int last;

	public Task1(String... params) {
		this.first = Integer.parseInt(params[0]);
		this.last = Integer.parseInt(params[1]);
	}

	@Override
	public void run() {
		for (int i = first; i < last+1; i++){
			oddNumbers.add(i);
		}
	}

	public void print(){
		oddNumbers.forEach(System.out::println);
	}
}
//	public static void main(String[] args) throws IOException {
//		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
//
//		int arrCount = Integer.parseInt(bufferedReader.readLine().trim());
//
//		List<Integer> arr = IntStream.range(0, arrCount).mapToObj(i -> {
//			try {
//				return bufferedReader.readLine().replaceAll("\\s+$", "");
//			} catch (IOException ex) {
//				throw new RuntimeException(ex);
//			}
//		})
//				.map(String::trim)
//				.map(Integer::parseInt)
//				.collect(toList());
//
//		int k = Integer.parseInt(bufferedReader.readLine().trim());
//
//		String result = Result.findNumber(arr, k); find if present in array YEs NO
//
//		bufferedWriter.write(result);
//		bufferedWriter.newLine();
//
//		bufferedReader.close();
//		bufferedWriter.close();
//	}