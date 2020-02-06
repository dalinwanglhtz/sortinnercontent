package com.codewardev;


// https://www.codewars.com/kata/5898b4b71d298e51b600014b/train/java


public class Kata {

	public static String sortTheInnerContent(String words) {
		StringBuilder result = new StringBuilder();
		for(String x:words.split(" ")) {
			if(x.length() < 3) {
				result.append(x+" ");
			} else {
			result.append(x.charAt(0)+new StringBuilder()
					.append(x.substring(1, x.length()-1)
							.codePoints()
							.map(Character::toLowerCase)
							.sorted()
							.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append))
					.reverse()
					.toString()+x.charAt(x.length()-1)+" ");
			}
		}
		return result.toString().trim();
	}

}
