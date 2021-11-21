package test;

import java.util.Arrays;

public class Task3 implements Runnable {

	private int[] nums;

	public Task3(Object... params) {
		this.nums = (int[]) params[0];
	}

	@Override
	public void run() {
		int index = 0;

		if (nums.length == 0){
			return;
		}
		index++;
		if (nums.length == 0) {
			return;
		}
		int previousNum = nums[0];
		for (int i = 1; i < nums.length && index < nums.length; i++) {
			int currentNum = nums[i];
			if (currentNum != previousNum) {
				previousNum = nums[i];
				nums[index++] = previousNum;
			}
		}

		System.out.println("index: " + index);

	}

	public void print(){
		Arrays.stream(nums).forEach(System.out::println);
	}
}
