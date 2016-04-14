package com.sooncode;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public int add(Integer... agrs) {
		int sum = 0;
		for (int i : agrs) {
			sum = sum + i;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int[] ies = {1,2,3,4};
		Test test = new Test();
		int sum = test.add(1,2,3,4);
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		 
		
	}
}
