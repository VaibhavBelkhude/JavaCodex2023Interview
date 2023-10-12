package com.nt.test.Interview2023;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SumOfNumber {
	
public static void main(String[] args) {
	List<Integer>list=Arrays.asList(1,2,4,6,9,7,10,15,17,13);
	//SumOfNumber all number 
	Optional<Integer>sum=list. stream().reduce((a,b)->(a+b));
	//Optional<Integer>sum1=list. stream().reduce(). IntStream.range(1, 11);
	OptionalInt reduced =
			  IntStream.range(1, 11).reduce((a, b) -> a + b);
	List<Integer>sorted=list.stream().sorted().collect(Collectors.toList());
	
	List<Integer>dsorted=list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
	
	System.out.println(sum+"::"+reduced+"||"+sorted+"||"+dsorted);
	System.out.println(dsorted);
	// Find Even and Odd Number
	List<Integer>oddnum=list.stream().filter(a->a%2==1).collect(Collectors.toList());
	//List<Integer>oddnum=list.stream().reduce(a->a%2==1).collect(Collectors.toList());
	List<Integer>evennum=list.stream().filter(e->e%2==0).collect(Collectors.toList());
	System.out.println(evennum);
	System.out.println("odd:"+oddnum);
	//duplicate
	List<Integer>list3=Arrays.asList(1,2,4,6,9,7,2,4,6,10,15,17,13,4,15,17,13,6);
	Set<Integer>dup=list3.stream()
			
			.filter(e->Collections.frequency(list3, e)>1)
			//.sorted()
			.collect(Collectors.toSet());
	System.out.println(list3+"duplicate:-"+dup);
	
	//unique
		List<Integer>list4=Arrays.asList(1,2,4,6,9,7,2,4,6,10,15,17,13,4,15,17,13,6);
		Set<Integer>unique=list4.stream()
				
				.filter(e->Collections.frequency(list4, e)<=1)
				//.sorted()
				.collect(Collectors.toSet());
	//	Set<Integer>sum123=unique.stream().reduce((q,r)->(q+r)).collect(Collectors.toSet());
		System.out.println(list4+"unique:-"+unique);
	//find first 2 higest and lowest
	Optional<Integer> higest=list4.stream().sorted(Collections.reverseOrder()).distinct().skip(1).findFirst();
	System.out.println(list4+"higest:-"+higest);
	Optional<Integer> lowest=list4.stream().sorted().distinct().skip(0).findFirst();
	System.out.println(list4+"lowest:-"+lowest);
	List<Integer> distinct=list4.stream().sorted().distinct().collect(Collectors.toList());
	System.out.println(list4+"distinct:-"+distinct);

}
}
