package org.byvaibhav.test;

import java.util.HashMap;
import java.util.Map;

public class MapCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String> map=new HashMap<>();
		map.put(1011, "Vaibhav");
		map.put(1012,"Ashwini");
		System.out.println(map);
		Map<Employee,String> employee=new HashMap<>();
		employee.put(new Employee(1012,"Vaibhav",45000.0), "SBT123");
		System.out.println(employee);

	}

}
