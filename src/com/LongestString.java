package com;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestString {
	public static void main(String[] args) {
		List<String> list =Arrays.asList("anu","tanu","manu");
		Optional<String> result = list.stream().max(Comparator.naturalOrder());
		if(result.isPresent())
			System.out.println("The Maximum String is :"+result.get());
	}
}
