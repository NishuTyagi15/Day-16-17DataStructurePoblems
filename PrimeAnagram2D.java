package dataStrProblems;

import java.util.Arrays;

public class PrimeAnagram2D {
	public static void main(String[] args) {
		int start = 0;
		int end = 100;

		int[][] primeAnagramNumber = new int[10][];

		int j1 = 0, j2 = 0;
		// declaration of array is done
		for (int i = 0; i < 10; i++) {
			for (int j = start; j <= end; j++) {
				if (isPrime(j)) {
					for (int k = j + 1; k < end; k++) {
						if (isPrime(k)) {
							if (isAnagram(String.valueOf(j), String.valueOf(k))) {
								j1 += 2;
							}
						}
					}

				}
			}
			primeAnagramNumber[i] = new int[j1];
			start = end + 1;
			end += 100;
			j1 = 0;
		}
		
		start = 0;
		end = 100;
		j1 = 0;
		// putting values in array
		for (int i = 0; i < 10; i++) {
			for (int j = start; j <= end; j++) {
				if (isPrime(j)) {
					for (int k = j + 1; k < end; k++) {
						if (isPrime(k)) {
							if (isAnagram(String.valueOf(j), String.valueOf(k))) {
								primeAnagramNumber[i][j2] = j;
								primeAnagramNumber[i][j2 + 1] = k;
								j2 += 2;
							}
						}
					}

				}
			}
			start = end + 1;
			end += 100;
			j2 = 0;
		}

		// printing array
		for (int i = 0; i < primeAnagramNumber.length; i++) {
			for (int j = 0; j < primeAnagramNumber[i].length; j++) {
				System.out.print(primeAnagramNumber[i][j] + " ");

			}
			if (primeAnagramNumber[i].length != 0)
				System.out.println();
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