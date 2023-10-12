package com.nt.streamapi;

import java.util.ArrayList;

public class ForEAchTest {

	public static void main(String[] args) {
		ArrayList<Object>al=new ArrayList<>();
		al.add(12);
		al.add(new A(1,2));
		al.add("vaibhav");
		al.add(4);
		al.add(6);
		al.add(5);
		al.add('v');
		al.add(5);
		al.add("A");
		al.add("V");
		al.add("D");
		al.add("S");
		System.out.println(al);
		for(Object ele:al) {
			if(ele instanceof Integer) 
			System.out.println("Number:"+ele);
		
		}
		System.out.println();
		for(Object ele:al) {
			if(ele instanceof String) 
			System.out.println("String:"+ele);
		
		}
		
	}

}
