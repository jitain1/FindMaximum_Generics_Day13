package com.bridgelabz;

public class FindMax {

	<E extends Comparable<E>> E checkMaximum(E x, E y, E z) {
		E max = x; //Assuming x is the largest (initially)

		if (y.compareTo(max) > 0)
			max = y; // y is the largest so far

		if (z.compareTo(max) > 0)
			max = z; // now z is the largest

		return  max;
	}

	public static void main(String[] args) {
		FindMax Obj = new FindMax();
		System.out.println("The maximum Integer is : " +Obj.checkMaximum(1, 3, 5));
		
		System.out.println("The maximum Float is : " + Obj.checkMaximum(2.25, 5.480, 7.55));
		
		System.out.println("The maximum String is : " + Obj.checkMaximum("Apple", "Peach", "Banana"));
		
	}
}