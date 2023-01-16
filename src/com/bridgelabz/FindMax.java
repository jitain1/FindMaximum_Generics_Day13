package com.bridgelabz;

import com.bridgelabz.FindMax;

public class FindMax <E> {

	<E extends Comparable<E>> E checkMaximum(E x, E y, E z) {
		E max = x; //Assuming x is the largest (initially)

		if (y.compareTo(max) > 0)
			max = y; // y is the largest so far

		if (z.compareTo(max) > 0)
			max = z; // now z is the largest

		return  max;
	}

	public static void main(String[] args) {
		FindMax<Integer> intObj = new FindMax<>();
		System.out.println("The maximum Integer is : " + intObj.checkMaximum(1, 7, 5));
		
		FindMax<Float> floatObj = new FindMax<>();
		System.out.println("The maximum Float is : " + floatObj.checkMaximum(2.25, 5.480, 9.55));
		
		FindMax<String> stringObj = new FindMax<>();
		System.out.println("The maximum String is : " + stringObj.checkMaximum("Apple", "Peach", "Banana"));
		
	}

}