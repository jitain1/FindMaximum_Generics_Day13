package com.bridgelabz;

public class FindMax {

	String checkMaximum(String x, String y, String z) {
		String max = x; //Assuming x is the largest (initially)

		if (y.compareTo(max) > 0)
			max = y; // y is the largest so far

		if (z.compareTo(max) > 0)
			max = z; // now z is the largest

		return  max;
	}

	public static void main(String[] args) {
		FindMax obj = new FindMax();
		System.out.println("The maximum String is : " + obj.checkMaximum("Apple", "Peach", "Banana"));
		
	}

}