package com.nt.findlast;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurance {
public static void main(String[] args) {
	String s="Hello";
	Map<String,Long>occurance=Arrays.stream(s.split(""))
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(occurance);
	
	//duplicate element
	List<String>duplicate=Arrays.stream(s.split(""))
	.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
	.entrySet()
	.stream()
	.filter(e->e.getValue()==1)
	.map(Map.Entry::getKey)
	.collect(Collectors.toList());
			System.out.println(duplicate);
}
}
