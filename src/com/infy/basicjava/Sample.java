package com.infy.basicjava;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Sample {

	public static void main(String[] args) {
		String str = "Today is Friday";
		
		Map<String, Long> map =Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map);
				
	}

}
