package com.nt.test.Interview2023;

public class FindDivsibleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++) {
			if(i%3==0 && i%5==0)
			{System.out.println("BuzzPuzz");}
			
			if(i%5==0 )
			{System.out.println("Buzz");}
			if(i%3==0 )
			{System.out.println("Puzz");}
		}
		
	}

}
