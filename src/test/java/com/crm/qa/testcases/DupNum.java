package com.crm.qa.testcases;

import java.util.Arrays;
import java.util.regex.Pattern;

public class DupNum {
	
	public static void main(String...s) {
		
		String input = "My Name is Priyaranjan";
		String[] words = input.split(" ");
		//System.out.println(Arrays.toString(words));
		Pattern pattern = Pattern.compile(" ");
		words = pattern.split(input);
		System.out.println(Arrays.toString(words));
		
	}

}
