package me.test.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		String[] list = {"f", "o", "o", "t", "bar"};
		
		List<String> l = Arrays.asList(list);
		String r = l.stream()
				.map(n -> String.valueOf(n))
				.collect(Collectors.joining());
		  
		System.out.println(r); 
			
	}

}
