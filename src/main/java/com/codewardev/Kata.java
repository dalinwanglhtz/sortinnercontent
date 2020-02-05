package com.codewardev;

// https://www.codewars.com/kata/5898b4b71d298e51b600014b/train/java

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Kata {

	public static String sortTheInnerContent(String words) {
		System.out.println("Words: "+words);
		StringBuilder result = new StringBuilder();
		for(String x:words.split(" ")) {
			if(x.length() < 3) {
				result.append(x+" ");
				continue;
			}
			String word = x.substring(1, x.length()-1);
			word = Arrays.stream(word.split("")).sorted(Collections.reverseOrder()).collect(Collectors.joining());
			word = x.toCharArray()[0]+word+x.toCharArray()[x.length()-1];
			//System.out.println("X: "+x+" to "+word);
			result.append(word+" ");
		}
		return result.toString().trim();
	}

}
