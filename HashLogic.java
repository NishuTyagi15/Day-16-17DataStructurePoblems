package dataStrProblems;

import java.io.*;

public class HashLogic<K, V> {
	BufferedReader br;
		
	//Reading file and return in string
	public String readFile(String path) throws IOException {
		String str = "";
		BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
		str = bufferedReader.readLine();
		bufferedReader.close();
		return str;
	}
			
	//Writing string into file
	public String writeFile(String path, String str) throws IOException {
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
		bufferedWriter.write(str);
		bufferedWriter.close();
		return "\nWritten in File is Done!";
	}
}