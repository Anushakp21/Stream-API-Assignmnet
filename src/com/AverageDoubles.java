package com;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class AverageDoubles {
	public static void main(String[] args) {
		List<Double> list= Arrays.asList(1.9,1.2,12.3,1.7);
		OptionalDouble avg=list.stream().mapToDouble(n -> n).average();
		if(avg.isPresent())
		System.out.println("Average of List of Doubles is : "+avg.getAsDouble());
	}

}
