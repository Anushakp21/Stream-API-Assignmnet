package com;

import java.util.Arrays;
import java.util.List;

public class SumOfEven {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,5,4,6,7,2);
		int evenSum=list.stream()
		.filter(num -> num%2 ==0 )
		.mapToInt(n -> n).sum(); // Converts map of Stream of Integer to IntegerStream
		System.out.println(evenSum);
		
	}
}
