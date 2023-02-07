package org.howard.edu.lsp.hw2;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.util.TreeMap;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		Map m1 = new HashMap();
		try (BufferedReader br = new BufferedReader(new FileReader("word.txt")) {
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				String[] words = line.split(" ");
				for (int i = 0; i < words.length; i++) {
					 if (m1.get(words[i]) == null) {
						 m1.put(words[i], 1);
					 } else {
						 int newValue = Integer.valueOf(String.valueOf(m1.get(words[i])));
						 newValue++;
						 m1.put(words[i], newValue); 
					 }
				}
				sb.append(System.lineSeparator());
				line = br.readLine();
			}
		}
		 Map<String, String> sorted = new TreeMap<String, String>(m1);
		 Scanner sc=new Scanner(System.in);
		 while(true){
			 System.out.println("2. Display");
			 int n=sc.nextInt();
			 if(n==2){
				 for (Object key : sorted.keySet()) {
					 System.out.println(key);	
				 }
			 }
				 }
			 }
	}
