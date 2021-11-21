package test;

import java.util.ArrayList;
import java.util.List;

public class Task2 implements Runnable {
	List<Integer> oddNumbers = new ArrayList<>();

	private int first;
	private int last;

	public Task2(String... params) {

		this.first = setFirst(params);
		this.last = setLast(params);
	}

	private int setLast(String[] params) {
		return Math.max(Integer.parseInt(params[0]), Integer.parseInt(params[1]));
	}

	private int setFirst(String[] params) {
		return Math.min(Integer.parseInt(params[0]), Integer.parseInt(params[1]));
	}

	@Override
	public void run() {
		if (first == last) return;
		if (first % 2 == 0) {
			first++;
		}
		for (int i = first; i < last+1; i++){
			if (i % 2 != 0) oddNumbers.add(i);
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
//		int l = Integer.parseInt(bufferedReader.readLine().trim());
//
//		int r = Integer.parseInt(bufferedReader.readLine().trim());
//
//		List<Integer> result = Result.oddNumbers(l, r); //extract only odd numbers
//
//		bufferedWriter.write(
//				result.stream()
//						.map(Object::toString)
//						.collect(joining("\n"))
//						+ "\n"
//		);
//
//		bufferedReader.close();
//		bufferedWriter.close();
//	}