package com.maiseenok.forth_homework.task1;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionalImp implements FunctionalInterface {

	@Override
	public List<Integer> convert(Integer[] mass) {
		Function<Integer[], List<Integer>> convert = x -> Arrays.asList(x);
		return convert.apply(mass);
	}

}
