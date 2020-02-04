package com.codewardev;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class Kata {

	public static String sortTheInnerContent(String words) {
		for(String x:words.split(" ")) {
			String word = x.substring(1, x.length()-1);
			word = Arrays.stream(word.split("")).sorted(Collections.reverseOrder()).collect(Collectors.joining());
			System.out.println("X: "+x+" to "+word);
		}
		return null;
	}

}
