package com.btclinet.interview2023;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortCountry {

	public static void main(String[] args) {
		List<Country>countryList=new ArrayList<>();
		countryList.add(new Country(91,"India"));
		countryList.add(new Country(92,"USA"));
		countryList.add(new Country(93,"China"));
		countryList.add(new Country(97,"Pakistan"));
		System.out.println(countryList);
		List<Country>sortCountry=countryList.stream()
		//.sorted(Comparator.comparing(Country::getCountryId))
				.sorted(Comparator.comparing(Country::getCountryId).reversed())
		.collect(Collectors.toList());
		for(Country country:sortCountry) {
			System.out.println(country.getCountryName()+"(Id:"+country.getCountryId()+")");
		}

	}

}
