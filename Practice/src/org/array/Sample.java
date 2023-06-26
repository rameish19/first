package org.array;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Sample {

	public static void main(String[] args) {
		
		String s1 = "happy";
		String s2 = "apryh";
		
		if (s1.length() == s2.length()) {
			
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			

			Arrays.sort(ch1);
			Arrays.sort(ch1);
			
			if (Arrays.equals(ch1, ch2)) {
				
				System.out.println("anagram");
				
			} else {
				
				System.out.println("char");

			}
			
		} else {
			
			System.out.println("not");

		}
		
		
		
		
		
		
		
		
		
		
		
	}
		
			
		

	

}
