package com;

import java.util.Arrays;
import java.util.List;

public class CountName {
	public static void main(String[] args) {
		List<String> list =Arrays.asList("janu","tanu","manu","janavi");
		int count=(int) list.stream().filter(s -> s.startsWith("j")).count();
		System.out.println("The names Strats with letter J is : "+count);
	}

}
