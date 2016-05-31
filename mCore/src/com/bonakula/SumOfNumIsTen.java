package com.bonakula;
public class SumOfNumIsTen {

	static int nums[] = { 2, 3, 1, 4, 2,9 };
	static int first = 0;
	static int next = 1;
	static boolean found = false;

	public static void main(String[] args) {

		found = numbersToCheck(first, next);
		if(!found){
			System.err.println("no numbers found..");
		}

	}

	private static boolean numbersToCheck(int i, int j) {
		
		if (!findNumberWithSumIsTen(i, j)) {
			first = first + 1;
			next = first + 1;
			if (next < nums.length) {
				numbersToCheck(first, next);
			}
		}
		
		return found;
	}

	private static boolean findNumberWithSumIsTen(int i, int j) {

		if (nums[i] + nums[j] == 10) {
			System.out.println("got the numbers..." + nums[i] + "  " + nums[j]);
			found = true;
			return true;
		} else if (nums.length-1 > j ) {
			next = j+1;
			findNumberWithSumIsTen(first, next);

		}
		return false;
	}

}
