package dataStrProblems;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class HashingFunction {
	static int[] arr;

	public static void main(String[] args) {
		HashLogic h = new HashLogic();
		HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
		String readMessage = "";
		try {
			readMessage = h.readFile(
					"C:\\Users\\tyagi\\eclipse-workspace\\DataStrLearningProblems\\src\\dataStrProblems\\hashlist");
		} catch (IOException e) {
			e.printStackTrace();
		}
		String[] str = readMessage.split(",");
		arr = new int[str.length];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = Integer.parseInt(str[i]);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Getting Keys");
		for (int i = 0; i < arr.length; i++) {
			hash.add(arr[i], arr[i]);
		}
		hash.show();
		System.out.println("\nEnter Key to Search: ");
		Scanner S = new Scanner(System.in);
		int key = S.nextInt();
		if (hash.get(key) != null) {
			hash.remove(key);
		} else {
			hash.add(key, key);
		}
		S.close();
		hash.show();
		try {
			h.writeFile(
					"C:\\Users\\tyagi\\eclipse-workspace\\DataStrLearningProblems\\src\\dataStrProblems\\hashlistoutput",
					hash.returnListInString());
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
