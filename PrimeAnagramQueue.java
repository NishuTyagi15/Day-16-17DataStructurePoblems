package dataStrProblems;

import java.util.Arrays;

public class PrimeAnagramQueue {
	public static void main(String[] args) {
		int start = 0;
		int end = 1000;
		Queue<Integer> queue = new Queue<Integer>();
		// putting values in array

		for (int j = start; j <= end; j++) {
			if (isPrime(j)) {
				for (int k = j + 1; k < end; k++) {
					if (isPrime(k)) {
						if (isAnagram(String.valueOf(j), String.valueOf(k))) {
							queue.enQueue(j);
							queue.enQueue(k);
						}
					}
				}
			}
		}

		int tempSize = queue.size();
		for (int i = 0; i < tempSize; i++) {
			System.out.print(queue.get(i) + " ");
		}
	}
	
	//Method for finding prime number or not
	public static boolean isPrime(int num) {
		if (num == 0 || num == 1) {
			return false;
		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	
	//Method for finding two string are anagram or not
	public static boolean isAnagram(String str1, String str2) {
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		if (str1.length() != str2.length()) {
			return false;
		} else {
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			if (Arrays.equals(arr1, arr2)) {
				return true;
			}
		}
		return false;
	}
}