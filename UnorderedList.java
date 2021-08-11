package dataStrProblems;

import java.io.*;
import java.util.Scanner;


public class UnorderedList {
	public static void main(String[] args) {
		DataStructure d = new DataStructure();
		LinkedList<String> list = new LinkedList<String>();
		String[] strArray = null;
		try {
			strArray = d.readFile(
					"C:\\Users\\tyagi\\eclipse-workspace\\DataStrLearningProblems\\src\\dataStrProblems\\names")
					.split(",");
		} catch (IOException e) {
			e.printStackTrace();
		}
		int size = strArray.length;
		for (int i = 0; i < strArray.length; i++) {
			list.add(strArray[i]);
		}
		System.out.println(list.show());

		Scanner S = new Scanner(System.in);
		System.out.println("Enter key to search : ");
		String key = S.next();
		size = list.searchNode(key, size);
		System.out.println(list.show());

		try {
			d.writeFile(
					"C:\\Users\\tyagi\\eclipse-workspace\\DataStrLearningProblems\\src\\dataStrProblems\\namesoutput",
					list.returnListInString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		S.close();
	}
}